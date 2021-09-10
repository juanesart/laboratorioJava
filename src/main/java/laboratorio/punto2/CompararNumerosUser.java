package laboratorio.punto2;

import javax.swing.*;

public class CompararNumerosUser {
    private static int a;
    private static int b;

    public static String compararVariables() {
        String respuesta = "";

        while (true) {
            try {
                a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 1"));
                System.out.println(a);
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingresa un numero valido, error: " + e.getMessage());
            }
        }
        while (true) {
            try {
                b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 2"));
                System.out.println(b);
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingresa un numero valido, error: " + e.getMessage());
            }
        }
        if (a > b) {
            respuesta = "el numero 1 es mayor";
        } else if (a < b) {
            respuesta = "el numero 2 es mayor";
        } else {
            respuesta = "ambos numeros son iguales";
        }
        return respuesta;
    }
}
