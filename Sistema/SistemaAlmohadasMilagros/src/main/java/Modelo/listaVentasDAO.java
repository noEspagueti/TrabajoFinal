package Modelo;

import DTO.Factura;
import DTO.listaVentas;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class listaVentasDAO implements ConsultasImplements {

    Factura f = new Factura();

    public List<listaVentas> mostrarDatos() throws SQLException {
        List<listaVentas> lista = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        listaVentas lv;
        try {
            int cant = 0;
            double dinero = 0;
            String fe = null;
            con = Conexion.establecerConexion();
            ps = con.prepareStatement(MOSTRARLISTAVENTAS_SP);
            rs = ps.executeQuery();
            String fechaAc = f.generarFecha(new Date());
            while (rs.next()) {
                if (rs.getString(3).trim().equals(f.generarFecha(new Date()).trim())) {
                    cant = rs.getInt(1);
                    dinero = rs.getDouble(2);
                    fe = rs.getString(3);
                    break;
                } else {
                    cant = 0;
                    dinero = 0.0;
                    fe = fechaAc;
                }

            }
            lv = new listaVentas(cant, dinero, fe);
            lista.add(lv);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCantClientes() == 0 && lista.size() > 1) {
                lista.remove(i);
            }else{
                break;
            }
        }
        return lista;
    }

    public String mostrarfecha() throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String fe = null;
        try {
            con = Conexion.establecerConexion();
            ps = con.prepareStatement("select fechaEmision from DocumentoVenta");
            rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString(1).equals(f.generarFecha(new Date()))) {
                    fe = rs.getString(1);
                    break;
                } else {
                    fe = f.generarFecha(new Date());
                }
            }
        } catch (SQLException e) {

        }
        return fe;
    }
    
    public List<listaVentas> mostrarlistaVentasTabla() throws SQLException{
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        listaVentas lv ;
        ArrayList<listaVentas> lista = new ArrayList<>();
        try{
            con = Conexion.establecerConexion();
            ps = con.prepareStatement(MOSTRARLISTAVENTASTABLA_SP);
            rs = ps.executeQuery();
            String empleado;
            int cant;
            double dinero;
            String fecha;
            while  (rs.next()){
                empleado =rs.getString(1);
                cant = rs.getInt(2);
                dinero = rs.getDouble(3);
                fecha = rs.getString(4);
                lv = new listaVentas(cant, dinero, fecha, empleado);
                lista.add(lv);
            }
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }finally{
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(con);
        }
        return lista;
    }
    
//   public void buscarFecha(String fecha) throws SQLException {
//       Connection con = null;
//       CallableStatement cs = null;
//       try{
//           con = Conexion. establecerConexion();
//           cs = con.prepareCall(BUSCARFECHATABLAVENTA_SP);
//           cs.setString(1, fecha);
//           cs.executeUpdate();
//           
//       }catch(SQLException e){
//           e.printStackTrace(System.out);
//       }
//   }
    
}
