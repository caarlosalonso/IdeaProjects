import java.util.Scanner;
import java.util.Scanner;

public class Compar2StringMayus {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);

        boolean Resltadostring;

        System.out.println("Introduce una frase: ");
        String str1 = teclado.nextLine();

        System.out.println("Introduce una frase: ");
        String str2 = teclado.nextLine();

        Resltadostring = String(str1,str2);
        if (Resltadostring == true){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son distintos");
        }
    }

    public static boolean String(String str1, String str2) {

        //equalsIgnoreCase permite que los strings no distingan entra mayus y minus.
        if (str1.equalsIgnoreCase(str2)){
            return true;
        }else{
            return false;
        }
    }
}