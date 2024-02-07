public class seis {
    public static void main(String[] args) {
        StringBuilder fraseEnStringBuilder = new StringBuilder("HoolA a todos");
        System.out.println("Frase original: " + fraseEnStringBuilder);
        StringBuilder soloVocales = new StringBuilder();
        int contadorVocales = 0;

        for (int posicion = 0; posicion < fraseEnStringBuilder.length(); posicion++) {
            char caracterActual = fraseEnStringBuilder.charAt(posicion);

            if (isVowel(caracterActual)) {
                //Si ese caracter es vocal
                contadorVocales++; //Sumo 1 al contador
                soloVocales.append(caracterActual); //Añado la vocal a "soloVocales"
                fraseEnStringBuilder.delete(posicion, posicion + 1); //Elimino la vocal del StringBuilder original
                posicion--; //Para solucionar cuando hay varias vocales seguidas
            }
        }

        System.out.println("Contador: " + contadorVocales);
        System.out.println("Vocales: " + soloVocales);
        System.out.println("Sin vocales: " + fraseEnStringBuilder);
    }

    public static boolean isVowel(char caracter) {
        //Convertimos el caracter a minúscula, para facilitar el condicional
        caracter = Character.toLowerCase(caracter);
        //Preguntamos si el caracter es vocal (faltaría comprobar las tildes)
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
            return true;
        } else {
            return false;
        }
    }
}