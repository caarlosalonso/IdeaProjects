public class seis {
    public static void main(String[] args) {

        String cadena = "Hola mundo";
        String cadenaFinal = "";

        for (int i = cadena.length()-1; i >= 0; i--){
            char posicionActual = cadena.charAt(i);
            cadenaFinal = cadenaFinal + posicionActual;
        }
        System.out.println(cadena);
        System.out.println(cadenaFinal);
    }
}
