package Controlador;

import DTO.Factura;
import DTO.ProductoAlmohadas;
import Modelo.Conexion;
import Modelo.ConsultasImplements;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class detalleOrdenCRUD implements ConsultasImplements {
    
 
    public void insertarDetalle(int codOr,int codPro,Integer cantidad, double precioTotal) throws SQLException{
        Connection con = null;
        CallableStatement cs = null;
  
  
        try{
            con = Conexion.establecerConexion();
            cs = con.prepareCall(INSERTARDETALLEORDENES_SP);
            cs.setInt(1,codOr); // CÓDIGO ORDEN UNA VEZ POR ORDEN
            cs.setInt(2,codPro); // CODIGO PRODUCTO, incrementa
            cs.setInt(3,cantidad);//CANTIDAD DE PRODUCTO
            cs.setDouble(4,precioTotal); // PRECIO TOTAL POR CANTIDAD DE PRODUCTO
            cs.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }finally{
            Conexion.close(cs);
            Conexion.close(con);
        }
        
    }
    
    
    
}
