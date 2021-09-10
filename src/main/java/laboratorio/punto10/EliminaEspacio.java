package laboratorio.punto10;

import javax.swing.*;

public class EliminaEspacio {
    public static void eliminarEspacios(){
        String texto = JOptionPane.showInputDialog(null,"Ingresa una frase");
        String nuevoTexto = texto.replaceAll(" ", "");
        JOptionPane.showMessageDialog(null, nuevoTexto);
    }
}
