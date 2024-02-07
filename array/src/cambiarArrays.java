public class cambiarArrays {
    public static void main(String[] args) {
        int [] enteros = {1,2,3};
        System.out.println("Mostramos el array");
        for(int numero:enteros){
            System.out.println(numero + " ");
        }

        System.out.println("Cambiamos el array");
        cambiarArray(enteros);

        System.out.println("Mostramos el array después del cambio");
        for(int numero:enteros){
            System.out.println(numero + " ");
        }
    }
    public static void cambiarArray(int[] numeros){
        numeros[0] = 3;
        numeros[1] = 3;
        numeros[2] = 3;

    }
}
