import java.util.Random;
import java.util.Scanner;

public class EjerciciosCondicionales {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);

        int contador = 0, resultado, numero1, numero2, numero3;

        int menu;

        System.out.println
                ("1: Par o impar" + "\n" +
                        "2: Mayor o menor" + "\n" +
                        "3: División !=0" + "\n" +
                        "4: Mes numérico" + "\n" +
                        "5: Edad" + "\n" +
                        "6: OrdenarNúmeros" + "\n" +
                        "7: Siglo XXI" + "\n" +
                        "8: Año bisiesto" + "\n" +
                        "9: Dado" + "\n" +
                        "10: Operaciones" + "\n" +
                        "11: Día semana" + "\n" +


                        "Selecciona el ejercicio: ");
        menu = teclado.nextInt();


        switch (menu) {

            case 1: /*
                Programa que determina si el número introducido es par o impar
                dividiendo el número introducido entre 2, y viendo el resultado
                del resto
                */

                int divisor = 2;

                System.out.println("Introduce un número:");
                numero1 = teclado.nextInt();

                resultado = numero1 % divisor;

                if (resultado == 0) {

                    System.out.println(numero1 + " es un número par");

                } else {

                    System.out.println(numero1 + " es un número impar");

                }

                break;

            case 2: /*
                Programa que determina cuál de los doos números introducidos es mayor
                */

                System.out.println("Introduce un número");
                numero1 = teclado.nextInt();

                System.out.println("Introduce otro número");
                numero2 = teclado.nextInt();

                if (numero1 > numero2) {

                    System.out.println(numero1 + "es mayor que" + numero2);

                } else {

                    System.out.println(numero2 + "es mayor que" + numero1);

                }

                break;

            case 3:/*
                Programa que muestra la división de dos números, si el segundo no es 0
                */

                System.out.println("Introduce un número");
                numero1 = teclado.nextInt();

                System.out.println("Introduce otro número");
                numero2 = teclado.nextInt();

                if (numero2 == 0) {

                    System.out.println("Error, el número debe ser distinto de '0'");

                }

                resultado = numero1 / numero2;

                System.out.println("El resultado de " + numero1 + "/" + numero2 + " es: " + resultado);

                break;

            case 4:/*
                Programa que pide el mes en formato numérico e indica el número de días que tienen
                */

                int mes;

                System.out.println("Introduce un mes en formato numérico");
                mes = teclado.nextInt();

                if (mes == 1 || mes == 3 || mes == 5 || mes == 7
                        || mes == 8 || mes == 10 || mes == 12) {

                    System.out.println("El mes tiene 31 días");

                } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

                    System.out.println("El mes tiene 30 días");

                } else if (mes == 2) {

                    System.out.println("El mes tiene 28 días");
                }

                break;

            case 5:/*
                Programa que pide la edad y muestra según la clasificación.
                */

                int edad;

                System.out.println("Introduce tú edad");
                edad = teclado.nextInt();

                if (edad >= 0 && edad <= 12) {
                    System.out.println("Niñez");

                } else if (edad >= 13 && edad <= 18) {
                    System.out.println("Adolescencia");

                } else if (edad >= 19 && edad <= 33) {
                    System.out.println("Juventud");

                } else if (edad >= 34 && edad <= 65) {
                    System.out.println("Madurez");

                } else if (edad >= 66 && edad <= 79) {
                    System.out.println("Jubilación");

                } else if (edad >= 80 && edad <= 125) {
                    System.out.println("Tercera edad");
                }

                break;

            case 6:

                int mayor = 0, mediano = 0, menor = 0;

                System.out.println("Introduce un número");
                numero1 = teclado.nextInt();
                System.out.println("Introduce otro número");
                numero2 = teclado.nextInt();
                System.out.println("Introduce otro número");
                numero3 = teclado.nextInt();

                if (numero1 == numero2 && numero1 == numero3) {
                    System.out.println("Los números son iguales");

                } else if (numero1 >= numero2 && numero1 >= numero3) {
                    mayor = numero1;
                    if (numero2 >= numero3) {
                        mediano = numero2;
                        menor = numero3;
                    } else {
                        mediano = numero3;
                        menor = numero2;
                    }
                } else if (numero2 >= numero1 && numero2 >= numero3) {
                    mayor = numero2;
                    if (numero1 >= numero3) {
                        mediano = numero1;
                        menor = numero3;
                    } else {
                        mediano = numero3;
                        menor = numero1;
                    }
                } else {
                    mayor = numero3;
                    if (numero1 >= numero2) {
                        mediano = numero1;
                        menor = numero2;
                    } else {
                        mediano = numero2;
                        menor = numero1;
                    }
                }
                System.out.println("Mayor: " + mayor);
                System.out.println("Mediano: " + mediano);
                System.out.println("Menor: " + menor);

                break;

            case 7:

                int dia,dia2 = 0, año;

                System.out.println("Introduce un día");
                dia = teclado.nextInt();
                System.out.println("Introduce un mes");
                mes = teclado.nextInt();
                System.out.println("Introduce un año");
                año = teclado.nextInt();

                //Estos if van a comprobar los días que tiene cada mes, ya que no todos los meses tienen 31 días.
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7
                        || mes == 8 || mes == 10 || mes == 12) {

                    dia2 = 31;

                } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

                    dia2 = 30;

                } else if (mes == 2) {

                    dia2 = 28;

                /*
                Compara el rango de años del siglo xxi, e indica que el día introducido por el usuario
                tiene que ser menor o igual a los días máximos que tiene cada mes.
                */
                }if (año >=2001 && año <= 2099 && dia <= dia2){
                System.out.println(dia + "/" + mes + "/" + año + " es una fecha válida del siglo xxi");
            }else {
                System.out.println("Fecha incorrecta");
            }

                break;

            case 8: //Programa que indica si un año es bisiesto o no.

                //El int año ha sido creado en el case 7.
                System.out.println("Introduce un año");
                año = teclado.nextInt();

                /*
                Si año es divisible entre 4, pero no entre 0, o es divisible por 400, es un año bisiesto.
                */
                if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0){
                    System.out.println(año + " es un año bisiesto");
                }else {
                    System.out.println(año + " no es un año bisiesto");
                }
                break;

            case 9: //Programa que lanza automáticamente un dado de 6 caras e indica la cara opuesta en letras.

                int dado,entero, cadena;

                //Random random crea una instancia random llamada random
                //En la funcion random se indica que dado tiene un rando de 0-5, +1 para asegurarte de que sea 1-6.
                Random random = new Random();
                dado = random.nextInt(6) +1;
                System.out.println("El número es:" + dado);

                switch (dado) {

                    case 1: System.out.println("En la cara opuesta está el 6");
                        break;
                    case 2: System.out.println("En la cara opuesta está el 5");
                        break;
                    case 3: System.out.println("En la cara opuesta está el 4");
                        break;
                    case 4: System.out.println("En la cara opuesta está el 3");
                        break;
                    case 5: System.out.println("En la cara opuesta está el 2");
                        break;
                    case 6: System.out.println("En la cara opuesta está el 1");
                        break;
                }
                break;

            case 10: //Programa que solicita dos números y realiza operaciones con ellos.

                System.out.println("Introduce un número");
                numero1 = teclado.nextInt();

                System.out.println("Introduce otro número");
                numero2 = teclado.nextInt();

                int suma = numero1 + numero2;
                int resta = numero1 - numero2;
                int multiplicacion = numero1 * numero2;

                //Número2 no puede ser 0, porque no se puede dividir entre 0.
                if (numero2 != 0) {
                    //double garantiza que el resultado sea un número en coma flotante con decimales
                    double division = (double) numero1 / numero2;
                    System.out.println("El resultado de la suma de: " + numero1 + " y " + numero2 + " es: " + suma);
                    System.out.println("El resultado de la resta de: " + numero1 + " y " + numero2 + " es: " + resta);
                    System.out.println("El resultado de la multiplicación de: " + numero1 + " y " + numero2 + " es: " + multiplicacion);
                    System.out.printf("El resultado de la división de: %d y %d es: %.2f%n", numero1, numero2, division);
                } else {
                    System.out.println("No se puede dividir por cero.");
                }

                break;

            case 11: //Programa que pide el día de la semana en formato numérico y lo devuelve como palabra.

                int semana;

                System.out.println("Introduce el día de la semana en formato numérico 1-7");
                semana = teclado.nextInt();

                switch (semana){
                    case 1: System.out.println("Lunes");
                        break;
                    case 2: System.out.println("Martes");
                        break;
                    case 3: System.out.println("Miércoles");
                        break;
                    case 4: System.out.println("Jueves");
                        break;
                    case 5: System.out.println("Viernes");
                        break;
                    case 6: System.out.println("Sábado");
                        break;
                    case 7: System.out.println("Domingo");
                        break;
                }

                if (semana <=0 || semana >= 8) {
                    System.out.println("Error");
                }
                break;

        }
    }
}