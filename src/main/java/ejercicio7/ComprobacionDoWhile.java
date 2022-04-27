package ejercicio7;

import java.util.Scanner;

public class ComprobacionDoWhile {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        String dato;
        int numero;

        do {
            System.out.print("ingrese un numero :");
            dato = captura.nextLine();
            numero = Integer.parseInt(dato);

        } while (numero < 0);
        {
            System.out.println("el dato ingresago es " + dato);
        }
    }
}
