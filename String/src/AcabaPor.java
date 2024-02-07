import java.util.Scanner;
public class AcabaPor {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);

        boolean Resltadostring, VF;

        System.out.println("Introduce una frase: ");
        String str1 = teclado.nextLine();


        VF = String(str1);
        if (VF == true){
            System.out.println("Acaba por A");
        }else{
            System.out.println("No Acaba por A");
        }
    }

    public static boolean String(String str1) {

        Boolean VF =str1.endsWith("A") || str1.endsWith("a");
        return VF;
    }
}

