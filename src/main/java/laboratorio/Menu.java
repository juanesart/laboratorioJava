package laboratorio;
import laboratorio.punto1.CompararNumeros;
import laboratorio.punto2.CompararNumerosUser;
import laboratorio.punto3.AreaCirculo;
import laboratorio.punto4.AgregarIva;
import laboratorio.punto5.ImparesPares;
import laboratorio.punto6.ImparesParesFor;
import laboratorio.punto7.MayorIgualCero;

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
                break;
            case 3:
                AreaCirculo.calcularArea();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, AgregarIva.calcularPrecioIva());
                break;
            case 5:
                ImparesPares.mostrarParesImpares();
                break;
            case 6:
                ImparesParesFor.mostrarParesImpares();
                break;
            case 7:
                MayorIgualCero.esMayorIgual();
        }


    }
    public static int optionMenu(){
        int opt;

        opt = Integer.parseInt(JOptionPane.showInputDialog("Selecciona el ejercicio a revisar\n"+
                "1. Punto Uno\n"+
                "2. Punto Dos\n"+
                "3. Punto Tres"));
        return opt;
    }
}
