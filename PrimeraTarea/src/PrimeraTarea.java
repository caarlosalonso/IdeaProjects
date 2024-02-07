import java.util.Scanner;

public class PrimeraTarea {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero1 , numero2 , numero3 ;

        System.out.println("Introduce un numero: ");
        numero1 = teclado.nextInt();

        System.out.println("Introduce otro numero: ");
        numero2 = teclado.nextInt();

        System.out.println("Introduce otro numero: ");
        numero3 = teclado.nextInt();

            if (numero1 == numero2 && numero1 == numero3)  {
                System.out.println("Los numeros son iguales");
             } else if (numero1 > numero2 && numero2 > numero3) {
                System.out.println(numero1 + ">" + numero2 + ">" + numero3);
             } else if (numero1 > numero3 && numero3 > numero2){
                System.out.println(numero1 + ">" + numero3 + ">" + numero2);
             } else if (numero2 > numero3 && numero3 > numero1) {
                System.out.println(numero2 + ">" + numero3 + ">" + numero1);
             } else if (numero2 > numero1 && numero2 > numero3) {
                System.out.println(numero2 + ">" + numero1 + ">" + numero3);
             } else if (numero3 > numero1 && numero1 > numero2) {
                System.out.println(numero3 + ">" + numero1 + ">" + numero2);
             } else if (numero3 > numero2 && numero2 > numero1) {
                System.out.println(numero3 + ">" + numero2 + ">" + numero1);

            }
        }
    }

