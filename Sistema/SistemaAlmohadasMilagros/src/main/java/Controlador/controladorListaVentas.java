package Controlador;

import DTO.Factura;
import Modelo.listaVentasDAO;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class controladorListaVentas {

    listaVentasDAO lv = new listaVentasDAO();

    public void mostrarListaVenta(JLabel lblFechaActual, JLabel lblCantidadVentas, JLabel lblTotalVentas) throws SQLException {
        Factura f = new Factura();
        int cantidad = lv.mostrarDatos().size();
        for (int i = 0; i < cantidad; i++) {

            lblFechaActual.setText(lv.mostrarDatos().get(i).getFecha());
            lblCantidadVentas.setText(String.valueOf(lv.mostrarDatos().get(i).getCantClientes()));
            lblTotalVentas.setText(String.valueOf(lv.mostrarDatos().get(i).getDineroTotal()));
        }
    }

    public void mostrarListaTabla(JTable listaVentaTabla) throws SQLException {
        DefaultTableModel modeloTablaVentas = new DefaultTableModel();
        modeloTablaVentas.addColumn("Empleado");
        modeloTablaVentas.addColumn("Cantidad");
        modeloTablaVentas.addColumn("Dinero");
        modeloTablaVentas.addColumn("Fecha");
        listaVentaTabla.setModel(modeloTablaVentas);
        Object[] columna = new Object[4];
        int cantidad = lv.mostrarlistaVentasTabla().size();
        for (int i = 0; i < cantidad; i++) {

                columna[0] = lv.mostrarlistaVentasTabla().get(i).getNombreEmpleado();
                columna[1] = lv.mostrarlistaVentasTabla().get(i).getCantClientes();
                columna[2] = lv.mostrarlistaVentasTabla().get(i).getDineroTotal();
                columna[3] = lv.mostrarlistaVentasTabla().get(i).getFecha();
                modeloTablaVentas.addRow(columna);
        }

    }

    public void BuscarFecha(JTable listaVentaTabla, JTextField buscarFecha) throws SQLException {

        DefaultTableModel modeloTablaVentas = new DefaultTableModel();
        modeloTablaVentas.addColumn("Empleado");
        modeloTablaVentas.addColumn("Cantidad");
        modeloTablaVentas.addColumn("Dinero");
        modeloTablaVentas.addColumn("Fecha");
        listaVentaTabla.setModel(modeloTablaVentas);
        Object[] columna = new Object[4];
        int cantidad = lv.mostrarlistaVentasTabla().size();
        int flag = 0;
        for (int i = 0; i < cantidad; i++) {
            if (buscarFecha.getText().equals(lv.mostrarlistaVentasTabla().get(i).getFecha())) {
                columna[0] = lv.mostrarlistaVentasTabla().get(i).getNombreEmpleado();
                columna[1] = lv.mostrarlistaVentasTabla().get(i).getCantClientes();
                columna[2] = lv.mostrarlistaVentasTabla().get(i).getDineroTotal();
                columna[3] = lv.mostrarlistaVentasTabla().get(i).getFecha();
                modeloTablaVentas.addRow(columna);
            } 
        }

    }

}
