package Controlador;

import DTO.Cliente;
import DTO.Factura;
import Modelo.ClienteDAO;
import Modelo.FacturaDAO;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.*;
public class DocumentoVentaCRUD {
    FacturaDAO fd = new FacturaDAO();
    Cliente cliente = new Cliente();
    int contador = 0;
    
    public void sqlCliente(JTextField a,JTextField b,JTextField c,JTextField d,JTextField e,JTextField f,JTextField g) throws SQLException{
    
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
    public void insertarDatos(Cliente cliente,JTextField a,JTextField b,String tipo){
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
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de insertar datos", "Error", JOptionPane.ERROR);
        }
    }
    
    
    
    
}
