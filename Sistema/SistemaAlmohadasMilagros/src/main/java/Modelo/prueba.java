/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelo;

import DTO.Factura;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        registroEmpleadoDAO r = new registroEmpleadoDAO();
        for (int i = 0; i < r.mostrarTabla().size(); i++) {
            System.out.println(r.mostrarTabla().get(i).getFechaNacimiento());
        }

    }

}
