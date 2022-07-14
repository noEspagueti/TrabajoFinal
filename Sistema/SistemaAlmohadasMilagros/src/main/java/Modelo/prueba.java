/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelo;

import DTO.Factura;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Miguel
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        listaVentasDAO lv = new listaVentasDAO();
        for (int i = 0; i < lv.mostrarDatos().size(); i++) {
            System.out.println(lv.mostrarDatos().get(i).getFecha());
            System.out.println(lv.mostrarDatos().get(i).getDineroTotal());
            System.out.println(lv.mostrarDatos().get(i).getCantClientes());
        }
    }
    
}
