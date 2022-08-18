package Modelo;

public interface ConsultasImplements {

    String INSERTARFACTURA_SP = "{call insertarDocumento (?,?,?,?,?,?)}";
    String INSERTARCLIENTE_SP = "{call insertarCliente (?,?,?,?,?,?,?)}";
    String MOSTRARUSUARIOS_SP = "{call mostrarUsuarios}";
    String MOSTRARDATOSEMPLEADOS_SP = "{call mostrarDatosEmpleados}";
    String INSERTARDATOSPRODUCTO_SP = "{call insertarRegistro(?,?,?,?,?)}";
    String INSERTARORDENES_SP = "{call ingresarOrden(?,?,?,?)}";
    String INSERTARDETALLEORDENES_SP = "{call insertarDetalleOrdenes(?,?,?,?)}";
    String ACTUALIZARCLIENTE_SP = "{call actualizarCliente (?,?,?,?,?,?,?)}";
    String ELIMINARPRODUCTO_SP = "{call eliminarProducto (?)}";
    String INSERTARVENTADIARIA_SP = "{call insertarVentaDiaria (?,?,?)}";
    String MOSTRARCANTIDADVENTA_SP = "{call obtenerCantidadVenta (?)}";
    String ACTUALIZARVENTADIARIA_SP = "{call actualizarVentaDiaria (?,?)}";
    String ELIMINARCLIENTE_SP = "{call eliminarCliente (?)}";
    String MOSTRARLISTAVENTAS_SP = "{call mostrarListaVentas}";
    String MOSTRARLISTAVENTASTABLA_SP = "{call mostrarListaVentasTabla}";
    String REGISTRAREMPLEADOS_SP = "{call registrarEmpleado(?,?,?,?,?,?,?,?,?)}";
    String ELIMINAREMPLEADO_SP = "{call eliminarEmpleado (?)}";
    String ACTUALIZAREMPLEADO_SP = "{call actualizarRegistroEmpleado (?,?,?,?,?,?,?)}";
    String BUSCARFECHATABLAVENTA_SP = "{call buscarFecharVentaTabla (?)}";
    
}
