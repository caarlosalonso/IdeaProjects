import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);

        int menu, numero, numero2, resultado;

        do {
            System.out.println
                    ("1: Sumar " + "\n" +
                            "2: Restar  " + "\n" +
                            "3: Multiplicar  " + "\n" +
                            "4: Dividir " + "\n" +
                            "5: Potencia  " + "\n" +
                            "6: Factorial  " + "\n" +

                            "Selecciona la opción: ");
            menu = teclado.nextInt();


            switch (menu) {

                case 1:
                    System.out.println("SUMAR");

                    resultado = 0;

                    System.out.print("Introduce un número: ");
                    numero = teclado.nextInt();

                    System.out.print("Introduce otro número: ");
                    numero2 = teclado.nextInt();

                    resultado = numero + numero2;

                    System.out.println("El resultado de la suma es: " + resultado);

                    break;

                case 2:
                    System.out.println("RESTAR");

                    resultado = 0;

                    System.out.print("Introduce un número: ");
                    numero = teclado.nextInt();

                    System.out.print("Introduce otro número: ");
                    numero2 = teclado.nextInt();

                    resultado = numero - numero2;

                    System.out.println("El resultado de la resta es: " + resultado);
                    break;

                case 3:
                    System.out.println("MULTIPLICACIÓN");

                    resultado = 0;

                    System.out.print("Introduce un número: ");
                    numero = teclado.nextInt();

                    System.out.print("Introduce otro número: ");
                    numero2 = teclado.nextInt();

                    resultado = numero * numero2;

                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;

                case 4:
                    System.out.println("DIVISION");

                    int dividendo, divisor;
                    double division;

                    //Introduce dividendo y divisor.
                    System.out.print("Introduce un número: ");
                    dividendo = teclado.nextInt();

                    System.out.print("Introduce un número: ");
                    divisor = teclado.nextInt();

                    //Muestra el resultado.
                    division = division(dividendo, divisor);
                    System.out.println("El resultado de la división es: " + division);

                    break;

                case 5:
                    System.out.println("POTENCIA");

                    int base, exponente;

                    //Introduce los valores principales de la función, repitiendo en bucle en caso de que el exponente sea menor de 0.
                    System.out.print("Introduce la base:");
                    base = teclado.nextInt();

                    System.out.print("Introduce el exponente:");
                    exponente = teclado.nextInt();

                    //Esta es la última parte, que recoge el return para mostrar el resultado.
                    System.out.println(potencia(base, exponente));

                    break;

                case 6:
                    System.out.println("FACTORIAL");
                    int resultadofactorial, factorial;

                    System.out.println("Introduce un número: ");
                    numero = teclado.nextInt();

                    resultado = factorial(numero);
                    System.out.println("El factorial es: " + resultado);
            }

        } while (menu > 0);
    }

    public static double division(int dividendo, int divisor) {
        Scanner teclado = new Scanner(System.in);
        int division;

        while (divisor == 0) {
            System.out.print("Introduce otro número, (El divisor no puede ser cero): ");
            divisor = teclado.nextInt();

        }

        //Realiza la operacion.
        double resultado = (double) dividendo / divisor;

        //Devuelve el valor
        return resultado;
    }

    public static int potencia(int base, int exponente) {
        Scanner teclado = new Scanner(System.in);

        int potencia=1;

        while (exponente < 0) {
            System.out.print("Introduce otro número, (El exponente no puede ser menor de cero): ");
            exponente = teclado.nextInt();
        }

        for (int contador = 1; contador <= exponente; contador++) {
            potencia *= base;
        }
        //Devuelve el valor potencia a la primera parte para mostrar el resultado.
        return potencia;
    }

    public static int factorial(int numero) {

        int resultado = 1;

        /*
        int i representa el 'acumulador' que se detiene cuando es igual al número que ha
        introducido el usuario.
        */
        for (int i = 1; i <= numero; i++) {

            resultado *= i;
        }
        //Devuelve el valor
        return resultado;
    }


}