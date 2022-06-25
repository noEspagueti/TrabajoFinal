package Modelo;
public interface ConsultasImplements {
    
    String INSERTARFACTURA_SP="{call insertarDocumento (?,?,?,?,?,?)}";
    String INSERTARCLIENTE_SP = "{call insertarCliente (?,?,?,?,?,?,?)}";
    String MOSTRARUSUARIOS_SP = "{call mostrarUsuarios}";
    String MOSTRARDATOSEMPLEADOS_SP ="{call mostrarDatosEmpleados}";
    String INSERTARDATOSPRODUCTO_SP ="{call insertarRegistro(?,?,?,?,?)}";
    String INSERTARORDENES_SP ="{call ingresarOrden(?,?,?,?)}";
    String INSERTARDETALLEORDENES_SP ="{call insertarDetalleOrdenes(?,?,?,?)}";
}
