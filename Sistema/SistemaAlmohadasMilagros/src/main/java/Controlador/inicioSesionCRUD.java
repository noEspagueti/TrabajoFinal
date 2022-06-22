package Controlador;

import Modelo.Conexion;
import Modelo.ConsultasImplements;
import Vista.Menu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class inicioSesionCRUD  implements ConsultasImplements{

    public inicioSesionCRUD() {
    }
    
    
    
    public void iniciarSesion(String user, String pass, JFrame o) throws SQLException{
        Connection co = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Menu abrirMenu = new Menu();
        try {
            co = Conexion.establecerConexion();
            ps = co.prepareStatement(MOSTRARUSUARIOS_SP);
            rs = ps.executeQuery();
            int flag = 0;
            while (rs.next()) {
                if (user.trim().equals(rs.getString(1)) && pass.trim().equals(rs.getString(2))) {
                    flag = 1;
                    abrirMenu.setVisible(true);
                    o.dispose();
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
