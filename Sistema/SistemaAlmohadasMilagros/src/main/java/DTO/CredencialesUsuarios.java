package DTO;

public class CredencialesUsuarios {
    
    
    protected int empleadoID;
    protected String user;
    protected String passWord;
    protected String puesto;
    protected String estado; 
    
    //Constructor
    public CredencialesUsuarios() {
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public int getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(int empleadoID) {
        this.empleadoID = empleadoID;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "CredencialesUsuarios{" + "empleadoID=" + empleadoID + ", user=" + user + ", passWord=" + passWord + ", estado=" + estado + '}';
    }
    
    
    
    
    
    
    
}
