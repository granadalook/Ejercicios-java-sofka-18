package ejercicio16;

import java.util.Random;
import java.util.Scanner;

public class Persona {
    String sexo = "H";
    private String nombre;
    private int edad;
    private String DNI;
    private int peso;
    private double altura;

    public Persona() {
        calcularDni();
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        calcularDni();
    }

    public Persona(String nombre, int edad, String sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        calcularDni();
    }

    @Override
    public String toString() {
        return "persona{" +
                "nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public static int saludable(int dato) {
        int imc = dato;
        switch (imc) {
            case 1: {
                System.out.println("Se encuentra por encima del peso Optimo");
            }
            break;
            case -1: {
                System.out.println("Se encuentra por debajo del peso Optimo");
            }
            break;
            case 0: {
                System.out.println("Peso Optimo ");
            }
            break;
        }
        return imc;
    }

    public static int calculoImc(int peso, double altura) {
        double imc = peso / Math.pow(altura, 2);
        int item = 0;
        if (imc >= 20 & imc <= 25) {
            item = 0;
        } else if (imc < 20) {
            item = -1;
        } else {
            item = 1;
        }
        return item;
    }

    public static boolean esMayorDeEdad(int edad) {
        if (edad >= 18) {
            return true;
        }
        return false;
    }

    public static String comprobarSexo(String sexo) {
        String genero;
        switch (sexo.toUpperCase()) {
            case "F": {
                genero = "Sexo femenino";
            }
            break;
            case "M": {
                genero = "Sexo masculino";
            }
            break;
            default:
                genero = "Sexo masculino";
                break;
        }
        return genero;
    }

    public void calcularDni() {
        String characters = "QWERTYUIOPASDFGHJKLÑZXCVBNM";
        int charIndex;
        String ndiItem;
        int dniNumero = numeroDni();
        charIndex = dniNumero % 23;
        ndiItem = String.valueOf(characters.charAt(charIndex));
        this.DNI = dniNumero + ndiItem;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    private int numeroDni() {
        int dniNumero;
        int contador = 0;
        int numero;
        String dniCadena = "";
        Random rand = new Random();
        while (contador < 8) {
            numero = rand.nextInt(10);
            dniCadena = dniCadena + numero;
            contador++;
        }
        dniNumero = Integer.parseInt(dniCadena);
        return dniNumero;
    }

    public static void main(String[] args) {
        System.out.println("*****************************");
        System.out.println("******BIENVENIDOS****** ");
        System.out.println("*****************************");
        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, Ingrese su nombre : ");
        String nombre = entrada.nextLine();
        System.out.print("Por favor,Ingrese su Sexo M o F : ");
        String sexo = entrada.nextLine();
        System.out.print("Por favor,Ingrese su edad : ");
        int edad = entrada.nextInt();
        System.out.print("Por favor,Ingrese su estatura en metros, por ejemplo (1,89) : ");
        double altura = (double) entrada.nextDouble();
        System.out.print("Por favor,Ingrese su peso en Kilogramos : ");
        int peso = entrada.nextInt();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Nombre de la persona = " + persona1.nombre.toUpperCase());
        System.out.println();
        System.out.println("Tiene " + persona1.edad + " años");
        System.out.println();
        System.out.println("La persona es de = " + comprobarSexo(sexo));
        System.out.println();
        System.out.println("Calculo de IMC es de = " + calculoImc(peso, altura));
        System.out.println();
        System.out.println("¿La persona es mayor de edad? = " + esMayorDeEdad(edad));
        System.out.println();
        System.out.println("DNI de la persona = " + persona1.DNI);
        System.out.println();
        saludable(calculoImc(persona1.peso, persona1.altura));

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Scanner entrada2 = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre2 = entrada2.nextLine();
        System.out.println("ingrese su Sexo M o F");
        String sexo2 = entrada2.nextLine();
        System.out.println("Ingrese su edad");
        int edad2 = entrada2.nextInt();

        Persona persona2 = new Persona(nombre2, edad2, sexo2);

        System.out.println("Nombre de la persona =" + persona2.nombre.toUpperCase());
        System.out.println("La persona es de = " + comprobarSexo(sexo2));
        System.out.println("¿La persona es mayor de edad? = " + esMayorDeEdad(edad2));
        System.out.println("DNI de la persona = " + persona2.DNI);


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Persona persona3 = new Persona();
        persona3.setNombre("pepito");
        persona3.setEdad(13);
        persona3.setSexo("M");
        persona3.setAltura(1.66);
        persona3.setPeso(55);

        System.out.println("Nombre de la persona = " + persona3.nombre.toUpperCase());
        System.out.println("Tiene " + persona3.edad + " años");
        System.out.println("La persona es de = " + comprobarSexo(persona3.sexo));
        System.out.println("cCalculo de IMC es de = " + calculoImc(persona3.peso, persona3.altura));
        System.out.println("¿La persona es mayor de edad? = " + esMayorDeEdad(persona3.edad));
        System.out.println("DNI de la persona = " + persona3.DNI);
        saludable(calculoImc(persona3.peso, persona3.altura));


    }

}
