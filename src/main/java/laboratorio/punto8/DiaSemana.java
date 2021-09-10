package laboratorio.punto8;

import javax.swing.*;
import java.util.Locale;

public class DiaSemana {
    public static void laboralFestivo(){
        String dia = JOptionPane.showInputDialog(null,"Ingresa un dia de la semana y descubre si es laboral o festivo");

        switch (dia.toUpperCase(Locale.ROOT)){
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                JOptionPane.showMessageDialog(null, "El dia: "+dia+" es laboral");
                break;
            case "SABADO":
            case "DOMINGO":
                JOptionPane.showMessageDialog(null, "El dia: "+dia+" es festivo");
                break;
            default:
                JOptionPane.showMessageDialog(null, "No ingresaste un dia valido");
                break;
        }
    }
}
