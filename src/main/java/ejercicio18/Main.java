package ejercicio18;

public class Main {
    public static void entregarVideoJ(Videojuego[] videoJu) {
        videoJu[0].entregar();
        videoJu[2].entregar();
        videoJu[4].entregar();
    }

    public static void entregarSeries(Serie[] seriest) {
        seriest[4].entregar();
        seriest[3].entregar();
        seriest[0].entregar();
    }

    public static void mostrarVideoJuegos(Videojuego[] videoJu) {
        System.out.println();
        System.out.println("**********VIDEO JUEGOS**********");
        System.out.println();

        for (int i = 0; i < videoJu.length; i++) {
            System.out.println("NOMBRE DEL JUEGO : " + videoJu[i].titulo.toUpperCase());
            System.out.println("GENERO DEL JUEGO : " + videoJu[i].genero.toUpperCase());
            System.out.println("HORAS ESTIMADAS : " + videoJu[i].horasEstimadas);
            System.out.println("JUEGO ENTREGADO : " + videoJu[i].entregado);
            System.out.println("COMPAÑIA : " + videoJu[i].compania.toUpperCase());
            System.out.println("--------------------------------------------------------------------------");
        }
    }

    public static void contarJuegosEntregados(Videojuego[] videoJu) {
        int contador = 0;
        for (int i = 0; i < videoJu.length; i++) {
            if (videoJu[i].entregado == true) {
                contador = contador + 1;
            }
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("VIDEO JUEGOS ENTREGADOS : " + contador);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println();


    }

    public static void mayorHorasvideoJ(Videojuego[] videoJu) {
        Videojuego videomayor;
        videomayor = videoJu[0];
        for (int i = 1; i < videoJu.length; i++) {
            if (videomayor.compareTo(videoJu[i]) == -1) {
                videomayor = videoJu[i];
            }
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("VIDEO JUEGO CON MAYOR HORAS" + '\n' + videomayor.toString());
        System.out.println("--------------------------------------------------------------------------");
        System.out.println();

    }

    public static void mostrarSeriesTele(Serie[] seriest) {
        System.out.println();
        System.out.println("**********SERIE**********");
        System.out.println();

        for (int i = 0; i < seriest.length; i++) {
            System.out.println("NOMBRE DE LA SERIE : " + seriest[i].titulo.toUpperCase());
            System.out.println("GENERO DE LA SERIE : " + seriest[i].genero.toUpperCase());
            System.out.println("TEMPORADAS : " + seriest[i].numeroTempodaras);
            System.out.println("SERIE ENTREGADA : " + seriest[i].entregado);
            System.out.println("CREADORES : " + seriest[i].creador.toUpperCase());
            System.out.println("--------------------------------------------------------------------------");

        }


    }

    public static void contarSeriesEntregadas(Serie[] seriest) {
        int contador1 = 0;
        for (int i = 0; i < seriest.length; i++) {
            if (seriest[i].entregado == true) {
                contador1 = contador1 + 1;
            }
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Contador series entregados : " + contador1);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println();


    }

    public static void mayorTemporadasTv(Serie[] seriest) {
        Serie seriemayorT;
        seriemayorT = seriest[0];
        for (int i = 1; i < seriest.length; i++) {
            if (seriemayorT.compareTo(seriest[i]) == -1) {
                seriemayorT = seriest[i];
            }
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("LA SERIE CON MAYOR TEMPORADAS ES" + '\n' + seriemayorT);
        System.out.println("--------------------------------------------------------------------------");

    }

    public static void main(String[] args) {
        Videojuego videoJu[];
        videoJu = new Videojuego[5];
        videoJu[0] = new Videojuego("halo", 15, "shuter", "epi games");
        videoJu[1] = new Videojuego("racing", 20, "carreras", "epi games");
        videoJu[2] = new Videojuego("F1", 30, "carreras", "epi games");
        videoJu[3] = new Videojuego("dialo", 40, "shuter", "epi games");
        videoJu[4] = new Videojuego("WZ", 50, "shuter", "epi games");

        Serie seriest[];
        seriest = new Serie[5];
        seriest[0] = new Serie("doctor", 15, "salud", "netflix");
        seriest[1] = new Serie("Office", 20, "humor", "amazon");
        seriest[2] = new Serie("pepppa", 30, "infantil", "amazon");
        seriest[3] = new Serie("viquingos", 40, "accion", "amazon");
        seriest[4] = new Serie("princesa", 50, "infantil", "netflix");


        entregarVideoJ(videoJu);

        entregarSeries(seriest);

        mostrarVideoJuegos(videoJu);

        contarJuegosEntregados(videoJu);

        mayorHorasvideoJ(videoJu);

        mostrarSeriesTele(seriest);

        contarSeriesEntregadas(seriest);

        mayorTemporadasTv(seriest);


    }

}
