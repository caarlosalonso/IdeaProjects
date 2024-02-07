import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoFunciones {

    //Mostrar empleados con el formato de nombre correcto
    public static void mostrarDatos(ArrayList<Empleado>listaEmpleados){
        String[] datosIniciales = {
                "11111111A aitor tilla informática 60000",
                "22222222B ester colero logística 34000",
                "33333333C andRés trozado informática 56000",
                "44444444D armAndo ruido logística 39000",
                "55555555E dolores fuertes comercial 45000",
                "66666666F enrique cide comercial 48000",
                "77777777F estela gartija logística 52000",
                "88888888G josechu leton informática 49000",
                "99999999H lola mento informática 51000"};

        for(String unEmpleado:datosIniciales){
            String[] partesEmpleado = unEmpleado.split(" ");
            Empleado empleado = new Empleado(partesEmpleado[0],
                    inicialMayusRestoMinus(partesEmpleado[1]),
                    inicialMayusRestoMinus(partesEmpleado[2]),
                    inicialMayusRestoMinus(partesEmpleado[3]),
                    Integer.parseInt(partesEmpleado[4]));

            listaEmpleados.add(empleado);
            System.out.println(empleado);
        }
    }
    public static String inicialMayusRestoMinus(String dato){
        return Character.toUpperCase(dato.charAt(0)) + dato.substring(1).toLowerCase();
    }

    //Dar de alta a empleados
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

            //Mostramos la lista de empleados para comprobar el resultado
            for (Empleado empleado:listaEmpleados){
                System.out.println(empleado);
            }
        }
    }
    //Buscar a empleado por DNI, mostrando solo: DNI, nombre y sueldo
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

    //Buscar todos los empleados de un departamento
    public static void mostrarDepartamento(ArrayList<Empleado>listaEmpleados){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el departamento que quiere buscar: ");
        String departamento = teclado.nextLine();

        for (Empleado empleado:listaEmpleados){

            if(empleado.getDepartamento().equals(departamento)){
                System.out.println(empleado);
            }
        }
    }

    //Borar Empleado por el DNI
    public static void borrarEmpleado(ArrayList<Empleado>listaEmpleados){
     Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el DNI que buscas: ");
        String DNI = teclado.nextLine();

        //Creamos un empleado con ese DNI
        Empleado empleadoAux = new Empleado(DNI);

        //Comprobamos si está en la lista
        if (listaEmpleados.contains(empleadoAux)){
            listaEmpleados.remove(empleadoAux); //Como está en la lista lo borramos
            System.out.println("Se ha borrado el empleado con DNI= " +DNI);
            //Mostramos la lista de empleados para comprobar el resultado
            for (Empleado empleado:listaEmpleados){
                System.out.println(empleado);
            }
        }else{ //Si no está en la lista mostramos un mensaje
            System.out.println("El DNI no está en la lista");
        }
    }
    //Busca a los empleados comprendidos entre dos sueldos
    public static void buscarEmpleadoComprendido(ArrayList<Empleado>listaEmpleados){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Para buscar los empleados entre dos sueldos: ");

        System.out.println("Introduce el primer sueldo");
        Integer primerSueldo = teclado.nextInt();
        System.out.println("Introduce el segundo sueldo");
        Integer segundoSueldo = teclado.nextInt();

        //Bucle for que recorre la lista de empleados, buscando los empleados que tengan menos de 'X' y más de 'y'
        for (Empleado empleado:listaEmpleados){
            if(empleado.getSueldo() >= primerSueldo && empleado.getSueldo()<=segundoSueldo){
                System.out.println(empleado);
            }
        }
    }
    //Sube el sueldo a un empleado buscado por DNI
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
            System.out.println("Introduce la variacion del salario(en formato numérico): ");
            Integer variacion = teclado.nextInt();
            empleadoEncontrado.subirSalario(variacion);
            System.out.println(empleadoEncontrado);
        }else {
            System.out.println("El DNI introducido no está en la lista.");
        }
    }

    public static void anadirDatos(ArrayList<Empleado>listaEmpleados){
        String[] datosIniciales = {
                "11111111A aitor tilla informática 60000",
                "22222222B ester colero logística 34000",
                "33333333C andRés trozado informática 56000",
                "44444444D armAndo ruido logística 39000",
                "55555555E dolores fuertes comercial 45000",
                "66666666F enrique cide comercial 48000",
                "77777777F estela gartija logística 52000",
                "88888888G josechu leton informática 49000",
                "99999999H lola mento informática 51000"};

        for(String unEmpleado:datosIniciales){
            String[] partesEmpleado = unEmpleado.split(" ");
            Empleado empleado = new Empleado(partesEmpleado[0],
                    inicialMayusRestoMinus(partesEmpleado[1]),
                    inicialMayusRestoMinus(partesEmpleado[2]),
                    inicialMayusRestoMinus(partesEmpleado[3]),
                    Integer.parseInt(partesEmpleado[4]));

            listaEmpleados.add(empleado);
        }
    }
}
