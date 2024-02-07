import java.util.Scanner;

public class EjerciciosMultiplicaciones {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);

        int contador = 0, nmultiplicacion=10, numero, numero1=0, numero7=7, multiplicacion = 0, resultado = 0;

        int menu;
        System.out.println
                ("1: Tabla de multiplicar del n=7" + "\n" +
                        "2: Tabla de multiplicar n=x" + "\n" +
                        "3: Tabla de multiplicar inversa" + "\n" +
                        "4: <100 se solicita + tabla de multiplicar" + "\n" +
                        "5: Pares e impares" + "\n" +
                        "6: Tabla del 1 al 10" + "\n" +
                        "7: tabla de 'X' a 'Y'" +"\n" +
                        "Introduce un numero: ");
        menu = teclado.nextInt();

        switch (menu) {

            case 1: //En este caso mostraremos la tabla de multiplicar del '7'.

                resultado = numero7 * multiplicacion;

                System.out.println(numero7 + "*0" + "=" + resultado);
                multiplicacion++;
                contador++;

                while (contador < 11) {

                    resultado = numero7 * multiplicacion;

                    System.out.println(numero7 + "*" + multiplicacion + "=" + resultado);

                    multiplicacion++;
                    contador++;
                }

                break;

            case 2: //En este caso mostraremos la tabla de multiplicar del número que sea introducido.

                System.out.println("Introduce un numero: ");
                numero = teclado.nextInt();

                resultado = numero * multiplicacion;

                System.out.println(numero + "*0" + "=" + resultado);
                multiplicacion++;
                contador++;

                while (contador < 11) {

                    resultado = numero * multiplicacion;

                    System.out.println(numero + "*" + multiplicacion + "=" + resultado);

                    multiplicacion++;
                    contador++;
                }
                break;

            case 3: //En este caso mostraremos la tabla de multiplicar inversa del número que sea introducido.

                System.out.println("Introduce un numero: ");
                numero = teclado.nextInt();

                //Utilizamos una variable llamada nmuliplicación, que comienza en '10'.
                while (contador < 11) {

                    resultado = numero * nmultiplicacion;

                    System.out.println(numero + "*" + nmultiplicacion + "=" + resultado);

                    nmultiplicacion--;
                    contador++;
                }

                break;

            case 4: /*En este caso indicaremos que si el número introducido es menor que 100 se volverá a solicitar,
                de lo contrario se mostrará su tabla de multiplicar*/

                System.out.println("Introduce un numero: ");
                numero = teclado.nextInt();

                while (numero < 100) {

                    System.out.println("Introduce otro numero: ");
                    numero = teclado.nextInt();

                }

                resultado = numero * multiplicacion;

                System.out.println(numero + "*0" + "=" + resultado);
                multiplicacion++;
                contador++;

                while (contador < 11) {

                    resultado = numero * multiplicacion;

                    System.out.println(numero + "*" + multiplicacion + "=" + resultado);

                    multiplicacion++;
                    contador++;
                }
                break;

            case 5: /*En este caso indicaremos que si el número introducido es menor que 100, mostrará la tabla de los
            pares y si es mayor que 100, mostrará la tabla de los impares.*/

                System.out.println("Introduce un numero: ");
                numero = teclado.nextInt();

                if (numero < 100) {

                    multiplicacion = multiplicacion + 2;

                    resultado = numero * multiplicacion;

                    System.out.println(numero + "*0" + "=" + resultado);

                    contador++;

                    while (multiplicacion < 11) {

                        resultado = numero * multiplicacion;

                        System.out.println(numero + "*" + multiplicacion + "=" + resultado);

                        multiplicacion = multiplicacion + 2;
                        contador++;
                    }

                }
                else if (numero >= 100) {

                    multiplicacion = multiplicacion + 1;

                    resultado = numero * multiplicacion;

                    System.out.println(numero + "*0" + "=" + resultado);

                    contador++;

                    while (multiplicacion < 11) {

                        resultado = numero * multiplicacion;

                        System.out.println(numero + "*" + multiplicacion + "=" + resultado);

                        multiplicacion = multiplicacion + 2;
                        contador++;
                    }
                }
                break;

            case 6: //Muestra la tabla del 1 al 10, para los números del 1 al 10.

                while (numero1<11) {

                    System.out.println("La tabla de multiplicar del " + numero1);
                    
                    resultado = numero1 * multiplicacion;

                    while (multiplicacion < 11) {

                        System.out.println(numero1 + "*" + multiplicacion + "=" + resultado);

                        multiplicacion++;
                    }

                    //Con esta función detenemos la ejecución del programa durante 2.5s (se pone en ms)
                    Thread.sleep(2500);

                    multiplicacion = 0;
                    numero1++;
                }

            case 7: //Muestra la tabla del 1 al 10, para los números comprendidos entre los dos que se introduzcan por teclado

                int numero2, numero3, acumulador;

                System.out.println("Introduce un numero: ");
                numero2 = teclado.nextInt();

                System.out.println("Introduce otro numero: ");
                numero3 = teclado.nextInt();

                //En esta función asignamos el numero3 al acumulador, para que intercambie valores con el número2, y de esta forma los ordenamos.
                if (numero3<numero2) {
                    acumulador = numero3;
                    numero3 = numero2;
                    numero2 = acumulador;
                }

                while (numero2 <= numero3) {

                    System.out.println("La tabla de multiplicar del " + numero2);

                    resultado = numero2 * multiplicacion;

                    while (multiplicacion <= 10) {

                        System.out.println(numero2 + "*" + multiplicacion + "=" + resultado);

                        multiplicacion++;
                    }

                    //Con esta función detenemos la ejecución del programa durante 2.5s (se pone en ms)
                    Thread.sleep(2500);

                    multiplicacion = 0;
                    numero2++;
                }

                break;
        }
    }
}