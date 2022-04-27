package ejercicio9;

import java.util.Scanner;

public class CambioLetras {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.println();
        System.out.println("*****************************************************************************************************************");
        System.out.println("La sonrisa sera la mejor arma contra la tristeza.. \n Algunas palabras  que agregar a esta hermosa frase??");
        System.out.println();
        String nuevoTexto = captura.nextLine();
        String texto = "La sonrisa sera la mejor arma contra la tristeza, " + nuevoTexto;
        System.out.println(texto.replace("a", "e"));
        System.out.println();
        System.out.println("*****************************************************************************************************************");

    }
}
