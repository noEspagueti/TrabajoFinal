package Modelo;

import DTO.Factura;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ventaDiariaDAO implements ConsultasImplements {

    Factura f = new Factura();

    //ultimo ID
    public int idVD() throws SQLException {
        int id = 0;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String fec = null;
        try {
            con = Conexion.establecerConexion();
            ps = con.prepareStatement("select IDVenta from VentasDiarias");
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(con);
        }
        id++;

        return id;
    }

    public void insertarVentaDiaria() throws SQLException {
        int id = 0;
        Connection con = null;
        CallableStatement cs = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        PreparedStatement psVD = null;
        ResultSet rsVD = null;
        String fec = null;
        int flag = 0;
        try {
            ps = con.prepareStatement("select IDVenta from VentasDiarias");
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);//ultimo id
            }

            psVD = con.prepareStatement("select fecha from VentasDiarias");
            rsVD = psVD.executeQuery();
            while (rsVD.next()) {
                if (rsVD.getString(1).equals(f.generarFecha(new Date()))) {
                    fec = rsVD.getString(1);
                    break;
                }
            }
            if (fec.equals(null)) {
                con = Conexion.establecerConexion();
                cs = con.prepareCall(INSERTARVENTADIARIA_SP);
                cs.setInt(1, idVD());
                cs.setInt(2, cantidadVenta());
                cs.setString(3, f.generarFecha(new Date()));
                flag = 2;

            }
            
            if (fec.equals(f.generarFecha(new Date()))) {
                id = idVD()-1;
                con = Conexion.establecerConexion();
                cs = con.prepareCall(ACTUALIZARVENTADIARIA_SP);
                cs.setInt(1, id);
                cs.setInt(2, cantidadVenta());
                flag = 1;
            }
            

            if (flag == 1 || flag == 2) {
                cs.executeUpdate();
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(cs);
            Conexion.close(con);
        }
    }

    public String fechaActual(Factura f) throws SQLException {
        String fecha = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            con = Conexion.establecerConexion();
            ps = con.prepareStatement("select fechaEmision from DocumentoVenta ");
            rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString(1).equals(f.generarFecha(new Date()))) {
                    fecha = rs.getString(1);
                    break;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(con);
        }
        return fecha;
    }

    public int cantidadVenta() throws SQLException {
        int cont = 0;
        Connection con = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            con = Conexion.establecerConexion();
            cs = con.prepareCall(MOSTRARCANTIDADVENTA_SP);
            cs.setString(1, f.generarFecha(new Date()));
            rs = cs.executeQuery();
            while (rs.next()) {
                if (f.generarFecha(new Date()).equals(fechaActual(f))) {
                    cont = rs.getInt(1);

                } else {
                    break;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return cont;
    }
}
