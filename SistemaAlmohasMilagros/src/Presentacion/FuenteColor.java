package Presentacion;

import java.awt.Color;
import javax.swing.JTextField;

public class FuenteColor {
    
    String plomo = "#818181";
    String negro = "#000000";
    
    public void mensaje(JTextField letra, String mensaje, int size){
        if (size == 0) {
            letra.setText(mensaje);
            letra.setForeground(Color.decode(plomo));
        }
    }
    
    public void click(JTextField letra, String mensaje ){
        if (letra.getText().equals(mensaje)) {
            letra.setText("");
            letra.setForeground(Color.decode(negro));
        }
    }
    
    
}
