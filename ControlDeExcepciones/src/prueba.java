import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class prueba {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una fecha: ");
        String fechaString = teclado.nextLine();
        try {
            LocalDate fecha = LocalDate.parse(fechaString,
                    DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        }catch (DateTimeParseException e){
            System.out.println("El formato tiene que ser dd/MM/yyyy");
        }
        //System.out.println(fecha);

    }
}
