package laboratorio.punto3;

import javax.swing.*;

public class AreaCirculo {
    public static void calcularArea(){
        double radio;

        while (true){
            try {
                radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio del circulo"));
                if (radio > 0){
                    double area = Math.PI * Math.pow(radio, 2);
                    JOptionPane.showMessageDialog(null, "Area del circulo: "+ area);
                    break;
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
}
