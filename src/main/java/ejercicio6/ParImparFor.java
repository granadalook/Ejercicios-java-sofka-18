package ejercicio6;

public class ParImparFor {
    public static void main(String[] args) {
        for (int numero = 0; numero <= 100; numero++) {
            if (numero % 2 == 0) {
                System.out.println("El numero :  " + numero + " Es par");
            } else {
                System.out.println("El numero :  " + numero + " Es impar");
                ;
            }
        }
    }
}
