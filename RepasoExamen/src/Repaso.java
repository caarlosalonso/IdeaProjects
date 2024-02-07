
public class Repaso {
    public static void main(String[] args) {
        String nombre ="Jaime Martin Garcia-Cuerva";

        //Muestra la longitud del string
        int longitud= nombre.length();
        System.out.println("Longitud "+longitud);

        //Muestra el último carácter del string
        char letra = nombre.charAt(longitud-1);
        System.out.println("Ultima letra es "+letra);

        int posicionLetra = nombre.indexOf("cia");
        System.out.println("Posicion letra cia "+posicionLetra);
        posicionLetra = nombre.indexOf("a");
        System.out.println("Primera Posicion letra a "+posicionLetra);
        posicionLetra = nombre.indexOf("a",posicionLetra+1);
        System.out.println("Segunda Posicion letra a "+posicionLetra);

        //CompareTo
        int comparar= nombre.compareTo("Jaime Ortega García");
        System.out.println("Jaime Ortega García " + comparar);

        //equals
        String nombre2= nombre;
        System.out.println(nombre == nombre2);
        nombre2="Jaime Martin Garcia-Cuerva";
        System.out.println(nombre == nombre2);
        nombre2=new String("Jaime Martin Garcia-Cuerva");
        System.out.println(nombre == nombre2);
        System.out.println("Son iguales ?? "+nombre.equals(nombre2));

        //contains
        boolean contiene= nombre.contains("cia");
        System.out.println("Contiene cia "+contiene);

        //endsWith o starsWith
        boolean empiezaPor = nombre.startsWith("cia");
        System.out.println("Empieza por cia  "+empiezaPor);
        boolean terminaPor = nombre.endsWith("cia");
        System.out.println("Termina por cia  "+terminaPor);
        System.out.println();

        //ReplaceAll y replaceFirst
        String nombreModificado= nombre.replaceAll("a","XXXX");
        System.out.println(nombreModificado);
        String nombreModificadoPrimeraAparicion= nombre.replaceFirst("a","XXXX");
        System.out.println(nombreModificadoPrimeraAparicion);

        //toUpperCase  toLowerCase
        String nombreMayusculas= nombre.toUpperCase();
        System.out.println("Mayusculas "+nombreMayusculas);
        String nombreMinusculas = nombre.toLowerCase();
        System.out.println("Minusculas "+nombreMinusculas);


        //substring
        //String soloNombre= nombre.substring(0,5);
        String soloNombre= nombre.substring(0,nombre.indexOf(" "));
        System.out.println(soloNombre);
        System.out.println();

        //trim
        String nombreConEspacios = "       Alfredo    Lopez    ";
        String nombreSinEspacios= nombreConEspacios.trim();
        System.out.println("Nombre sin espacios "+nombreSinEspacios);
        System.out.println( );

        //split
        String[] trozos= nombre.split(" ");
        for(String trozo:trozos){
            System.out.println(trozo);
        }


    }



}