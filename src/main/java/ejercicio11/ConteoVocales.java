package ejercicio11;

import java.util.Scanner;

public class ConteoVocales {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.print("Ingresa por Favor una frase : ");
        String texto = captura.nextLine().toLowerCase().replace(" ", "");
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;
        for (int x = 0; x < texto.length(); x++) {
            if (texto.charAt(x) == 'a') {
                contadorA++;
            }
            if (texto.charAt(x) == 'e') {
                contadorE++;
            }
            if (texto.charAt(x) == 'i') {
                contadorI++;
            }
            if (texto.charAt(x) == 'o') {
                contadorO++;
            }
            if (texto.charAt(x) == 'u') {
                contadorU++;
            }
        }
        int numeroLetras = texto.length();
        System.out.println("La Frase "
                + texto + " contiene un total de " + numeroLetras + " caracteres y contiene distintas vocales como son \n"
                + contadorA + " vocales = A \n"
                + contadorE + " vocales = E \n"
                + contadorI + " vocales = I \n"
                + contadorO + " vocales = O \n"
                + contadorU + " vocales = U \n");
    }
}

