package ejercicio4;

import java.util.Scanner;

public class Impuesto {
    static final double iva = 21;

    public static void main(String[] args) {
        System.out.println("***********************************************************************************************************");
        Scanner precio = new Scanner(System.in);
        System.out.println();
        System.out.print("Ingrese el Precio  a calcular con el IVA del 21 % ");
        String precioSinIva = precio.nextLine();
        double PrecioSinIva = Double.parseDouble(precioSinIva);
        double valorIva = iva / 100 * PrecioSinIva;
        double precioFinal = valorIva + PrecioSinIva;
        System.out.println();
        System.out.println("el precio final con el IVA del 21 % es " + precioFinal);
        System.out.println("***********************************************************************************************************");
    }

}
