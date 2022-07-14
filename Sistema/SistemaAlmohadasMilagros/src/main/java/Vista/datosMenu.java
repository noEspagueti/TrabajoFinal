/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Vista;

import Controlador.controladorListaVentas;
import Controlador.detalleOrdenCRUD;
import DTO.Cliente;
import DTO.ProductoAlmohadas;
import Modelo.productoDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miguel
 */
public interface datosMenu {
    
    String Producto[] = {"Almohadas Punto", "Almohadas Alcolchadas", "Almohadas Canon", "Almohadas Popelina", "Almohadas Económica"};
    String medida[] = {"40 cm x 60 cm", "45 cm x 65 cm", "50 cm x 70 cm"};
    String color1[] = {"Blanco", "Negro", "Plomo"};
    String color2[] = {"Azul", "Blanco", "Plomo", "Naranja"};
    String color3[] = {"Blanco entero", "Estampado Zebra"};
    String color4[] = {"Amarillo", "Celeste", "Naranja", "Mostaza", "Azul", "Azul Oscuro", "Marron claro", "Marron Oscuro"};
    Double precioPorUnidad[] = {12.0, 15.0, 17.0, 20.0, 25.0, 27.0, 10.0, 12.0, 15.0, 8.0, 9.0, 10.0};
    
    
    controladorListaVentas m = new controladorListaVentas();
    Cliente cliente = new Cliente();
    ProductoAlmohadas almohadas = new ProductoAlmohadas();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    DefaultTableModel modeloTablaCliente = new DefaultTableModel();
    int contador = 0;
    
    productoDAO pdao = new productoDAO();
    String informacion[] = new String[5];
    detalleOrdenCRUD dOr = new detalleOrdenCRUD();

    ArrayList<Integer> codProductos = new ArrayList<>();
    ArrayList<Integer> cantidadPro = new ArrayList<>();
    ArrayList<Double> PrecioToPro = new ArrayList<>();
    
}
