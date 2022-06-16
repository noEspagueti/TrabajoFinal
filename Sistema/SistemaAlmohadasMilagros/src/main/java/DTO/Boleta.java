package DTO;
public class Boleta extends DocumentoVenta{
    int contador ; 
    @Override
    public String GenerarOrdenResmion() {
        String re = String.format("%05d", this.contador); // 
        return "T-001-" + re;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
}
