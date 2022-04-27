package ejercicio3;

import java.util.Scanner;

public class CalculoArea {
    static final double PI = 3.14;

    public static void main(String[] args) {
        System.out.println("***********************************************************************************************************");
        System.out.println();
        Scanner radio = new Scanner(System.in);
        System.out.print("Ingrese el radio del circulo a calcular  en Metros ");
        String radio1 = radio.nextLine();
        double Radio2 = Double.parseDouble(radio1);
        double resultadoArea = PI * Math.pow(Radio2, 2);
        System.out.println();
        System.out.println("El area de un circulo de " + Radio2 + " Metros de radio, es de " + resultadoArea + " Metros Cuadrados");
        System.out.println();
        System.out.println("***********************************************************************************************************");
    }

}
