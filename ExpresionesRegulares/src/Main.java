import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Mostrando opciones:"
                    + "\n 1 - Comprobar que un nombre contiene solo una mayúscula"
                    + "\n 2 - Comprobar un código postal español"
                    + "\n 3 - Comprobar que la fechas cumplen el formato dd/mm/aaaa"
                    + "\n 4 - Comprobar que un NIF está formado por 8cifras, un guión y una letra"
                    + "\n 5 - Comprobar una matricula actual"
                    + "\n 6 - Comprobar una matricula de los años 90"
                    + "\n 7 - "
                    + "\n 0 - Salir"
            );
            System.out.println("Elige una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    comprobarNombre();
                    break;
                case 2:
                    comprobarCP();
                    break;
                case 3:
                    fechaValida();
                    break;
                case 4:
                    comprobarNIF();
                    break;
                case 5:
                    comprobarMatricula();
                    break;
                case 6:
                    comprobarMatriculaOld();
                    break;
                case 7:
                    comprobarCorreo();
                    break;
                case 0:
                    break;
            }
        } while (opcion != 0);
    }

    public static void comprobarNombre() {
        //Para comprobar que un nombre empieza por mayúscula y que contiene minúsculas
        Scanner teclado = new Scanner(System.in);

        String nombreRegex = "[A-Z]{1}[a-z]+";

        System.out.println("Introduce el nombre a comprobar: ");
        String nombre = teclado.nextLine();
        if (Pattern.matches(nombreRegex, nombre)) {
            System.out.println("Cumple los requisitos");
        } else {
            System.out.println("No cumple los requisitos");
        }
    }
    public static void comprobarCP() {
        //Comprobar un código postal español
        Scanner teclado = new Scanner(System.in);

        String cpRegex = "[0-9]{5}";

        System.out.println("Introduce el codigo postal a comprobar: ");
        String codigoPostal = teclado.nextLine();
        if (Pattern.matches(cpRegex, codigoPostal)) {
            System.out.println("Cumple los requisitos");
        } else {
            System.out.println("No cumple los requisitos");
        }
    }
    public static void fechaValida(){
        //Comprobar que la fecha cumple el patrón dd/mm/aaaa
        Scanner teclado = new Scanner(System.in);

        String fechaRegex = "\\d{1,2}/\\d{1,2}/\\d{4}";

        System.out.println("Introduce la fecha a comprobar: ");
        String fecha = teclado.nextLine();
        if (Pattern.matches(fechaRegex,fecha)){
            System.out.println("Cumple los requisitos");
        }else{
            System.out.println("No cumple los requisitos");
        }
    }
    public static void comprobarNIF(){
        //Comprobar que el NIF está formado por 8 cifras, un guión y una letra
        Scanner teclado = new Scanner(System.in);

        String nifRegex = "\\d{8}-[a-z]";

        System.out.println("Introduce el NIF a comprobar: ");
        String nif = teclado.nextLine().toLowerCase();
        if (Pattern.matches(nifRegex,nif)){
            System.out.println("Cumple los requisitos");
        }else {
            System.out.println("No cumple los requisitos");
        }
    }
    public static void comprobarMatricula(){
        //Comprobar la matricula de un coche actual
        Scanner teclado = new Scanner(System.in);

        String matriculaRegex = "\\d{4}[A-Z]{3}";

        System.out.println("Introduce la matricula a comprobar: ");
        String matricula = teclado.nextLine().toUpperCase();
        if (Pattern.matches(matriculaRegex,matricula)){
            System.out.println("Cumple los requisitos");
        }else {
            System.out.println("No cumple con los requisitos");
        }
    }
    public static void  comprobarMatriculaOld(){
        //Comprobar una matricula de los años 90
        Scanner teclado = new Scanner(System.in);

        String matriculaRegex = "[A-Z]{1,2}\\d{4}[A-Z]{1,2}";

        System.out.println("Introduce la matricula a comprobar: ");
        String matricula = teclado.nextLine().toUpperCase();
        if (Pattern.matches(matriculaRegex,matricula)){
            System.out.println("Cumple los requisitos");
        }else {
            System.out.println("No cumple con los requisitos");
        }
    }
    public static void comprobarCorreo(){
        //Comprobar una dirección de correo electrónico
        Scanner teclado = new Scanner(System.in);

        String correoRegex = "[a-z0-9._-]+@gmail.com";

        System.out.println("Introduce la dirección de correo a comprobar: ");
        String correo = teclado.nextLine().toLowerCase();
        if (Pattern.matches(correoRegex,correo)){
            System.out.println("Cumple los requisitos");
        }else {
            System.out.println("No cumple con los requisitos");
        }
    }
}