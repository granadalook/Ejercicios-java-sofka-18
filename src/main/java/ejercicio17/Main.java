package ejercicio17;

public class Main {
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        Television television = new Television();
        Electrodomestico electrodomestico = new Electrodomestico();
        System.out.println();
        System.out.println("***************************************************************************************************************");
        int arreglo[];
        arreglo = new int[5];
        arreglo[0] = electrodomestico.precioFinal(500, 'a', 200);
        arreglo[1] = electrodomestico.precioFinal(20, 'a', 40);
        arreglo[2] = electrodomestico.precioFinal(30, 'a', 60);
        arreglo[3] = electrodomestico.precioFinal(40, 'a', 80);
        arreglo[4] = electrodomestico.precioFinal(50, 'a', 100);
        int sumaElect = 0;
        for (int i = 0; i < arreglo.length; i++) {
            sumaElect += arreglo[i];
            System.out.println("Eletrodomesticos numero " + i + " valor: " + arreglo[i]);


        }
        System.out.println("La suma total los electrodomesticos es: " + sumaElect + " $USD");
        System.out.println("***************************************************************************************************************");


        int arreglo1[];
        arreglo1 = new int[5];
        arreglo1[0] = television.precioFinal(45, false, 45, 'e', 50);
        arreglo1[1] = television.precioFinal(21, true, 225, 'd', 50);
        arreglo1[2] = television.precioFinal(50, false, 455, 'c', 50);
        arreglo1[3] = television.precioFinal(20, true, 55, 'b', 50);
        arreglo1[4] = television.precioFinal(70, false, 95, 'a', 50);
        int sumatele = 0;
        for (int i = 0; i < arreglo1.length; i++) {
            sumatele += arreglo1[i];

            System.out.println("televisor numero " + i + " valor: " + arreglo1[i]);
        }
        System.out.println("La suma total de lavadoras es " + sumatele + " $USD");
        System.out.println("***************************************************************************************************************");

        int arreglo2[];
        arreglo2 = new int[5];
        arreglo2[0] = lavadora.precioFinal(40, 'e', 80, 15);
        arreglo2[1] = lavadora.precioFinal(30, 'd', 50, 50);
        arreglo2[2] = lavadora.precioFinal(90, 'b', 50, 25);
        arreglo2[3] = lavadora.precioFinal(120, 'c', 50, 18);
        arreglo2[4] = lavadora.precioFinal(850, 'a', 50, 38);
        int suma = 0;
        for (int i = 0; i < arreglo2.length; i++) {
            suma += arreglo2[i];
            System.out.println("Lavadora numero " + i + " valor: " + arreglo2[i]);
        }
        System.out.println("la suma total de lavadoras es " + suma + " $USD");
        System.out.println("***************************************************************************************************************");

        int sumaTotal = suma + sumaElect + sumatele;
        System.out.println("***************************************************************************************************************");
        System.out.println(" La  suma total de todos los electrodomesticos es de " + sumaTotal + " $USD");
        System.out.println("***************************************************************************************************************");

    }

}
