package Controlador;

import DTO.Empleados;
import Modelo.Conexion;
import Modelo.ConsultasImplements;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD implements ConsultasImplements {

    /*
      mostramos los datos del empleado (nombre,apellidos,dni,teléfono)
      con el fin de mostrar los datos en el menú
    
       - crear un procedimiento almacenado para la consulta de empleados
    
     */
//    JLabel dni,JLabel nom,JLabel ap,JLabel puesto,JLabel tel,JLabel a
    public List<Empleados> mostrarDatos() throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        sensionControlador s = new sensionControlador();
        ArrayList list = new ArrayList();
        Empleados em ;
        try {
            String nom;
            String ap;
            String pues;
            String dni;
            String tel;
            con = Conexion.establecerConexion();
            ps = con.prepareStatement(MOSTRARDATOSEMPLEADOS_SP);
            rs = ps.executeQuery();
           while(rs.next()) {
               
                nom = rs.getString(1); 
                ap = rs.getString(2);
                pues = rs.getString("Puesto");
                dni = rs.getString(4);
                tel = rs.getString(5);
             
                em = new Empleados(nom,ap,pues,dni,tel);

                list.add(em);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(con);
        }
        return list;
    }

   
}
