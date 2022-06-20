package Datos;
public interface ConsultasImplements {
    
    String INSERTARFACTURA_SP="{call insertarDocumento (?,?,?,?,?,?)}";
    String INSERTARCLIENTE_SP = "{call insertarCliente (?,?,?,?,?,?,?)}";
    String MOSTRARUSUARIOS_SP = "{call mostrarUsuarios}";
    
}
