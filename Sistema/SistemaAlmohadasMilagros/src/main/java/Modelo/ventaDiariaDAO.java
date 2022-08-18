package Modelo;

import DTO.Factura;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class ventaDiariaDAO implements ConsultasImplements {

    Factura f = new Factura();

    public int comprobarFecha() throws SQLException {
        Connection con1 = null;
        PreparedStatement ps1 = null;
        ResultSet rs1 = null;
        String fec;
        String fechaActual = f.generarFecha(new Date());
        int flag = 0;
        try {
            con1 = Conexion.establecerConexion();
            ps1 = con1.prepareStatement("select fecha from VentasDiarias");
            rs1 = ps1.executeQuery();

            while (rs1.next()) {
                fec = rs1.getString(1);
                if (fechaActual.trim().equals(fec.trim())) {
                    flag = 1;
                    break;
                }
                if (!fechaActual.trim().equals(fec.trim())) {
                    flag = 2;
                    break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return flag;

    }

    public int idVD() throws SQLException {
        int id = 0;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        //------------------------------
//        Connection con1 = null;
//        PreparedStatement ps1 = null;
//        ResultSet rs1 = null;
//        String fechAc = f.generarFecha(new Date());
//        int flag = 0;
        try {

            con = Conexion.establecerConexion();
            ps = con.prepareStatement("select IDVenta from VentasDiarias");
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }

            //------------------------
//             con1 = Conexion.establecerConexion();
//             ps1 = con1.prepareStatement("select fecha from VentasDiarias");
//             rs1 = ps1.executeQuery();
//             String f ;
//             while (rs1.next()) {
//                f = rs1.getString(1);
//                 if (fechAc.trim().equals(f.trim())) {
//                     flag = 1;
//                     break;
//                 }else{
//                     flag = 2;
//                     break;
//                 }
//            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(con);
        }

        if (comprobarFecha() == 2) {
            id++;
        } else if (comprobarFecha() == 1){
            id--;
        }

        return id;
    }

    public void insertarVentaDiaria(int canti) throws SQLException {
        Connection con = null;
        CallableStatement cs = null;
        try {
            int flag = 0;
            String fecha = f.generarFecha(new Date());
            con = Conexion.establecerConexion();
            
            if (comprobarFecha() == 2) {
                cs = con.prepareCall(INSERTARVENTADIARIA_SP);
                cs.setInt(1, idVD());
                cs.setInt(2, canti);
                cs.setString(3, fecha);
                cs.executeUpdate();
            }
            else if (comprobarFecha() == 1){
                cs = con.prepareCall(ACTUALIZARVENTADIARIA_SP);
                cs.setInt(1, idVD());
                cs.setInt(2, canti);
                cs.executeUpdate();
            }
           
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

}
