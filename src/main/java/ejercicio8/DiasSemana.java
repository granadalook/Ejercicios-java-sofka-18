package ejercicio8;

import java.util.Scanner;

public class DiasSemana {

    public static void main(String[] args) {

        Scanner Captura = new Scanner(System.in);
        System.out.print("Ingrese un dia de la semana :");
        String dia = Captura.nextLine().toLowerCase();
        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes": {
                diaLaboral();
            }
            break;
            case "sabado":
            case "domingo": {
                diaLibre();
            }
            break;
            default: {
                System.out.println("dia no Encontrado, por favor busca de nuevo ");
            }
        }
    }
    public static void diaLaboral() {
        System.out.println("Dia laboral");
    }
    public static void diaLibre() {
        System.out.println("Dia libre, disfrutalo");
    }

}
