package laboratorio.punto15;

import javax.swing.*;

public class MenuCine {
    public static void crearMenu(){
        String opt;
        boolean salir = false;

        do {
            opt = JOptionPane.showInputDialog(null,"****** GESTION CINEMATOGRAFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6- VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR");
            try {
                if (Integer.parseInt(opt) == 8) {
                    salir = true;
                    System.out.println(opt);
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "opcion invalida");
            }
        }while (!salir);
    }
}
