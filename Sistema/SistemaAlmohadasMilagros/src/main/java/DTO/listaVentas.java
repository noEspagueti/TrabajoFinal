package DTO;
public class listaVentas {
    int cantClientes;
    double dineroTotal;
    String fecha;

    public listaVentas() {
    }

    
    
    public listaVentas(int cantClientes, double dineroTotal, String fecha) {
        this.cantClientes = cantClientes;
        this.dineroTotal = dineroTotal;
        this.fecha = fecha;
    }
    
    

    public int getCantClientes() {
        return cantClientes;
    }

    public void setCantClientes(int cantClientes) {
        this.cantClientes = cantClientes;
    }

    public double getDineroTotal() {
        return dineroTotal;
    }

    public void setDineroTotal(double dineroTotal) {
        this.dineroTotal = dineroTotal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
