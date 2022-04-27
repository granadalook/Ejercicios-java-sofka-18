package ejercicio18;

public class Videojuego implements Entregable {
    String titulo;
    Integer horasEstimadas = 10;
    boolean entregado = false;
    String genero;
    String compania;

    public Videojuego() {
    }

    public Videojuego(String titulo, Integer horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, Integer horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public boolean entregar() {
        return this.entregado = true;
    }

    @Override
    public boolean devolver() {
        return this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado = false;
    }

    @Override
    public Integer compareTo(Object object) {
        Videojuego videoComparar = (Videojuego) object;
        Integer numeroComparacion = 0;
        if (this.horasEstimadas > videoComparar.horasEstimadas) {
            numeroComparacion = 1;
        }
        if (this.horasEstimadas < videoComparar.horasEstimadas) {
            numeroComparacion = -1;
        }
        return numeroComparacion;
    }

    @Override
    public String toString() {
        return
                "NOMBRE DEL JUEGO : " + titulo + '\n' + "HORAS ESTIMADAS : " + horasEstimadas + '\n' + "JUEGO ENTREGADO : " + entregado + '\n' + "GENERO DEL JUEGO : " + genero + '\n' + "COMPAÑIA : " + compania + '\'';
    }
}
