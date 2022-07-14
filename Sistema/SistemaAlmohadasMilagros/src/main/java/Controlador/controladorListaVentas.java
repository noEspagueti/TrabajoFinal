package Controlador;

import DTO.Factura;
import Modelo.Conexion;
import Modelo.listaVentasDAO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JLabel;

public class controladorListaVentas {

    listaVentasDAO lv = new listaVentasDAO();

    public void mostrarListaVenta(JLabel lblFechaActual, JLabel lblCantidadVentas, JLabel lblTotalVentas) throws SQLException {
        Factura f = new Factura();
        int cantidad  = lv.mostrarDatos().size();
        for (int i = 0; i < cantidad; i++) {
         
                lblFechaActual.setText(lv.mostrarDatos().get(i).getFecha());
                lblCantidadVentas.setText(String.valueOf(lv.mostrarDatos().get(i).getCantClientes()));
                lblTotalVentas.setText(String.valueOf(lv.mostrarDatos().get(i).getDineroTotal()));
       
         
        }
    }

}
