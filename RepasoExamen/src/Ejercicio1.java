import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char pregunta;
        do {
            //Creamos los 3 aleatorios
            int numero = dameAleatorioEntre1y3();
            System.out.print(numero + " ");
            int numero2 = dameAleatorioEntre1y3();
            System.out.print(numero2 + " ");
            int numero3 = dameAleatorioEntre1y3();
            System.out.print(numero3);
            System.out.println();

            if(numero== numero2 && numero2==numero3){ //Si los 3 iguales
                System.out.println("Los tres iguales- Has ganado");
            }else if (numero==numero2 || numero==numero3 || numero2==numero3) { //Si dos iguales
                System.out.println("Empate, vuelve a jugar");
            }else{//Si todos distintos
                System.out.println("Has perdido");
            }


            System.out.println("Quieres continuar (S-N)");
            pregunta=teclado.next().charAt(0);

        }while (pregunta !='N' && pregunta!='n'); //Repetimos hasta que se introduzca N o n
    }

    public static int dameAleatorioEntre1y3(){
        //Genera aleatorio entre 1 y 3
        return (int) (Math.random() * (3 - 1 + 1)) + 1;
    }
}
