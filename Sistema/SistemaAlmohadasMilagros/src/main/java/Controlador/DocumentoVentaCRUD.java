package Controlador;

import DTO.Cliente;
import DTO.Factura;
import DTO.ProductoAlmohadas;
import Modelo.ClienteDAO;
import Modelo.ClienteDAO;
import Modelo.FacturaDAO;
import Modelo.FacturaDAO;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.*;

public class DocumentoVentaCRUD {

    FacturaDAO fd = new FacturaDAO();
    Cliente cliente = new Cliente();
    int contador = 0;
    ordenCRUD or = new ordenCRUD();
    detalleOrdenCRUD ord = new detalleOrdenCRUD();

    public void sqlCliente(JTextField a, JTextField b, JTextField c, JTextField d, JTextField e, JTextField f, JTextField g) throws SQLException {

        cliente.setNombre(a.getText());
        cliente.setApellido(b.getText());
        cliente.setDNI(c.getText());
        cliente.setTelefono(d.getText());
        cliente.setProvincia(e.getText());
        cliente.setDireccion(f.getText());
        cliente.setCorreo(g.getText());
        ClienteDAO cdao = new ClienteDAO();
        cdao.insertarCliente(cliente);
    }

    //realizar método para recolectar los códigos del producto
    public void insertarDatos(Cliente cliente, JTextField a, JTextField b, String tipo, JTextField c, List<Integer> codPro,List<Integer> cantidadPro, List<Double> precioTotal) {
        String tipoDoc = tipo;
        Factura f = new Factura();
        String CodDoc = f.generarCodigo();
        String Fecha = f.generarFecha(new Date());
        f.setFechaEmision(Fecha);
        f.setTipoDocu(tipoDoc);
        f.setCodigoVenta(CodDoc);
        contador++;
        String OrdenRe = f.GenerarOrdenResmion(contador);
        f.setOrdenRemision(OrdenRe);
        cliente.setRazonSocial(a.getText());
        cliente.setRUC(b.getText());
        try {
            fd.insert(f, cliente);
            cliente.setDNI(c.getText());
            or.insertarOrden(f, cliente);
            //bucle for para los codigos de los productos
            for (int i = 0; i < codPro.size(); i++) {
                ord.insertarDetalle(or.getCod(),codPro.get(i),cantidadPro.get(i),precioTotal.get(i));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de insertar datos", "Error", JOptionPane.ERROR);
        }
    }

}
