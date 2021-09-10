package laboratorio.punto6;

public class ImparesParesFor {

    public static void mostrarParesImpares(){
       for (int num = 1; num <= 100; num++){
            if (num % 2 == 0){
                System.out.println("Par: " + num);
            }else {
                System.out.println("Impar: " + num);
            }
        }
    }
}
