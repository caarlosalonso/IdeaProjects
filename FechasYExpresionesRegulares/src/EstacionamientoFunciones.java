import java.time.LocalDateTime;
import java.util.ArrayList;

public class EstacionamientoFunciones {

    //Cargar datos iniciales
    public static void cargarDatos(ArrayList<Estacionamiento>listaEstacionados) {

        listaEstacionados.add(new Estacionamiento("1111AAA", LocalDateTime.now()));
        listaEstacionados.add(new Estacionamiento("2222BBB", LocalDateTime.now()));
        listaEstacionados.add(new Estacionamiento("3333CCC", LocalDateTime.now()));

        for (Estacionamiento estacionamiento : listaEstacionados) {
            System.out.println(estacionamiento);
        }


    }
}
