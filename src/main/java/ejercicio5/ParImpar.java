package ejercicio5;

public class ParImpar {
    public static void main(String[] args) {
        int numero = 0;
        while (numero <= 100) {
            numero = numero + 1;
            if (numero % 2 == 0) {
                System.out.println("El numero : " + numero + " Es par");
            } else {
                System.out.println("El numero : " + numero + "Es impar");
            }
        }
    }
}
