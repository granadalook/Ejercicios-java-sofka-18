package ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fecha {
    public static void main(String[] args) {
        System.out.println("****************************************************************************");
        System.out.println();
        DateTimeFormatter time = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("La fecha y la hora actual es :" + time.format(LocalDateTime.now()));
        System.out.println();
        System.out.println("****************************************************************************");
    }
}
