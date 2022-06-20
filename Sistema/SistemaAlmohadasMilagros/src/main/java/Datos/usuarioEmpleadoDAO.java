/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import DTO.CredencialesUsuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class usuarioEmpleadoDAO implements ConsultasImplements {

String u ; 
String p;

    public String getU() {
        return u;
    }

    public void setU(String u) {
        this.u = u;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }
    public void  comprobarUsuario(String user, String pass) throws SQLException {
        Connection co = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            co = Conexion.establecerConexion();
            ps = co.prepareStatement(MOSTRARUSUARIOS_SP);
            rs = ps.executeQuery();
            int flag = 0;
            while (rs.next()) {
                if (user.trim().equals(rs.getString(1)) && pass.trim().equals(rs.getString(2))) {
                    flag = 1;
                    
                }
            }
            if (flag == 1) {
                JOptionPane.showMessageDialog(null, "Bienvenidos");
                setU(rs.getString(1));
                setP(rs.getString(2));
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
