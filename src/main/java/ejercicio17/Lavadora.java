package ejercicio17;

public class Lavadora extends Electrodomestico {
    int carga = 5;

    public Lavadora() {

    }

    public Lavadora(int precio, int peso) {
        super(precio, peso);
    }

    public Lavadora(int carga, int precioBase, String color, char consumoEnergetico, int peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public int precioFinal(int preciobase, char letra, int peso, int carga) {
        int precioCarga = 0;
        if (carga > 30) {
            precioCarga = 50;
        }
        int precioFinalLavadora = precioFinal(preciobase, letra, peso);
        return precioFinalLavadora + precioCarga;

    }
}
