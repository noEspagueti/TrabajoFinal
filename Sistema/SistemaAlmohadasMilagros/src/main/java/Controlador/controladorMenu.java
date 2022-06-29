package Controlador;

import DTO.ProductoAlmohadas;
import Modelo.productoDAO;
import Vista.datosMenu;
import static Vista.datosMenu.Producto;
import static Vista.datosMenu.almohadas;
import static Vista.datosMenu.color1;
import static Vista.datosMenu.color2;
import static Vista.datosMenu.color3;
import static Vista.datosMenu.color4;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class controladorMenu implements datosMenu {

    public void precioT(ProductoAlmohadas almohadas, JComboBox<String> boxMedidas, JComboBox<String> boxProducto, JTextField cantidad, JLabel precioTotal) {
//        Double can = (Double) cantidad.getValue();
        String p = String.valueOf(almohadas.getPrecioUnitario());
        String medida = (String) boxMedidas.getSelectedItem();
        String pro = (String) boxProducto.getSelectedItem();
        double cantidadPro = Double.valueOf(cantidad.getText() + ".0");
        double precioT = 0.0;
        switch (pro) {
            case "Almohadas Punto":
                if (medida.equals(this.medida[0])) {
                    precioT = this.precioPorUnidad[0];
                    p = String.valueOf((double) cantidadPro * precioT);
                } else if (medida.equals(this.medida[1])) {
                    precioT = this.precioPorUnidad[1];
                    p = String.valueOf((double) cantidadPro * precioT);
                } else if (medida.equals(this.medida[2])) {
                    precioT = this.precioPorUnidad[2];
                    p = String.valueOf((double) cantidadPro * precioT);
                }
                break;
            case "Almohadas Alcolchadas":
                if (medida.equals(this.medida[0])) {
                    precioT = this.precioPorUnidad[3];

                    p = String.valueOf((double) cantidadPro * precioT);

                } else if (medida.equals(this.medida[1])) {
                    precioT = this.precioPorUnidad[4];

                    p = String.valueOf((double) cantidadPro * precioT);

                } else if (medida.equals(this.medida[2])) {
                    precioT = this.precioPorUnidad[5];

                    p = String.valueOf((double) cantidadPro * precioT);

                }
                break;
            case "Almohadas Canon":
                if (medida.equals(this.medida[0])) {
                    precioT = this.precioPorUnidad[6];

                    p = String.valueOf((double) cantidadPro * precioT);

                } else if (medida.equals(this.medida[1])) {
                    precioT = this.precioPorUnidad[7];

                    p = String.valueOf((double) cantidadPro * precioT);

                } else if (medida.equals(this.medida[2])) {
                    precioT = this.precioPorUnidad[8];

                    p = String.valueOf((double) cantidadPro * precioT);

                }
                break;
            case "Almohadas Popelina":
            case "Almohadas Económica":
                if (medida.equals(this.medida[0])) {
                    precioT = this.precioPorUnidad[9];

                    p = String.valueOf((double) cantidadPro * precioT);

                } else if (medida.equals(this.medida[1])) {
                    precioT = this.precioPorUnidad[10];

                    p = String.valueOf((double) cantidadPro * precioT);

                } else if (medida.equals(this.medida[2])) {
                    precioT = this.precioPorUnidad[11];

                    p = String.valueOf((double) cantidadPro * precioT);

                }
                break;

            default:
//                p = String.valueOf(precioPorUnidad[0]);
        }

        precioTotal.setText("S/. " + p);
        almohadas.setPrecioTotal(precioT);
    }

    public void asignarColor(JComboBox<String> boxProducto, ProductoAlmohadas almohadas, javax.swing.JComboBox<String> comboColor) {
        String produc = (String) boxProducto.getSelectedItem();
        switch (produc) {
            case "Almohadas Punto":
                almohadas.setColor(color1[comboColor.getSelectedIndex()]);
                break;
            case "Almohadas Alcolchadas":
                almohadas.setColor(color2[comboColor.getSelectedIndex()]);
                break;
            case "Almohadas Canon":
                almohadas.setColor(color3[comboColor.getSelectedIndex()]);
                break;
            case "Almohadas Popelina":
            case "Almohadas Económica":
                almohadas.setColor(color4[comboColor.getSelectedIndex()]);
                break;
        }
    }

    public void calcularPrecio(ProductoAlmohadas almohadas, javax.swing.JLabel precio) {

        precio.setText("S/. " + almohadas.getPrecioUnitario());

    }

    public void precioPorMedida(javax.swing.JLabel precio, JComboBox<String> boxMedidas, JComboBox<String> boxProducto, ProductoAlmohadas almohadas) {
        String medida = (String) boxMedidas.getSelectedItem();
        String pro = (String) boxProducto.getSelectedItem();

        switch (pro) {
            case "Almohadas Punto":
                if (medida.equals(this.medida[0])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[0]);
                } else if (medida.equals(this.medida[1])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[1]);
                } else if (medida.equals(this.medida[2])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[2]);
                }
                break;
            case "Almohadas Alcolchadas":
                if (medida.equals(this.medida[0])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[3]);
                } else if (medida.equals(this.medida[1])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[4]);
                } else if (medida.equals(this.medida[2])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[5]);
                }
                break;
            case "Almohadas Canon":
                if (medida.equals(this.medida[0])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[6]);
                } else if (medida.equals(this.medida[1])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[7]);
                } else if (medida.equals(this.medida[2])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[8]);
                }
                break;
            case "Almohadas Popelina":
                if (medida.equals(this.medida[0])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[9]);
                } else if (medida.equals(this.medida[1])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[10]);
                } else if (medida.equals(this.medida[2])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[11]);
                }
                break;
            case "Almohadas Económica":
                if (medida.equals(this.medida[0])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[9]);
                } else if (medida.equals(this.medida[1])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[10]);
                } else if (medida.equals(this.medida[2])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[11]);
                }
                break;
        }

        calcularPrecio(almohadas, precio);
    }

    public void boxProductoCambio(JComboBox<String> boxProducto, javax.swing.JComboBox<String> comboColor, JTextField cantidad, javax.swing.JLabel precio) {
        String produc = (String) boxProducto.getSelectedItem();
        if (produc.equals("Almohadas Punto")) {
            DefaultComboBoxModel combo = new DefaultComboBoxModel(color1);
            comboColor.setModel(combo);
        } else if (produc.equals(Producto[1])) {
            DefaultComboBoxModel combo = new DefaultComboBoxModel(color2);
            comboColor.setModel(combo);
        } else if (produc.equals(Producto[2])) {
            DefaultComboBoxModel combo = new DefaultComboBoxModel(color3);
            comboColor.setModel(combo);
        } else if (produc.equals(Producto[3])) {
            DefaultComboBoxModel combo = new DefaultComboBoxModel(color4);
            comboColor.setModel(combo);
        } else if (produc.equals(Producto[4])) {
            DefaultComboBoxModel combo = new DefaultComboBoxModel(color4);
            comboColor.setModel(combo);
        }

    }

    public void eliminarBoton(JTable tableMatriz, DefaultTableModel modeloTabla, ArrayList<Integer> codProductos) throws SQLException {
        int codPro;
        productoDAO pd = new productoDAO();
        // TODO add your handling code here:
        try {
            int fila = tableMatriz.getSelectedRow();
            if (fila >= 0) {

                for (int i = 0; i < codProductos.size(); i++) {
                    if (fila == i) {
                        codPro = codProductos.get(i);
                        modeloTabla.removeRow(fila);
                        pd.eliminarProducto(codPro);
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla", "Error", JOptionPane.ERROR);
            }
        } catch (RuntimeException r) {
            r.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null, "No hay registros", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

}
