package laboratorio.punto5;

public class ImparesPares {
    private static int num = 1;

    public static void mostrarParesImpares(){
        while (num <= 100){
            if (num % 2 == 0){
                System.out.println("Par: " + num);
            }else {
                System.out.println("Impar: " +num);
            }
            num ++;
        }
    }
}
