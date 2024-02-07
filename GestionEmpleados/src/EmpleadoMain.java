import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        EmpleadoFunciones.mostrarDatosOld(listaEmpleados);

        int opcion;

        do{
            System.out.println(  "Mostrando opciones:"
                    + "\n 1 - Mostrar todos los empleados"
                    + "\n 2 - Dar de alta a un nuevo empleado"
                    + "\n 3 - Buscar empleado por DNi (se muestra DNI, nombre y sueldo)"
                    + "\n 4 - Buscar todos los empleados de un departamento"
                    + "\n 5 - Borrar un empleado indicando un DNI"
                    + "\n 6 - Buscar empleados comprendidos entre 2 sueldos"
                    + "\n 7 - Subir sueldo a un empleado (indicando un porcentaje)"
                    + "\n 0 - Salir"
            );
            System.out.println("Elige una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    EmpleadoFunciones.mostrarEmpleados(listaEmpleados);
                    break;
                case 2:
                    EmpleadoFunciones.altaEmpleado(listaEmpleados);
                    break;
                case 3:
                    EmpleadoFunciones.buscarReducido(listaEmpleados);
                    break;
                case 4:
                    EmpleadoFunciones.mostrarDepartamento(listaEmpleados);
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    EmpleadoFunciones.subirSueldo(listaEmpleados);
                    break;
                case 0:
                    break;
            }
        }while (opcion!=0);
    }

}