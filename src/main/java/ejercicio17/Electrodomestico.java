package ejercicio17;

public class Electrodomestico {
    private int precioBase = 100;
    String color = "blanco";
    public char ConsumoEnergetico = 'F';
    int peso = 5;

    public Electrodomestico() {

    }

    public Electrodomestico(int precio, int peso) {
        this.precioBase = precio;
        this.peso = peso;
    }

    public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.ConsumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", ConsumoEnergetico='" + ConsumoEnergetico + '\'' +
                ", peso=" + peso +
                '}';
    }

    public static int comprobarConsumoEnergetico(char letra) {
        int precioPorconsumo = 0;
        char letraUpperCase = Character.toUpperCase(letra);
        switch (letraUpperCase) {
            case 'A': {
                precioPorconsumo = 100;
            }
            break;
            case 'B': {
                precioPorconsumo = 80;
            }
            break;
            case 'C': {
                precioPorconsumo = 60;
            }
            break;
            case 'D': {
                precioPorconsumo = 50;
            }
            break;
            case 'E': {
                precioPorconsumo = 30;
            }
            break;
            case 'F': {
            }
            default: {
                precioPorconsumo = 10;
            }
        }
        return precioPorconsumo;
    }

    public static String comprobarColor(String color) {
        String colorselecionado = "";
        switch (color.toLowerCase()) {
            case "blanco": {
                colorselecionado = "Blanco";
            }
            break;
            case "negro": {
                colorselecionado = "Negro";
            }
            break;
            case "rojo": {
                colorselecionado = "Rojo";
            }
            break;
            case "azul": {
                colorselecionado = "Azul";
            }
            break;
            case "gris": {
                colorselecionado = "Gris";
            }
            default: {
                colorselecionado = "Blanco";
            }
        }
        return colorselecionado;
    }

    public int precioFinal(int preciobase, char letra, int peso) {
        int incrementoConsumo = comprobarConsumoEnergetico(letra);
        int incrementoTamano = tamano(peso);
        int precioTotal = preciobase + incrementoTamano + incrementoConsumo;
        return precioTotal;
    }

    public static int tamano(int peso) {
        int incrementoPeso = 0;
        if (peso > 0 && peso <= 19) {
            incrementoPeso = 10;
        }
        if (peso >= 20 && peso <= 49) {
            incrementoPeso = 50;
        }
        if (peso >= 50 && peso <= 79) {
            incrementoPeso = 80;
        }
        if (peso >= 80) {
            incrementoPeso = 100;
        }
        return incrementoPeso;
    }
}

