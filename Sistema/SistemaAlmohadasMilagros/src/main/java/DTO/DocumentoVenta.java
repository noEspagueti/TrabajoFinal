package DTO;

import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class DocumentoVenta {

    protected String fechaEmision;
    protected int codigoVenta;
    protected String TipoDocu;
    protected String OrdenRemision;
    static final String FORMATO_FECHA = "yyyy-MM-dd";

    //Método para generar código venta 
//    public int generarCodigo() {
//        int codigo = 0;
//        for (int i = 0; i < 5; i++) {
//
//            int numero;
//
//            int num = (int) (Math.random() * (11 - 1) + 1);
//            codigo += num;
//
//        }
//        return codigo;
//    }

    //generar fecha
    public String generarFecha(Date fecha) {
        SimpleDateFormat convertir = new SimpleDateFormat(FORMATO_FECHA);
        return convertir.format(fecha);
    }

    public abstract String GenerarOrdenResmion(int cont);

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public int getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
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
