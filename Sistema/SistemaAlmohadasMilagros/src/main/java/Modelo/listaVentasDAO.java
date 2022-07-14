package Modelo;

import DTO.Factura;
import DTO.listaVentas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class listaVentasDAO implements ConsultasImplements{
    
    Factura f = new Factura ();
    public List<listaVentas>  mostrarDatos()throws SQLException{
        List<listaVentas> lista = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        listaVentas lv ;
        try{
            int cant = 0;
            double dinero = 0;
            String fe = null;
            con = Conexion.establecerConexion();
            ps = con.prepareStatement(MOSTRARLISTAVENTAS_SP);
            rs = ps.executeQuery();
            String fechaAc = f.generarFecha(new Date());
            while(rs.next()){
                if (!fechaAc.equals(rs.getString(3))) {
                cant = rs.getInt(1);
                dinero =rs.getDouble(2);
                fe = rs.getString(3);
                }else{
                cant = 0;
                dinero = 0.0;
                fe = fechaAc;
                }
                
                lv = new listaVentas(cant,dinero,fe);
                lista.add(lv);
                break;
            }
        }
        catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
        return lista;
    }
    
    
}
