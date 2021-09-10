package laboratorio.punto9;

import javax.swing.*;

public class CambioLetra {
    private static String texto = "La sonrisa será la mejor arma contra la tristeza";

    public static void concatenar(){
        String nuevoTexto = texto.replaceAll("a", "e").replaceAll("á", "e");
        String entrada = JOptionPane.showInputDialog(null,"Ingresa una frase");
        JOptionPane.showMessageDialog(null, nuevoTexto+" "+entrada);
    }
}
