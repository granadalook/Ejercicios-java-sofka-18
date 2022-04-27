package ejercicio2;

import java.util.Scanner;

public class EntradaNumeros {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.print("Ingrese un numero ");
        String numero1 = captura.nextLine();
        System.out.print("Ingrese un numero a comparar ");
        String numero2 = captura.nextLine();
        int numeroA = Integer.parseInt(numero1);
        int numeroB = Integer.parseInt(numero2);
        if (numeroA == numeroB) {
            System.out.println("Los numeros son iguales ");
        }
        if (numeroA < numeroB) {
            System.out.println("el numero " + numeroB + " es mayor que el numero " + numeroA);
        }
        if (numeroA > numeroB) {
            System.out.println("el numero " + numeroA + " es mayor que el numero " + numeroB);
        }
    }
}
