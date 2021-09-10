package laboratorio.punto7;

import javax.swing.*;

public class MayorIgualCero {
    private static boolean condicion = false;

    public static void esMayorIgual(){
        do {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero mayor o igual a 0"));
            if (num < 0){
                JOptionPane.showMessageDialog(null, "Debes Ingresar un numero mayor o igual a 0");
            }else{
                JOptionPane.showMessageDialog(null, "numero: " + num + " es mayor o igual a 0");
                condicion = true;
            }
        }while (condicion == false);
    }
}
