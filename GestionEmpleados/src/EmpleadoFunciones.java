import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoFunciones {
    public static void main(String[] args) {

    }
    public static void mostrarEmpleados(ArrayList<Empleado> listaEmpleados){

        for (int i=0; i<listaEmpleados.size(); i++){
            System.out.println(listaEmpleados.get(i));
        }
    }
    public static void altaEmpleado(ArrayList<Empleado> listaEmpleados){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el dni de la persona: ");
        String dni = teclado.nextLine();

        //Creamos un empleado auxiliar con ese dni
        Empleado empleadoAux = new Empleado(dni);

        //Comprobamos si esta en la lista
        int posicion = listaEmpleados.indexOf(empleadoAux);

        if (posicion!=-1){
            System.out.println("El usuario ya existe");
        }else {
            System.out.println("Introduce el nombre del empleado: ");
            String nombre = teclado.nextLine();
            System.out.println("Introduce el apellido del empleado: ");
            String apellido = teclado.nextLine();
            System.out.println("Introduce el departamento del empleado");
            String departamento = teclado.nextLine();
            System.out.println("Introduce el sueldo del empleado");
            Integer sueldo = teclado.nextInt();

            //Creamos un nuevo objeto empleado con los datos introducidos
            Empleado nuevoEmpleado = new Empleado(dni,nombre,apellido,departamento,sueldo);
            listaEmpleados.add(nuevoEmpleado);
            System.out.println("Se ha añadido el empleado con dni: " + dni);
        }
    }
    public static void buscarReducido(ArrayList<Empleado> listaEmpleados){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el dni de la persona que buscas: ");
        String dni = teclado.nextLine();

        //Creamos un empleado auxiliar solo con el dni
        Empleado empleadoAux = new Empleado(dni);

        //Obtenemos la posicion en la que se encuentra el empleado original
        int posicion = listaEmpleados.indexOf(empleadoAux);

        if(posicion!=-1) {
            //Creamos otro objeto Empleado que obtiene la posicion del real (dado por el auxiliar)
            //y lo mostramos utilizando el metodo 'mostrarReducido'
            Empleado empleadoEncontrado = listaEmpleados.get(posicion);
            System.out.println(empleadoEncontrado.mostrarReducido());
        }else {
            System.out.println("El usuario no existe");
        }
    }
    public static void mostrarDepartamento(ArrayList<Empleado>listaEmpleados){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el departamento que quiere buscar: ");
        String departamento = teclado.nextLine();
/*
        //Creamos un empleado auxiliar con ese departamento
        Empleado empleadoAux = new Empleado(departamento);

        //Comprobamos si esta en la lista
        int posicion = listaEmpleados.indexOf(empleadoAux);

        if (posicion!=-1) {
            Empleado empleadoEncontrado = listaEmpleados.get(posicion);
            System.out.println(empleadoEncontrado.mostrarDepto());
        }else {
            System.out.println("El departamento introducido no está en la lista.");
        }

 */

        for (Empleado empleado:listaEmpleados){

            if(empleado.getDepartamento().equals(departamento)){
                System.out.println(empleado);
            }
        }

    }
    public static void subirSueldo(ArrayList<Empleado> listaEmpleados){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el dni de la persona: ");
        String dni = teclado.nextLine();

        //Creamos un empleado auxiliar con ese dni
        Empleado empleadoAux = new Empleado(dni);

        //Comprobamos si esta en la lista
        int posicion = listaEmpleados.indexOf(empleadoAux);

        if (posicion!=-1) {

            //Buscamos la posicion en la que coincida el auxiliar
            Empleado empleadoEncontrado = listaEmpleados.get(posicion);
            //System.out.println("El sueldo es "+empleadoEncontrado.getSueldo());
            System.out.println(empleadoEncontrado);

            //Modificamos el salario
            System.out.println("Introduce la variacion del salario: ");
            Integer variacion = teclado.nextInt();
            empleadoEncontrado.subirSalario(variacion);
            System.out.println(empleadoEncontrado);
        }else {
            System.out.println("El DNI introducido no está en la lista.");
        }
    }
    public static void  mostrarDatos(ArrayList<Empleado>listaEmpleados){

    }
    public static void mostrarDatosOld(ArrayList<Empleado>listaEmpleados){
        //Creamos la lista de empleados
        Empleado empleado1 = new Empleado("11111111A","aitor", "tortilla","informatica",60000);
        Empleado empleado2 = new Empleado("22222222B","ester","colero","logistica",34000);
        Empleado empleado3 = new Empleado("33333333C","andRes","trozado","informatica",56000);
        Empleado empleado4 = new Empleado("44444444D","armAndo","ruido","logistica",39000);
        Empleado empleado5 = new Empleado("55555555E","dolores","fuentes","comercial",45000);
        Empleado empleado6 = new Empleado("66666666F","enrique","cide","comercial",48000);
        Empleado empleado7 = new Empleado("77777777F","estela","gartija","logistica",52000);
        Empleado empleado8 = new Empleado("88888888G","josechu","leton","informatica",49000);
        Empleado empleado9 = new Empleado("99999999H","lola","mento","informatica",51000);

        //Añadimos los coches en el ArrayList
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);
        listaEmpleados.add(empleado4);
        listaEmpleados.add(empleado5);
        listaEmpleados.add(empleado6);
        listaEmpleados.add(empleado7);
        listaEmpleados.add(empleado8);
        listaEmpleados.add(empleado9);

    //cargarDatosIniciales
        /*

        //String unEmpleado = datosIniciales[0];
        for(String unEmpleado:datosIniciales){
        String[] partesEmpleado = unEmpleado.split(" ");
        Empleado empleado = new Empleado(partesEmpleado[0], partesEmpleado[1], partesEmpleado[2], partesEmpleado[3],Integer.parseInt(partesEmpleado[4]));
        empleados.add(empleado);
        }

        */

        /*

        public String inicialMayusRestoMinus(String dato){
        StringBuilder nuevo = new StringBuilder (Character.toUpperCase(dato.charAt(0))
        nuevo.append(dato.substring(1).toLowerCase());
        return nuevo.toString();
        }

        */

    }
}
