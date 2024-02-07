import java.util.Scanner;
public class StringObjeto {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);

        boolean Resltadostring;

        System.out.println("Introduce una frase: ");
        String str1 = teclado.nextLine();

        System.out.println("Introduce una frase: ");
        String str2 = teclado.nextLine();



        Resltadostring = String(str1,str2);
        if (Resltadostring == true){
            System.out.println("Estan almacenados en la misma variable");
        }else{
            System.out.println("No estan almacenados en la misma variable");
        }
    }

    public static boolean String(String str1, String str2) {

        /* Este igual se utiliza para que str1 y str2 esten almacenados en la misma variable
        el resultado siempre nos dará igual a no ser que eliminemos la siguiente linea */
        str1 = str2;

        if(str1==str2){
            return true;
        }else{
            return false;
        }
    }
}
