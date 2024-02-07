import java.util.Scanner;

public class MiRepaso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre ="Carlos Alonso Cubillo";

        // a. Mostrar los caracteres de un String, uno a uno

        //Se crea un bucle for que recorre la frase monstrando los carácteres.
        for(int posicion=0; posicion<nombre.length();posicion++){
            System.out.println(nombre.charAt(posicion));
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        // b. Comparar dos String y decir si son iguales o no.

        String frase = "carlos alonso cubillo";

        boolean comparar = nombre.equals(frase);

        if(comparar == true){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        // c. Comparar dos String y decir si son el mismo objeto String.

        String str1 = "Hola mundo";
        String str2 = "Hola mundo";

        if(str1 == str2){
            System.out.println("Son el mismo objeto");
        }else{
            System.out.println("No son el mismo objeto");
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        // d. Comparar dos String y decir si son iguales o no, sin tener en cuenta las mayúsculas/minúsculas.

        boolean comparar2 = nombre.equalsIgnoreCase(frase);

        if (comparar2 == true){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        // e. Comprobar si un String empieza con una cadena determinada.

        String palabra = "Carlos";

        boolean empiezaPor = nombre.startsWith(palabra);

        if (empiezaPor == true){
            System.out.println(nombre + " empieza por: " + palabra);
        }else{
            System.out.println(nombre + " no empieza por: " + palabra);
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        // f. Comprobar si un String finaliza con una cadena determinada.

        boolean terminaPor = nombre.endsWith(palabra);

        if (terminaPor == true){
            System.out.println(nombre + " termina por: " + palabra);
        }else{
            System.out.println(nombre + " no termina por: " + palabra);
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        // g. Extraer una parte de un String, indicando el inicio y el fin, de dicha parte

        /* Busca el contenido entre el primer y el segundo espacio, para hacer el segundo espacio se meter un indexOf
        dentro de otro */
        String primerApellido = nombre.substring(nombre.indexOf(" ")+1, nombre.indexOf(" ",nombre.indexOf(" ")+1));
        System.out.println("Entre el primer y segundo espacio esta: " + primerApellido);

        System.out.println("-----------------------------------------------------------------------------------------");

        // h. Indicar en que posición de un String, aparece por primera vez un carácter.

        String letra = "a";

        int posicionLetra = nombre.indexOf(letra)+1;
        System.out.println("La primera vez que aparece " + letra + " es en la posicion: " + posicionLetra);

        System.out.println("-----------------------------------------------------------------------------------------");

        //  i. Indicar en que posición de un String, aparece por primera vez otro String.

        String segundoApellido = "Cubillo";

        int posicionString = nombre.indexOf(segundoApellido)+1;
        System.out.println("La primera vez que aparece " + segundoApellido + " es en la posicion: " + posicionString);

        System.out.println("-----------------------------------------------------------------------------------------");

        // j. Generar un String que sea resultado de concatenar dos Strings.

        String concatenar = palabra.concat(segundoApellido);
        System.out.println("El resultado de concatenar " + palabra + " " + segundoApellido  + " es: " + concatenar);

        System.out.println("-----------------------------------------------------------------------------------------");

        // k. Generar un String, reemplazando todas las apariciones de un carácter, por otro carácter.

        //De esta forma se convierte el String a minusculas, para que convierta tanto las minusculas, como las mayusculas.
        String reemplazarTodo = nombre.toLowerCase().replaceAll("a","x");
        System.out.println("El resultado de reemplazar todas las 'a' por 'x' es: " + reemplazarTodo);

        //De esta forma se ponen unos caracteres especiales, para que convierta la letra mayuscula y la minuscula.
        reemplazarTodo = nombre.replaceAll("[aA]","x");
        System.out.println("El resultado de reemplazar todas las 'a' por 'x' es: " + reemplazarTodo);

        System.out.println("-----------------------------------------------------------------------------------------");

        // l. Generar un String, reemplazando todas las apariciones de un String, por otro String.

        String Frase = "Mundo Hola mundo Mundo";
        String reemplazar = "Mundo";

        //Convertimos el String inicial y el String a reemplazar a minusculas
        String ReemplazarString = Frase.toLowerCase().replaceAll(reemplazar.toLowerCase()," ");
        System.out.println("El resultado de reemplazar " + reemplazar + " es: " + ReemplazarString);

        System.out.println("-----------------------------------------------------------------------------------------");

        // m. Generar un String, reemplazando la primera aparición de un String, por otro String.

        //Es una modificación del ejercicio de arriba, en lugar de reemplazar todos los mundo, remplazamos el primero.
        ReemplazarString = Frase.toLowerCase().replaceFirst(reemplazar.toLowerCase(), " ");
        System.out.println("El resultado de reemplazar el primer: " + reemplazar + " es: " + ReemplazarString);

        System.out.println("-----------------------------------------------------------------------------------------");

        // n. Generar un String con todos los caracteres de otro String, en Mayúsculas.

        //Con substring cogemos el String nombre y lo convertimos en mayusculas.
        String upperString = nombre.substring(0).toUpperCase();
        System.out.println("Substring mayusculas: " + upperString);
        System.out.println("String normal: " + nombre);

        System.out.println("-----------------------------------------------------------------------------------------");

        // o. Generar un String con todos los caracteres de otro String, en Minúsculas.

        //Con substring cogemos el String nombre y lo convertimos en minusculas.
        String lowerString = nombre.substring(0).toLowerCase();
        System.out.println("Substring minusculas: " + lowerString);
        System.out.println("String normal: " + nombre);

        String oracion = "queso";
        System.out.println(oracion.length());

    }
}
