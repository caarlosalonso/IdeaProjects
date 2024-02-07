import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

public class Estacionamiento {
    //Atributos
    private String matricula;
    private LocalDateTime entrada;
    private LocalDateTime salida;
    private float importe;

    //Constructores
    public Estacionamiento(String matricula,LocalDateTime entrada){
        this.matricula = matricula;
        this.entrada = entrada;
    }

    //Metodos
    @Override
    public String toString() {
        return "Estacionamiento{" +
                "matricula='" + matricula + '\'' +
                ", entrada=" + entrada +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estacionamiento that = (Estacionamiento) o;
        return Objects.equals(matricula, that.matricula) && Objects.equals(entrada, that.entrada);
    }
    @Override
    public int hashCode() {
        return Objects.hash(matricula, entrada);
    }

    public static void formateoDiaHora (){
        LocalDateTime fechaConHora = LocalDateTime.now();

        DateTimeFormatter esDateFormat=
                DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
    }
}
