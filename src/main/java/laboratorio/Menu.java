package laboratorio;
import laboratorio.punto1.CompararNumeros;

import javax.swing.*;

public class Menu {
    public static void main(String [] args){
        System.out.println(CompararNumeros.comparar());
        JOptionPane.showMessageDialog(null, CompararNumeros.comparar());
    }
}
