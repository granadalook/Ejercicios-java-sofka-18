package ejercicio18;

public class Serie implements Entregable {
    String titulo;
    Integer numeroTempodaras = 3;
    boolean entregado = false;
    String genero;
    String creador;

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, Integer numeroTempodaras, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTempodaras = numeroTempodaras;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getNumeroTempodaras() {
        return numeroTempodaras;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTempodaras(Integer numeroTempodaras) {
        this.numeroTempodaras = numeroTempodaras;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "NOMBRE DE LA SERIE  : " + titulo + '\n' + "NUMERO DE TEMPORADAS : " + numeroTempodaras + '\n' + "SERIE ENTREGADA : " + entregado + '\n' + "GENERO DE LA SERIE : " + genero + '\n' + "CREADORA : " + creador + '\'';
    }

    @Override
    public boolean entregar() {
        return this.entregado = true;
    }

    @Override
    public boolean devolver() {
        return false;
    }

    @Override
    public boolean isEntregado() {
        return false;
    }

    @Override
    public Integer compareTo(Object object) {
        Serie serieComparar = (Serie) object;
        Integer numeroComparacion = 0;
        if (this.numeroTempodaras > serieComparar.numeroTempodaras) {
            numeroComparacion = 1;
        }
        if (this.numeroTempodaras < serieComparar.numeroTempodaras) {
            numeroComparacion = -1;
        }
        return numeroComparacion;
    }


}
