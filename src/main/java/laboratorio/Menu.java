package laboratorio;
import laboratorio.punto1.CompararNumeros;
import laboratorio.punto2.CompararNumerosUser;

import javax.swing.*;

public class Menu {
    public static void main(String [] args){
        int option = optionMenu();

        switch (option){
            case 1:
                System.out.println(CompararNumeros.comparar());
                JOptionPane.showMessageDialog(null, CompararNumeros.comparar());
                break;
            case 2:
                JOptionPane.showMessageDialog(null, CompararNumerosUser.compararVariables());
        }


    }
    public static int optionMenu(){
        int opt;

        opt = Integer.parseInt(JOptionPane.showInputDialog("Selecciona el ejercicio a revisar\n"+
                "1. Punto Uno\n"+
                "2. Punto Dos"));
        return opt;
    }
}
