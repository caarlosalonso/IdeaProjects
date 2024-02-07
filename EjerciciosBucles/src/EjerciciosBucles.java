import java.util.Random;
import java.util.Scanner;

public class EjerciciosBucles {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);

        int menu;

        System.out.println
                       ("1: Números con bucles" + "\n" +
                        "2: Factorial " + "\n" +
                        "3: Números pares " + "\n" +
                        "4: Tabla de multiplicar " + "\n" +
                        "5: Sueldo por horas " + "\n" +
                        "6: Tabla de multiplicar (1,2,3,4 y 5)" + "\n" +
                        "7: Potencia " + "\n" +
                        "8: Suma y media " + "\n" +
                        "9: Menú  " + "\n" +
                        "10: Calculadora " + "\n" +
                        "11: Adivinar el número " + "\n" +

                        "Selecciona el ejercicio: ");
        menu = teclado.nextInt();


        switch (menu) {

            case 1:
                int numero = 0;

                //Bucle do while 1-20
                System.out.println("Bucle do-while 1-20:");
                do {
                    numero = numero + 1;
                    System.out.print(numero + " ");
                    Thread.sleep(250);
                } while (numero < 20);

                System.out.println();
                numero = 0;

                //Bucle while 1-20
                System.out.println("Bucle while 1-20:");
                while (numero < 20){
                    numero++;
                    System.out.print(numero + " ");
                    Thread.sleep(250);
                }

                System.out.println();

                //Bucle for 1-20
                System.out.println("Bucle for 1-20:");
                for(numero = 1; numero <= 20; numero++){
                    System.out.print(numero + " ");
                    Thread.sleep(250);
                }

                System.out.println();

//----------------------------------------------------------------------------------------------------------------------

                //Bucle do while 20-1
                System.out.println("Bucle do-while 20-1:");
                do {
                    numero--;
                    System.out.print(numero + " ");
                    Thread.sleep(250);
                } while (numero > 1);

                System.out.println();
                numero = 20;

                //Bucle while 20-1
                System.out.println("Bucle while 20-1:");
                while (numero > 0){
                    System.out.print(numero + " ");
                    numero--;
                    Thread.sleep(250);
                }

                System.out.println();

                //Bucle for 20-1
                System.out.println("Bucle for 20-1:");
                for(numero = 20; numero > 0; numero--){
                    System.out.print(numero + " ");
                    Thread.sleep(250);
                }

                System.out.println();

//----------------------------------------------------------------------------------------------------------------------
                //Bucle do while salto de 3
                System.out.println("Bucle do-while salto de 3:");
                do {
                    numero = numero + 3;
                    System.out.print(numero + " ");
                    Thread.sleep(250);
                } while (numero < 20);

                System.out.println();
                numero = 0;

                //Bucle while salto de 3
                System.out.println("Bucle while salto de 3:");
                while (numero < 20){
                    numero = numero + 3;
                    System.out.print(numero + " ");
                    Thread.sleep(250);
                }

                System.out.println();

                //Bucle for salto de 3
                System.out.println("Bucle for salto de 3:");
                for(numero = 3; numero < 23; numero = numero + 3){
                    System.out.print(numero + " ");
                    Thread.sleep(250);
                }

                System.out.println();
                numero = 0;
//----------------------------------------------------------------------------------------------------------------------
                //Bucle do while salto de 10
                System.out.println("Bucle do-while salto de 10:");
                do {
                    numero = numero + 10;
                    System.out.print(numero + " ");
                    Thread.sleep(250);
                } while (numero < 20);

                System.out.println();
                numero = 0;

                //Bucle while salto de 10
                System.out.println("Bucle while salto de 10:");
                while (numero < 20){
                    numero = numero + 10;
                    System.out.print(numero + " ");
                    Thread.sleep(250);
                }

                System.out.println();

                //Bucle for salto de 10
                System.out.println("Bucle for salto de 10:");
                for(numero = 10; numero < 30; numero = numero + 10){
                    System.out.print(numero + " ");
                    Thread.sleep(250);
                }

                break;

            case 2: //Factorial de 'x'

                int resultado = 1;

                System.out.println("Introduce un número: ");
                numero = teclado.nextInt();

                /*
                int i representa el 'acumulador' que se detiene cuando es igual al número que ha introducido el usuario.
                */
                for (int i = 1; i <= numero; i++) {

                    resultado *= i;
                }

                System.out.println("El factorial de " + numero + " es " + resultado);

                break;

            case 3:

                int numero2;

                System.out.println("Introduce un número");
                numero = teclado.nextInt();

                System.out.println("Introduce otro número");
                numero2 = teclado.nextInt();

                System.out.println("Números pares entre " + numero + " y " + numero2 + ":");

                //En caso de que 'número' sea mayo que 'número2' se manda al else.
                if (numero2 > numero) {

                    /*
                    'i' toma el valor de 'número' se le van sumando unos hasta que es menor o igual a numero2,
                    si el resto de ese rango de números es 0 al dividirlos entre 2 son números pares.
                    */

                    for (int i = numero; i <= numero2; i++) {

                        if (i % 2 == 0) {
                            System.out.println(i);
                            Thread.sleep(250);
                        }
                    }
                }else {

                    //Lo mismo que arriba, pero invirtiendo los números para poder establecer el rango.
                    for (int i = numero2; i <= numero; i++) {

                        if (i % 2 == 0) {
                            System.out.println(i);
                            Thread.sleep(250);
                        }
                    }
                }

            case 4:

                int multiplicador = 0;

                System.out.println("Introduce un número");
                numero = teclado.nextInt();

                do {

                    resultado = numero * multiplicador;
                    System.out.println(numero + " * " + multiplicador + " = " + resultado);
                    multiplicador++;

                }while (multiplicador < 11);

                break;

            case 5:

                int horas, precio = 15, sueldod = 0, sueldof = 0, dia = 0;

                //sueldod se refiere al sueldo diario, mientras que sueldof es el acumulador y sueldo final.
                do {

                    System.out.println("Introduce el número de horas trabajadas");
                    horas = teclado.nextInt();

                    sueldod = horas * precio;
                    dia++;

                    System.out.println(horas + " horas trabajadas equivalen a: " + sueldod);

                    sueldof = sueldof + sueldod;

                } while (dia < 5);

                System.out.println("El sueldo equivalente a " + dia + " es: " + sueldof);

                break;

            case 6:

                //Genera el enunciado de cada tabla.
                for (int  multiplicando = 1; multiplicando <= 5; multiplicando++) {
                    System.out.println("Tabla de multiplicar del " + multiplicando + ":");
                    Thread.sleep(250);

                    //Realiza las multiplicaciones.
                    for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
                        resultado = multiplicando * multiplicador;
                        System.out.println(multiplicando + " * " + multiplicador + " = " + resultado);
                        Thread.sleep(250);
                    }
                    // Salto de línea para separar las tablas.
                    System.out.println();
                }

                break;

            case 7:

                int base,exponente,potencia;
                potencia = 1;

                System.out.println("Introduce la base:");
                base = teclado.nextInt();

                System.out.println("Introduce la potencia:");
                exponente = teclado.nextInt();

                for (int contador = 1; contador <= exponente; contador++) {
                    potencia *= base;
                }

                System.out.println("La potencia de " + base + " elevado a " + exponente + " es: " + potencia);

                break;

            case 8:

                int  contador = 0;
                resultado = 0;

                do{

                    System.out.println("Introduce un número: ");
                    numero = teclado.nextInt();

                    resultado += numero;
                    contador++;

                } while (numero != 0);

                //Restamos 1 para excluir el 0 a la hora de realizar la media.
                contador--;

                double media = (double) resultado / contador;

                System.out.println("La suma de los números es: " + resultado);
                System.out.println("Y su media: " + media);

                break;

            case 9:

                int menu2;

                do {

                    System.out.println
                            ("1: Opción 1" + "\n" +
                                    "2: Opción 2 " + "\n" +
                                    "3: Opción 3 " + "\n" +
                                    "4: Opción 4 " + "\n" +
                                    "5: Salir " + "\n" +

                                    "Selecciona la opción: ");
                    menu2 = teclado.nextInt();


                    switch (menu2) {

                        case 1:
                            System.out.println("Seleccionada opción número 1");
                            break;
                        case 2:
                            System.out.println("Seleccionada opción número 2");
                            break;
                        case 3:
                            System.out.println("Seleccionada opción número 3");
                            break;
                        case 4:
                            System.out.println("Seleccionada opción número 4");
                            break;
                        case 5:
                            break;
                    }

                } while (menu2 != 5);

                break;

            case 10:

                int menu3;



                System.out.println
                        ("1: Sumar " + "\n" +
                                "2: Restar  " + "\n" +
                                "3: Dividir  " + "\n" +
                                "4: Multiplicar  " + "\n" +
                                "5: Salir  " + "\n" +

                                "Selecciona la opción: ");
                menu3 = teclado.nextInt();


                switch (menu3) {

                    case 1:
                        System.out.println("SUMAR");

                        resultado=0;

                        System.out.print("Introduce un número: ");
                        numero = teclado.nextInt();

                        do {

                            System.out.print("Introduce otro número: ");
                            numero2 = teclado.nextInt();

                        } while (numero2 == 0);

                        resultado = numero + numero2;

                        System.out.println("El resultado de la suma es: " + resultado);


                        break;

                    case 2:
                        System.out.println("RESTAR");

                        resultado=0;

                        System.out.print("Introduce un número: ");
                        numero = teclado.nextInt();

                        do {

                            System.out.print("Introduce otro número: ");
                            numero2 = teclado.nextInt();

                        } while (numero2 == 0);

                        resultado = numero - numero2;

                        System.out.println("El resultado de la resta es: " + resultado);
                        break;

                    case 3:
                        System.out.println("DIVISIÓN");

                        System.out.print("Introduce un número: ");
                        numero = teclado.nextInt();

                        do {

                            System.out.print("Introduce otro número: ");
                            numero2 = teclado.nextInt();

                        } while (numero2 == 0);

                        double decimal = (double) numero / numero2;

                        System.out.println("El resultado de la división es: " + decimal);
                        break;

                    case 4:
                        System.out.println("MULTIPLICACIÓN");

                        resultado=0;

                        System.out.print("Introduce un número: ");
                        numero = teclado.nextInt();

                        do {

                            System.out.print("Introduce otro número: ");
                            numero2 = teclado.nextInt();

                        } while (numero2 == 0);

                        resultado = numero * numero2;

                        System.out.println("El resultado de la multiplicación es: " + resultado);
                        break;

                    case 5:
                        break;
                }

                break;



            case 11:

                int nrandom, intento=10;

                Random random = new Random();
                nrandom = random.nextInt(99) + 1;

                do {
                    System.out.print("Introduce un número: ");
                    numero = teclado.nextInt();

                    intento--;
                    System.out.println("Tienes " + intento + " intentos.");

                    if (numero < nrandom) {
                        System.out.println("El número es MAYOR");

                    } else if (numero > nrandom) {
                        System.out.println("El número es MENOR");

                    } else {
                        System.out.println("HAS ACERTADO EL NÚMERO");
                        //Se utiliza system.exit para salir del bucle
                        System.exit(0);
                    }

                } while (intento > 0);

                System.out.println("Has agotado tus intentos");

                break;







        }

    }
}





