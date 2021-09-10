package laboratorio;
import laboratorio.punto1.CompararNumeros;
import laboratorio.punto10.EliminaEspacio;
import laboratorio.punto2.CompararNumerosUser;
import laboratorio.punto3.AreaCirculo;
import laboratorio.punto4.AgregarIva;
import laboratorio.punto5.ImparesPares;
import laboratorio.punto6.ImparesParesFor;
import laboratorio.punto7.MayorIgualCero;
import laboratorio.punto8.DiaSemana;
import laboratorio.punto9.CambioLetra;

import javax.swing.*;

public class Menu {
    public static void main(String [] args){
        int option = optionMenu();


        switch (option) {
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
                break;
            case 8:
                DiaSemana.laboralFestivo();
                break;
            case 9:
                CambioLetra.concatenar();
                break;
            case 10:
                EliminaEspacio.eliminarEspacios();
                break;
        }
    }
    public static int optionMenu(){
        int opt;


            opt = Integer.parseInt(JOptionPane.showInputDialog("Selecciona el ejercicio a revisar\n"+
                    "1. Punto Uno\n"+
                    "2. Punto Dos\n"+
                    "3. Punto Tres\n"+
                    "4. Punto Cuatro\n"+
                    "5. Punto Cinco\n"+
                    "6. Punto Seis\n"+
                    "7. Punto Siete\n"+
                    "8. Punto Ocho\n"+
                    "9. Punto Nueve\n"+
                    "10. Punto Diez\n"+
                    "11. Punto Once\n"+
                    "12. Punto Doce\n"+
                    "13. Punto Trece\n"+
                    "14. Punto Catorce\n"+
                    "15. Punto Quince\n"+
                    "16. Punto Dieciseis\n"+
                    "17. Punto Diecisiete\n"+
                    "18. Punto Dieciocho\n"));

        return opt;
    }
}
