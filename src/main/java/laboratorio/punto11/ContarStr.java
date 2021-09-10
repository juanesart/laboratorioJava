package laboratorio.punto11;

import javax.swing.*;
import java.util.Locale;

public class ContarStr {
    public static void contarVocales(){
        String texto = JOptionPane.showInputDialog(null, "Ingresa una frase");
        int size = texto.length();
        int vocales = 0;
        String nuevoTexto = texto.toLowerCase(Locale.ROOT);
        for (int n = 0; n <= size; n++){
            if (nuevoTexto.charAt(n) == 'a'|| nuevoTexto.charAt(n) == 'e'|| nuevoTexto.charAt(n) == 'i'|| nuevoTexto.charAt(n) == 'o'||
                    nuevoTexto.charAt(n) == 'u'){
                vocales++;
            }
        }
        JOptionPane.showMessageDialog(null, "La frase tiene "+size+" caracteres y "+vocales+" vocales");
    }
}
