public class Main {
    public static void main(String[] args) {
        // Leemos la variable de entorno configurada en launch.json
        String modo = System.getenv("APP_MODE");
        
        // Imprimimos el resultado en la consola
        System.out.println("El valor de APP_MODE es: " + modo);
    }
}