package Controlador;

import Modelo.registroEmpleadoDAO;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class controladorRegistroEmpleado {
    
    registroEmpleadoDAO re = new registroEmpleadoDAO();
    
    public void registrarDatos(JTextField NomEmp,
            JTextField ApellidoEmp, JTextField DNIEmp, JTextField TelefEmp,
            JTextField DireccEmp, JTextField DistriEmp, JTextField CumEmp,
            JTextField PuestoEmp) throws SQLException {
        re.insertarRegistro(NomEmp, ApellidoEmp, DNIEmp, TelefEmp, DireccEmp, DistriEmp, CumEmp, PuestoEmp);
        
        borrarRegistro(NomEmp, ApellidoEmp, DNIEmp, TelefEmp, DireccEmp, DistriEmp, CumEmp, PuestoEmp);
    }
    
    public void borrarRegistro(JTextField NomEmp,
            JTextField ApellidoEmp, JTextField DNIEmp, JTextField TelefEmp,
            JTextField DireccEmp, JTextField DistriEmp, JTextField CumEmp,
            JTextField PuestoEmp) {
        
        NomEmp.setText("");
        ApellidoEmp.setText("");
        DNIEmp.setText("");
        TelefEmp.setText("");
        DireccEmp.setText("");
        DistriEmp.setText("");
        CumEmp.setText("");
        PuestoEmp.setText("");
        
    }
    
    public void mostrarTablaEmpleado(JTable tablaEmpleados) throws SQLException {
        DefaultTableModel modeloTablaEmpleados = new DefaultTableModel();
        tablaEmpleados.setModel(modeloTablaEmpleados);
        
        modeloTablaEmpleados.addColumn("Nombres");
        modeloTablaEmpleados.addColumn("Apellidos");
        modeloTablaEmpleados.addColumn("DNI");
        modeloTablaEmpleados.addColumn("Teléfono");
        modeloTablaEmpleados.addColumn("Dirección");
        modeloTablaEmpleados.addColumn("Distrito");
        modeloTablaEmpleados.addColumn("Cumpleaños");
        modeloTablaEmpleados.addColumn("Puesto");
        Object[] columna = new Object[8];
        
        int cantidad = re.mostrarTabla().size();
        for (int i = 0; i < cantidad; i++) {
            columna[0] = re.mostrarTabla().get(i).getNombre();
            columna[1] = re.mostrarTabla().get(i).getApellido();
            columna[2] = re.mostrarTabla().get(i).getDNI();
            columna[3] = re.mostrarTabla().get(i).getTel();
            columna[4] = re.mostrarTabla().get(i).getDireccion();
            columna[5] = re.mostrarTabla().get(i).getDistrito();
            columna[6] = re.mostrarTabla().get(i).getFechaNacimiento();
            columna[7] = re.mostrarTabla().get(i).getPuesto();
            modeloTablaEmpleados.addRow(columna);
        }
    }
    
    public void eliminarEmpleado(JTextField NomEmp,
            JTextField ApellidoEmp, JTextField DNIEmp, JTextField TelefEmp,
            JTextField DireccEmp, JTextField DistriEmp, JTextField CumEmp,
            JTextField PuestoEmp) throws SQLException {
        re.eliminar(DNIEmp.getText());
        borrarRegistro(NomEmp, ApellidoEmp, DNIEmp, TelefEmp, DireccEmp, DistriEmp, CumEmp, PuestoEmp);
    }
    
    public void seleccionTabla(JTextField NomEmp,
            JTextField ApellidoEmp, JTextField DNIEmp, JTextField TelefEmp,
            JTextField DireccEmp, JTextField DistriEmp, JTextField CumEmp,
            JTextField PuestoEmp, JTable tablaEmpleados) throws SQLException {
        int fila = tablaEmpleados.getSelectedRow();
        int cantidad = re.mostrarTabla().size();
        
        for (int i = 0; i < cantidad; i++) {
            if (fila == i) {
                NomEmp.setText(re.mostrarTabla().get(i).getNombre());
                ApellidoEmp.setText(re.mostrarTabla().get(i).getApellido());
                DNIEmp.setText(re.mostrarTabla().get(i).getDNI());
                TelefEmp.setText(re.mostrarTabla().get(i).getTel());
                DireccEmp.setText(re.mostrarTabla().get(i).getDireccion());
                DistriEmp.setText(re.mostrarTabla().get(i).getDistrito());
                CumEmp.setText(re.mostrarTabla().get(i).getFechaNacimiento());
                PuestoEmp.setText(re.mostrarTabla().get(i).getPuesto());
            }
        }
    }
    
    public void actulizarEmpleado(JTextField NomEmp,
            JTextField ApellidoEmp, JTextField DNIEmp, JTextField TelefEmp,
            JTextField DireccEmp, JTextField DistriEmp, JTextField CumEmp,
            JTextField PuestoEmp,JTable tablaEmpleados) throws SQLException {
        
        re.actualizar(NomEmp, ApellidoEmp, DNIEmp, TelefEmp, DireccEmp, DistriEmp, CumEmp, PuestoEmp);
        
        borrarRegistro(NomEmp, ApellidoEmp, DNIEmp, TelefEmp, DireccEmp, DistriEmp, CumEmp, PuestoEmp);
        borrarTabla(tablaEmpleados);
    }
    
    public void borrarTabla(JTable tablaEmpleados) throws SQLException{
          DefaultTableModel modeloTablaEmpleados = new DefaultTableModel();
        tablaEmpleados.setModel(modeloTablaEmpleados);
        
        modeloTablaEmpleados.addColumn("Nombres");
        modeloTablaEmpleados.addColumn("Apellidos");
        modeloTablaEmpleados.addColumn("DNI");
        modeloTablaEmpleados.addColumn("Teléfono");
        modeloTablaEmpleados.addColumn("Dirección");
        modeloTablaEmpleados.addColumn("Distrito");
        modeloTablaEmpleados.addColumn("Cumpleaños");
        modeloTablaEmpleados.addColumn("Puesto");
        Object[] columna = new Object[8];
        
        int cantidad = re.mostrarTabla().size();
        for (int i = 0; i < cantidad; i++) {
            columna[0] = "";
            columna[1] = "";
            columna[2] = "";
            columna[3] = "";
            columna[4] = "";
            columna[5] = "";
            columna[6] = "";
            columna[7] = "";
            modeloTablaEmpleados.addRow(columna);
        }
    }
}
