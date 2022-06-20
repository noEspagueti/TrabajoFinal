package Datos;

import DTO.Factura;
import java.util.Date;

public class prueba {

    public static void main(String[] args) {
//        Conexion c = new Conexion();
//        c.establecerConexion();
////        
//        Conexion.establecerConexion();
        Factura f = new Factura();

//        for (int i = 0; i < 10; i++) {
//            System.out.println(f.generarCodigo());
//        }
    
        System.out.println(f.GenerarOrdenResmion(0));
//       String fecha = f.generarFecha(new Date());
//        System.out.println(fecha);
    }

}
