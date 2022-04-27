package ejercicio10;

import java.util.Scanner;

public class EliminarEspacios {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.println("*****************************************************************************************************************");
        System.out.println();
        System.out.println("Deja tu frase aqui:");
        String texto = captura.nextLine().replace(" ", "");
        System.out.println();
        System.out.println("Texto ingresado sin espacios :" + texto);
        System.out.println("*****************************************************************************************************************");

    }
}
