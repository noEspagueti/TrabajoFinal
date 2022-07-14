package Modelo;

import DTO.Cliente;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ClienteDAO implements ConsultasImplements {
    ArrayList<Cliente> listaClientes = new ArrayList<>();   
    public void insertarCliente(Cliente c) throws SQLException {
        Connection con = null;
        CallableStatement cs = null;
        
        try {
            con = Conexion.establecerConexion();
            cs = con.prepareCall(INSERTARCLIENTE_SP);
            cs.setString(1, c.getDNI());
            cs.setString(2, c.getNombre());
            cs.setString(3, c.getApellido());
            cs.setString(4, c.getTelefono());
            cs.setString(5, c.getCorreo());
            cs.setString(6, c.getDireccion());
            cs.setString(7, c.getProvincia());
            int row = cs.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Registro Exitoso!");
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null, "No se pudo registrar");
        } finally {
            Conexion.close(cs);
            Conexion.close(con);
        }
    }

    public ArrayList<Cliente> listarCliente() throws SQLException {
        
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Cliente cliente;
        try {
            String dni, nombre, apellido, telefono, correo, direccion, provincia;
            con = Conexion.establecerConexion();
            ps = con.prepareStatement("select * from Cliente");
            rs = ps.executeQuery();
            while (rs.next()) {
                dni = rs.getString(1);
                nombre = rs.getString(2);
                apellido = rs.getString(3);
                telefono = rs.getString(4);
                correo = rs.getString(5);
                direccion = rs.getString(6);
                provincia = rs.getString(7);
                cliente = new Cliente(dni, nombre, apellido, telefono, correo, direccion, provincia);
                listaClientes.add(cliente);
            }

        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(con);
        }
        return listaClientes;
    }

   public void eliminarCliente(String dni) throws SQLException{
        Connection con = null;
        CallableStatement cs = null;
        try{
            con = Conexion.establecerConexion();
            cs = con.prepareCall(ELIMINARCLIENTE_SP);
            cs.setString(1, dni);
            int row = cs.executeUpdate();
            if (row>0) {
                JOptionPane.showMessageDialog(null, "Cliente eliminado");
            }
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }finally{
            Conexion.close(cs);
            Conexion.close(con);
        }
    }

}
