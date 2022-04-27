package ejercicio14;

import java.util.Scanner;

public class ConteoNumeros {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.println("****************************************************************************");
        System.out.println();
        System.out.print("Por favor Ingresa el contador de inicio : ");
        String numero = captura.nextLine();
        int numeroA = Integer.parseInt(numero);
        for (int i = numeroA; i <= 1000; i += 2) {
            System.out.println("Numero " + i);
        }
    }
}
