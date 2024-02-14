import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class uno {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Mostrando opciones:"
                    + "\n 1 - "
                    + "\n 2 - "
                    + "\n 3 - "
                    + "\n 4 - "
                    + "\n 5 - "
                    + "\n 6 - "
                    + "\n 7 - "
                    + "\n 8 - "
                    + "\n 0 - Salir"
            );
            System.out.println("Elige una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    fechasUno();
                    break;
                case 2:

                    break;
                case 3:
                    fechasTres();
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 0:
                    break;
            }
        } while (opcion != 0);
    }
    public static void fechasUno(){
        //Almacena varias fechas, horas, fechas con horas; importantes para ti
        //(nacimiento, aniversario, 18 cumpleaños, el próximo viernes a las 14:30).
        //Utiliza varios formatos usando parse().
        LocalDateTime proximoViernes = LocalDateTime.parse("26-1-2024 14:30",
                DateTimeFormatter.ofPattern("d-M-yyyy HH:mm"));

        DateTimeFormatter esDateTimeFormat=
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Su fecha es: "+
                proximoViernes.format(esDateTimeFormat));
    }
    public static void fechasDos(){
        //Prueba a mostrar estas fechas, horas y fechas con horas, utilizando
        //distintos formatos predefinidos y otros creados por ti, utilizando format().
    }
    public static void fechasTres (){
       //Calcula distancias entre las fechas anteriores en distintas medidas:
       //años, meses, días, horas, minutos.
        LocalDate hoy = LocalDate.now();

        LocalDate fechaNacimiento = LocalDate.of(2002,6,30);
        System.out.println(hoy.until(fechaNacimiento, ChronoUnit.DAYS));

    }
}

