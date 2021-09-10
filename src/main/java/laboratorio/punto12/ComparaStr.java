package laboratorio.punto12;

import javax.swing.*;

public class ComparaStr {
    public static void compararStrs(){
        String texto1 = JOptionPane.showInputDialog(null,"Ingresa la primera frase");
        String texto2 = JOptionPane.showInputDialog(null, "Ingresa la segunda frase");
        if (texto1.equals(texto2)){
            JOptionPane.showMessageDialog(null,"Las frases son iguales");
        }else{
            JOptionPane.showMessageDialog(null,"Su diferencia es: ");
        }
    }
}
