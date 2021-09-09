package laboratorio.punto1;

public class CompararNumeros {
    private static int a = 12;
    private static int b = 25;

    public static String comparar(){
        String respuesta = "";

        if (a > b){
            respuesta ="el numero 1 es mayor";
        }else if (a < b){
            respuesta ="el numero 2 es mayor";
        }else{
            respuesta ="ambos numeros son iguales";
        }
        return respuesta;
    }
}
