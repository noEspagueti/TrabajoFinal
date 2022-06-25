package DTO;

public  class Empleados extends Persona{
    protected String puesto;    
    protected String tel;    

    public Empleados() {
    }

    
    public Empleados(String nombre,String apellido,String pues ,String DNI , String tel) {
        this.puesto = pues;
        this.tel = tel;
        super.nombre = nombre;
        super.apellido = apellido;
        super.DNI = DNI;
    }


    
 

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }


    
    
}
