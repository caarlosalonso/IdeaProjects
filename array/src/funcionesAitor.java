import java.util.Scanner;
public class funcionesAitor {
    //    - Mostrar los elementos en vertical   (imprimirArrayEnVertical)
    public static void imprimirEnterosEnVertical(int[] array) {
        for (int i : array) System.out.println(i);
    }

    //    - Mostrar los elementos en horizontal
    public static void imprimirEnterosEnHorizontal(int[] array) {
        for (int i : array) System.out.print(i + " ");
    }

    //    - Mostrar los elementos en horizontal, separados por comas
    public static void imprimirEnterosEnHorizontalConComas(int[] array) {
        System.out.print(array[0]);
        for (int i = 1; i < array.length; i++) {
            System.out.print("," + array[i]);
        }
    }

    //    - Rellenar todo el array con un valor
    public static void rellenarArray(int[] array,int valor) {
        for (int i = 0; i < array.length; i++) {
            array[i] = valor;
            System.out.println(array[i]);
        }
    }

    //    - Devolver una copia del array
    public static int[] copiarArrayEnteros(int[] array) {
        int[] nuevoArray = new int[array.length];
        for (int i = 0; i < array.length; i++) nuevoArray[i] = array[i];
        return nuevoArray;
    }

    //    - Devolver un trozo (indicando inicio y fin de la zona a extraer)
    public static int[] copiarArrayEnterosEntreXY(int[] array) {

        int inicio, fin;
        Scanner teclado = new Scanner(System.in);
        boolean salirBucle = false;
        System.out.println("[+] La longitud del array es de: " + array.length + "\n[+] Dame un inicio y un fin entre 0 y " + (array.length - 1) + "\n[+] Recuerda que el inicio no puede ser igual o mayor que el fin");
        do {
            System.out.println();
            System.out.print("[?] Dame un inicio -> ");
            inicio = teclado.nextInt();
            System.out.print("[?] Dame un fin -> ");
            fin = teclado.nextInt();
            if (inicio < fin && inicio >= 0 && fin < array.length) salirBucle = true; //se cumplen los requisitos, se sale del bucle
            else System.out.println("[!] Los valores proporcionados no cumplen los requisitos previos");
        } while (!salirBucle);
        int longitud = fin-inicio;
        int[] nuevoArray = new int[longitud];
        for (int i = inicio; i < fin; i++) nuevoArray[i-longitud] = array[i];
        return nuevoArray;
    }
    //    - Función que diga si dos arrays son iguales
    public static boolean sonIgualesArraysEnteros (int [] array1,int [] array2 ){
        if (array1.length!=array2.length) return false; //si tienen distinta longitud son distintos
        for (int i=0;i<array1.length;i++) if (array1[i]!=array2[i]) return false;
        return true;
    }
    //        - Desordenar el array
    public static void desordenarArrayEnteros (int [] array) {
        int random,randomPos,randomPosDos,auxiliar;
        for (int o = 0; o < 10; o++) { //se repite 10 veces este proceso
            for (int i = 0; i < array.length; i++) { // itera tantas veces como posiciones tiene el array
                random = (int) (Math.random() * 2);
                if (random == 1) { //si un número aleatorio cuyo valor es 1 o 0 sale 1, se generan 2 posiciones, el valor de la primera se almacena en un auxiliar, la primera almacena el valor de la segunda y la segunda el valor de la auxiliar que era el anterior de la primera
                    randomPos = (int) (Math.random() * array.length);
                    randomPosDos = (int) (Math.random() * array.length);
                    auxiliar = array [randomPos];
                    array [randomPos] = array [randomPosDos];
                    array [randomPosDos] = auxiliar;
                }
            }
        }
    }
    //    - Ordenar el array
    public static void ordenarArray (int [] array) {
        boolean salirBucle = false;
        int auxiliar;
        do { //no sale del bucle hasta que haga un barrido sin ningún cambio
            salirBucle=true;
            for (int i=0;i<array.length-1;i++){ //recorre el bucle hasta la penultima posición pero llegando a comparar con la última
                if (array[i] > array[i+1]){ //si el primero es mayor que el segundo, intercambia las posiciones y marca que ha habido un cambio
                    auxiliar = array [i];
                    array [i] = array[i+1];
                    array [i+1] = auxiliar;
                    salirBucle=false;
                }
            }
        } while (!salirBucle);
    }
}