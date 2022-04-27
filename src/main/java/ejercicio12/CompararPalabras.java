package ejercicio12;

import java.util.Scanner;

public class CompararPalabras {


    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.print("Ingresa una palabra : ");
        String primeraPalabra = captura.nextLine().toLowerCase();
        System.out.print("Ingrese una segunda palabra, a comparar : ");
        String segundaPalabra = captura.nextLine().toLowerCase();
        if (primeraPalabra.equalsIgnoreCase(segundaPalabra)) {
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println("Las palabras Son diferentes");
        }

    }


}
