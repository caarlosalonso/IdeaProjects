import java.util.Scanner;
public class Comparar2Strings {
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

        Boolean VF =(str1.equals(str2));
        return VF;
    }
}
