package Datos;

import DTO.Factura;
import java.util.Date;

public class prueba {

    public static void main(String[] args) {
//        Conexion c = new Conexion();
//        c.establecerConexion();
        
        Factura f = new Factura();
        
        System.out.println( f.generarCodigo());
       String fecha = f.generarFecha(new Date());
        System.out.println(fecha);
    }
    
}
