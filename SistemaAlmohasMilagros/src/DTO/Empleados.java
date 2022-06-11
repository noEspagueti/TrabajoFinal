package DTO;

public  class Empleados extends Persona{
    protected int idEmpleado;
//    protected String puesto;

    public Empleados(int idEmpleado,String nombre, String apellido,String dni) {
        this.idEmpleado = idEmpleado;
//        this.puesto = puesto;
        super.nombre = nombre;
        super.apellido = apellido;
        super.DNI = dni;
    }
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

//    public String getPuesto() {
//        return puesto;
//    }
//
//    public void setPuesto(String puesto) {
//        this.puesto = puesto;
//    }
//    
    
    
}
