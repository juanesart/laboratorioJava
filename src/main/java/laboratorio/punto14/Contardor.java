package laboratorio.punto14;

import javax.swing.*;

public class Contardor {
    public static void ContarDesde(){
        int partida = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el numero de partida"));
        try {
            if(partida>=0 && partida<=1000){
                for(int i = partida; i<= 1000; i+=2){
                    System.out.println(i);
                }
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"El numero debe ser menor a mil");
        }

    }
}
