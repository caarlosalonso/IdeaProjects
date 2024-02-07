import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Dia actual
        LocalDate diaHoy = LocalDate.now();
        System.out.println(diaHoy);

        //Hora actual
        LocalTime horaHoy = LocalTime.now();
        System.out.println(horaHoy);

        //Tiempo y Dia actual
        LocalDateTime tiempoDiaHoy = LocalDateTime.now();
        System.out.println(tiempoDiaHoy);

        //La fecha dada
        LocalDate miCumple = LocalDate.of(2024,6,30);
        System.out.println(miCumple);

        //Dia de la semana de una fecha
        System.out.println(miCumple.getDayOfWeek());

        //Comprobar si un año es bisiesto
        System.out.println(diaHoy.isLeapYear());

        for(int anno=1990; anno<=2024;anno++){
            Year annoCopia = Year.of(anno);
            if(annoCopia.isLeap()){
                System.out.println(annoCopia);
            }
        }

        //Distancia entre fechas
        System.out.println(Period.between(diaHoy,miCumple));

        //Distancia horas
        LocalTime otraHora = LocalTime.of(14,20);
        long tiempo = horaHoy.until(otraHora, ChronoUnit.MINUTES);
        System.out.println("Faltan " +tiempo+ " minutos para salir.");


        /*
        LocalDate fechaNacimiento = LocalDate.of(2002,6,30);
        LocalTime horaActual = LocalTime.now();
        long distanciaEnDias = diaHoy.until(fechaNacimiento, ChronoUnit.DAYS);
        System.out.println("Distancia en días: " +distanciaEnDias);
        long distanciaEnMinutos = ChronoUnit.MINUTES.between(horaActual,fechaNacimiento);
        System.out.println("Distancia en minutos: " +distanciaEnMinutos);
        */


        //Formatos

        //Creamos una fecha con formato propio
        LocalDateTime fechaConHora = LocalDateTime.parse("6-11-2020 12:00",
                DateTimeFormatter.ofPattern("d-M-yyyy HH:mm"));

        //Creamos un formato estandar
        DateTimeFormatter esDateFormat=
                DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
        //Creamos un formato avanzado
        DateTimeFormatter esDateFormatAvanzado=
                DateTimeFormatter.ofPattern("'Día 'dd' del mes 'MM' del año 'yyyy hh:mm:ss a");

        //Mostramos una fecha usando el formato anterior
        System.out.println("Formato español (manual): " +
                fechaConHora.format(esDateFormat));

        System.out.println("Formato español (avanzado): " +
                fechaConHora.format(esDateFormatAvanzado));


        //
        ZoneId zoneId = ZoneId.of("Europa/Paris");
        LocalDateTime fechaHora = LocalDateTime.now();
        ZonedDateTime madridDateTime = ZonedDateTime.of(fechaHora,zoneId);
        System.out.println(madridDateTime);

        ZonedDateTime tokyoDateTime=
                madridDateTime.withZoneSameInstant(ZoneId.of("America/Panama"));
        System.out.println(tokyoDateTime.format(esDateFormat));


    }
}