package DTO;

public class Factura extends DocumentoVenta {
    
    
    @Override
    public String GenerarOrdenResmion(int contador) {

        String re = String.format("%05d", contador); // 
        return "T-001-" + re;
    }

  
    
}
