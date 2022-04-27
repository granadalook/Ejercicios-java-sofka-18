package ejercicio15;

import java.util.Scanner;

public class Cine {
    public static void mensaje() {
        System.out.println("****** GESTION CINEMATOGRICA ********\n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6- VER PELICULAS DE LOS ACTORES\n" +
                "\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR");
    }

    public static void main(String[] args) {
        int opcion = 0;
        do {
            mensaje();
            Scanner captura = new Scanner(System.in);
            System.out.print("Selecciona una opcion : ");
            opcion = Integer.parseInt(captura.nextLine());
            if (opcion > 8) {
                System.out.println("Valor incorecto,");
            }
        }
        while (opcion < 8);
        {
            System.out.println("****************************************************************************");
            System.out.println("Gracias por visitarnos");
            System.out.println("****************************************************************************");


        }
    }
}
