package Modelo;

import DTO.Empleados;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class registroEmpleadoDAO implements ConsultasImplements {

    public int idEmpleado() {
        int cod = 0;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = Conexion.establecerConexion();
            ps = con.prepareStatement("select EmpleadoID from Empleado");
            rs = ps.executeQuery();
            while (rs.next()) {
                cod = rs.getInt(1);
            }
        } catch (SQLException e) {

        }
        cod++;
        return cod;
    }

    public void insertarRegistro(JTextField NomEmp,
            JTextField ApellidoEmp, JTextField DNIEmp, JTextField TelefEmp,
            JTextField DireccEmp, JTextField DistriEmp, JTextField CumEmp,
            JTextField PuestoEmp) throws SQLException {

        Connection con = null;
        CallableStatement cs = null;
        String puesto1 = "Vendedor";
        String puesto2 = "Gerente de Operaciones";
        int codPues;
        try {
            con = Conexion.establecerConexion();
            cs = con.prepareCall(REGISTRAREMPLEADOS_SP);
            cs.setInt(1, idEmpleado());
            if (PuestoEmp.getText().trim().equals(puesto1.trim())) {
                codPues = 2;
                cs.setInt(2, codPues);
            } else if (PuestoEmp.getText().trim().equals(puesto2.trim())) {
                codPues = 1;
                cs.setInt(2, codPues);
            }
            cs.setString(3, NomEmp.getText());
            cs.setString(4, ApellidoEmp.getText());
            cs.setString(5, DNIEmp.getText());
            cs.setString(6, TelefEmp.getText());
            cs.setString(7, DireccEmp.getText());
            cs.setString(8, DistriEmp.getText());
            cs.setString(9, CumEmp.getText());
            cs.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Existoso");
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(cs);
            Conexion.close(con);
        }
    }

    public ArrayList<Empleados> mostrarTabla() throws SQLException {
        ArrayList<Empleados> lista = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Empleados em;
        try {
            String puesto = null;
            String tel;
            String Direccion;
            String distrito;
            String FechaNacimiento;
            String nom;
            String ap;
            String dni;
            con = Conexion.establecerConexion();
            ps = con.prepareStatement("select * from Empleado");
            rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getInt(2) == 1) {
                    puesto = "Gerente de Operaciones";
                } else if (rs.getInt(2) == 2) {
                    puesto = "Vendedor";
                }
                nom = rs.getString(3);
                ap = rs.getString(4);
                dni = rs.getString(5);
                tel = rs.getString(6);
                Direccion = rs.getString(7);
                distrito = rs.getString(8);
                FechaNacimiento = rs.getString(9);
                em = new Empleados(nom, ap, dni, puesto, tel, Direccion, distrito, FechaNacimiento);
                lista.add(em);
            }

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return lista;
    }

    public void eliminar(String dni) throws SQLException {
        Connection con = null;
        CallableStatement cs = null;
        try {
            con = Conexion.establecerConexion();
            cs = con.prepareCall(ELIMINAREMPLEADO_SP);
            cs.setString(1, dni);
            int row = cs.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Empleado eliminado");
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(cs);
            Conexion.close(con);
        }
    }

    public void actualizar(JTextField NomEmp,
            JTextField ApellidoEmp, JTextField DNIEmp, JTextField TelefEmp,
            JTextField DireccEmp, JTextField DistriEmp, JTextField CumEmp,
            JTextField PuestoEmp) throws SQLException {
        Connection con = null;
        CallableStatement cs = null;
        int cantidad = mostrarTabla().size();

        try {
            con = Conexion.establecerConexion();
            cs = con.prepareCall(ACTUALIZAREMPLEADO_SP);
            cs.setString(1, NomEmp.getText());
            cs.setString(2, ApellidoEmp.getText());
            cs.setString(3, TelefEmp.getText());
            cs.setString(4, DireccEmp.getText());
            cs.setString(5, DistriEmp.getText());
            cs.setString(6, CumEmp.getText());
            cs.setString(7, DNIEmp.getText());
            int row = cs.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Aztulización Completa");
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar", "Error", JOptionPane.ERROR);

            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }

    }
}
