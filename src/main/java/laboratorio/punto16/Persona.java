package laboratorio.punto16;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private String DNI = "";
    private String sexo = "";
    private double peso = 0;
    private double altura = 0;
    private final String HOMBRE = "H";

    public Persona(){
        this.crearDNI();
        this.sexo = HOMBRE;
    }
    public Persona(String nombre, int edad, String sexo){
        this.crearDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String sexo, double altura, double peso) {
        this.crearDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso(){
        return this.peso;
    }

    public String getSexo(){
        return this.sexo;
    }

    public double getAltura(){
        return this.altura;
    }
    public int getEdad(){
        return this.edad;
    }

    public String getDNI(){
        return this.DNI;
    }

    public double calcularIMC(){
        double IMC = this.getPeso() / (Math.pow(this.getAltura(), 2));
        if(IMC < 20){
            return -1;
        } else if (IMC >= 25){
            return 1;
        }else{
            return 0;
        }
    }
    private void crearDNI(){
        String listaCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int aleatorio = (int) (Math.floor(Math.random()*(100000000)));
        int modulo = aleatorio % 23;
        char letra = listaCaracteres.charAt(modulo);
        String DNI = String.valueOf(aleatorio)+letra;
        this.DNI = DNI;
    }
    public boolean esMayorEdad (){
        if(this.edad >= 18){
            return true;
        }else {
            return false;
        }
    }
    public String toString(){
        String info = " \n - Nombre: " +this.nombre+
                "\n - Edad: "+this.getEdad()+"\n - Sexo: "+this.getSexo()+" \n - DNI: "+this.getDNI()+"\n - Estatura: " +this.getAltura()+" m"+
                "\n - Peso: "+this.getPeso()+" kg";
        return info;
    }
}
