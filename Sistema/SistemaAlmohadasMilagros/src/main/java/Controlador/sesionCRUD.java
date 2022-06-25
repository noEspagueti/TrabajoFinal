/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Conexion;
import static Modelo.ConsultasImplements.MOSTRARUSUARIOS_SP;
import Vista.Menu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class sesionCRUD {
    
    public void iniciarSesion(String user, String pass, JFrame a) throws SQLException {
        Connection co = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Menu abrirMenu = new Menu();
        EmpleadoCRUD em = new EmpleadoCRUD();
        try {
            co = Conexion.establecerConexion();
            ps = co.prepareStatement(MOSTRARUSUARIOS_SP);
            rs = ps.executeQuery();
            int flag = 0;
            while (rs.next()) {
                if (user.trim().equals(rs.getString(1)) && pass.trim().equals(rs.getString(2))) {
                    flag = 1;
                    abrirMenu.setVisible(true);
                    if (user.trim().equals("admin1")) {
                        
                        for (int i = 0; i < em.mostrarDatos().size(); i++) {
                            if (i == 0) {
                                abrirMenu.NombreEmpleado.setText(em.mostrarDatos().get(0).getNombre());
                                abrirMenu.apellidoEmpleado.setText(em.mostrarDatos().get(0).getApellido());
                                abrirMenu.txtEmpleado.setText(em.mostrarDatos().get(0).getNombre());
                                abrirMenu.puestoEmpleado.setText(em.mostrarDatos().get(0).getPuesto());
                                abrirMenu.DniEmpleado.setText(em.mostrarDatos().get(0).getDNI());
                                abrirMenu.telefonoEmpleado.setText(em.mostrarDatos().get(0).getTel());

                            }
                                                   }
                        
                    }
                    a.setVisible(false);
                    
                }
            }
            if (flag == 1) {
                JOptionPane.showMessageDialog(null, "Bienvenidos");
            } else {
                JOptionPane.showMessageDialog(null, "No existe esta cuenta", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null, "Error de conexion", "Error", JOptionPane.ERROR);
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(co);
        }
    }
}
