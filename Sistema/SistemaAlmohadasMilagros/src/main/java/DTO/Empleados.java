package DTO;

public  class Empleados extends Persona{
    protected String puesto;    
    protected String tel;    
    protected String Direccion;    
    protected String distrito;    
    protected String FechaNacimiento;    

    public Empleados() {
    }

    
    
     public Empleados(String nom,String ap,String puesto, String dni,String tel) {
        this.puesto = puesto;
        this.tel = tel;
        this.Direccion = Direccion;
        this.distrito = distrito;
        this.FechaNacimiento = FechaNacimiento;
        super.nombre = nom;
        super.apellido = ap ;
        super.DNI = dni;
    }
    
    public Empleados(String nom,String ap,String dni,String puesto, String tel, String Direccion, String distrito, String FechaNacimiento) {
        this.puesto = puesto;
        this.tel = tel;
        this.Direccion = Direccion;
        this.distrito = distrito;
        this.FechaNacimiento = FechaNacimiento;
        super.nombre = nom;
        super.apellido = ap ;
        super.DNI = dni;
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

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }


    
    
}
