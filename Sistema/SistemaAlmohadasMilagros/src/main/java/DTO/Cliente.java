package DTO;

public class Cliente extends Persona {

    //agregar provincia
    protected String Direccion;
    protected String RUC;
    protected String razonSocial;
    protected String provincia;
    protected String correo;
    protected String telefono;

    public Cliente() {
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String ubicacion) {
        this.Direccion = ubicacion;
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

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
