package laboratorio.punto13;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsultaFecha {
    public static void consultarfecha() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime hora = LocalDateTime.now();
        JOptionPane.showMessageDialog(null, "La fecha y hora actuales son: " + formato.format(hora));
    }
}
