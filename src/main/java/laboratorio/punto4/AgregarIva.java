package laboratorio.punto4;

import javax.swing.*;

public class AgregarIva {
    private static double iva = 0.21;
    private static double precioIva;

    public static double calcularPrecioIva(){
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio del producto sin iva"));
        if (precio > 0){
            precioIva = precio + (precio * iva);
        }
        return precioIva;
    }
}
