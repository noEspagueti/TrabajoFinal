package DTO;
public class Cliente extends Persona{
    
    protected String ubicacion;
    protected int cantidadProducto;
    protected String RUC;
    protected String razonSocial;

    public Cliente() {
    }
    
    
    public Cliente(String nombre , String apellido , String dni) {
        super.nombre= nombre;
        super.apellido = apellido;
        super.DNI = dni;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    
    
}
