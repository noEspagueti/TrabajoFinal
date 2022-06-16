package DTO;

import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class DocumentoVenta {

    protected String fechaEmision;
    protected String codigoVenta;
    protected String TipoDocu;
    protected String OrdenRemision;
    static final String FORMATO_FECHA = "yyyy/MM/dd";

    
    
     //Método para generar código venta 
    public String generarCodigo() {
        String codigo = " ";
        for (int i = 0; i < 5; i++) {

            int numero;
            numero = (int) (Math.random() * (3 - 1)) + 1;
            if (numero == 1) {
                char minus = (char) (Math.random() * (123 - 97) + 97);
                codigo += minus;
            } else if (numero == 2) {
                char mayus = (char) (Math.random() * (91 - 65) + 65);
                codigo += mayus;
            } else {
                int num = (int) (Math.random() * (11 - 1) + 1);
                codigo += num;
            }
        }
        return codigo;
    }

  //generar fecha
    public  String generarFecha(Date fecha) {
        SimpleDateFormat convertir = new SimpleDateFormat(FORMATO_FECHA);
        return convertir.format(fecha);
    }
    
    
    public abstract String GenerarOrdenResmion();

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(String codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public String getTipoDocu() {
        return TipoDocu;
    }

    public void setTipoDocu(String TipoDocu) {
        this.TipoDocu = TipoDocu;
    }

    public String getOrdenRemision() {
        return OrdenRemision;
    }

    public void setOrdenRemision(String OrdenRemision) {
        this.OrdenRemision = OrdenRemision;
    }

    
    
}
