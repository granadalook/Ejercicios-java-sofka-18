package ejercicio17;

public class Television extends Electrodomestico {
    int resolucion = 20;
    boolean SintoniadorTDT = false;

    public Television() {

    }

    public Television(int precio, int peso) {
        super(precio, peso);
    }

    public Television(int resolucion, boolean sintoniadorTDT, int precioBase, String color, char consumoEnergetico, int peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.SintoniadorTDT = sintoniadorTDT;

    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintoniadorTDT() {
        return SintoniadorTDT;
    }

    static final double porcentale = 30;

    public int precioFinal(int resolucion, boolean tdt, int preciobase, char letra, int peso) {
        int precioTDT = 0;
        int precioFinaltelevisor = 0;
        if (tdt == true) {
            precioTDT = 50;
        }
        if (resolucion > 40) {
            int precioTele = precioFinal(preciobase, letra, peso);
            int precioFinalTdt = precioTele + precioTDT;
            double precio30 = porcentale / 100 * precioFinalTdt;
            int parcePrecio = (int) precio30;
            precioFinaltelevisor = parcePrecio + precioFinalTdt;
        }
        if (resolucion < 40) {
            int precioTele = precioFinal(preciobase, letra, peso);
            int precioFinalTdt = precioTele + precioTDT;
            precioFinaltelevisor = precioFinalTdt;
        }
        return precioFinaltelevisor;


    }
}
