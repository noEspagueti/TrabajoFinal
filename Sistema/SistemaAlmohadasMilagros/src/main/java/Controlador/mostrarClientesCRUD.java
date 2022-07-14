package Controlador;

import DTO.Cliente;
import Modelo.ClienteDAO;
import Modelo.Conexion;
import static Modelo.ConsultasImplements.ACTUALIZARCLIENTE_SP;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class mostrarClientesCRUD {

    ClienteDAO cliente = new ClienteDAO();

    public void mostrarTabla(JTable tablaCliente) throws SQLException {
        DefaultTableModel modeloT = new DefaultTableModel();
        tablaCliente.setModel(modeloT);
        modeloT.addColumn("DNI");
        modeloT.addColumn("Nombres");
        modeloT.addColumn("Apellidos");
        modeloT.addColumn("Telefono");
        modeloT.addColumn("Correo");
        modeloT.addColumn("Direccion");
        modeloT.addColumn("Provincia");
        Object[] columna = new Object[7];
        int numeroRegistro = cliente.listarCliente().size();
        for (int i = 0; i < numeroRegistro; i++) {
            columna[0] = cliente.listarCliente().get(i).getDNI();
            columna[1] = cliente.listarCliente().get(i).getNombre();
            columna[2] = cliente.listarCliente().get(i).getApellido();
            columna[3] = cliente.listarCliente().get(i).getTelefono();
            columna[4] = cliente.listarCliente().get(i).getCorreo();
            columna[5] = cliente.listarCliente().get(i).getDireccion();
            columna[6] = cliente.listarCliente().get(i).getProvincia();
            modeloT.addRow(columna);
        }
    }

    public void mostrarPorDNI(JTextField dni, JTable tablaCliente) throws SQLException {
        int numeroRegistro = cliente.listarCliente().size();
        DefaultTableModel modeloT = new DefaultTableModel();
        tablaCliente.setModel(modeloT);
        modeloT.addColumn("DNI");
        modeloT.addColumn("Nombres");
        modeloT.addColumn("Apellidos");
        modeloT.addColumn("Telefono");
        modeloT.addColumn("Correo");
        modeloT.addColumn("Direccion");
        modeloT.addColumn("Provincia");
        Object[] columna = new Object[7];
        for (int i = 0; i < numeroRegistro; i++) {
            if (dni.getText().trim().equals(cliente.listarCliente().get(i).getDNI().trim())) {
                columna[0] = cliente.listarCliente().get(i).getDNI();
                columna[1] = cliente.listarCliente().get(i).getNombre();
                columna[2] = cliente.listarCliente().get(i).getApellido();
                columna[3] = cliente.listarCliente().get(i).getTelefono();
                columna[4] = cliente.listarCliente().get(i).getCorreo();
                columna[5] = cliente.listarCliente().get(i).getDireccion();
                columna[6] = cliente.listarCliente().get(i).getProvincia();
                modeloT.addRow(columna);
                break;
            }
        }
    }

    //Actualizar cliente
    public void seleccionarCliente(JTable tablaCliente, JTextField dni, JTextField nom, JTextField ap, JTextField te, JTextField co, JTextField di, JTextField pr) throws SQLException {
        int fila = tablaCliente.getSelectedRow();
        int cantidad = cliente.listarCliente().size();
        for (int i = 0; i < cantidad; i++) {
            if (fila == i) {
                dni.setText(cliente.listarCliente().get(i).getDNI());
                nom.setText(cliente.listarCliente().get(i).getNombre());
                ap.setText(cliente.listarCliente().get(i).getApellido());
                te.setText(cliente.listarCliente().get(i).getTelefono());
                co.setText(cliente.listarCliente().get(i).getCorreo());
                di.setText(cliente.listarCliente().get(i).getDireccion());
                pr.setText(cliente.listarCliente().get(i).getProvincia());
            }
        }

    }

    public void actualizarCliente(JTable tablaCliente, JTextField dni, JTextField nom, JTextField ap, JTextField te, JTextField co, JTextField di, JTextField pr) throws SQLException {
        Connection con = null;
        CallableStatement cs = null;
        int cantidad = cliente.listarCliente().size();

        try {
            con = Conexion.establecerConexion();
            cs = con.prepareCall(ACTUALIZARCLIENTE_SP);

            for (int i = 0; i < cantidad; i++) {
                cs.setString(1, dni.getText());
                cs.setString(2, nom.getText());
                cs.setString(3, ap.getText());
                cs.setString(4, te.getText());
                cs.setString(5, co.getText());
                cs.setString(6, di.getText());
                cs.setString(7, pr.getText());
                cs.executeUpdate();

            }

            seleccionarCliente(tablaCliente, dni, nom, ap, te, co, di, pr);
            JOptionPane.showMessageDialog(null, "Registros Aztualizados");
        } catch (Exception e) {
        } finally {
            Conexion.close(cs);
            Conexion.close(con);
        }

    }

    public void eliminarBotonCliente(JTextField dni) throws SQLException {
        cliente.eliminarCliente(dni.getText());

    }

    // Elimniar datos de la tabla
    public void eliminarDatos(JTable tablaListaCliente) throws SQLException {
          DefaultTableModel modeloT = new DefaultTableModel();
        tablaListaCliente.setModel(modeloT);
        modeloT.addColumn("DNI");
        modeloT.addColumn("Nombres");
        modeloT.addColumn("Apellidos");
        modeloT.addColumn("Telefono");
        modeloT.addColumn("Correo");
        modeloT.addColumn("Direccion");
        modeloT.addColumn("Provincia");

            int cantidad = cliente.listarCliente().size();
           
            Object[] columna = new Object[7];
            for (int j = 0; j < cantidad; j++) {
                columna[0] = "";
                columna[1] = "";
                columna[2] = "";
                columna[3] = "";
                columna[4] = "";
                columna[5] = "";
                columna[6] = "";
                modeloT.addRow(columna);
                
            }
        
    }

}
