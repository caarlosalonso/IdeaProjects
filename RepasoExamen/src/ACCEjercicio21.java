import java.util.Scanner;

public class ACCEjercicio21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un caracter: ");
        String caracter = teclado.next();

        for(int i = 0; i<caracter.length(); i++){
            System.out.println(caracter.charAt(i));

            if(i>='a'&&i<='z'){
                System.out.println("Es una letra");
            }
        }


    }
}
