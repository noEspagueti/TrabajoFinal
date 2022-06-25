package DTO;

public class ProductoAlmohadas {

    protected int cod;
    protected String nombreProducto;
    protected String medida;
    protected String color;
    protected Double precioUnitario;
    protected Double precioTotal;
    protected int cantidad;

    public ProductoAlmohadas() {
    }

    public ProductoAlmohadas(String nombreProducto, String medida, String color, double precioUnitario) {

        this.nombreProducto = nombreProducto;
        this.medida = medida;
        this.color = color;
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecioUnitario() {

        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    
}
