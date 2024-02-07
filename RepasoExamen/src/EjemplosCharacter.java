public class EjemplosCharacter {
    public static void main(String[] args) {
        Character caracter1 = new Character('a');
        Character caracter2 = 'a';

        //Comparar dos objetos
        System.out.println(caracter1 == caracter2);
        System.out.println(caracter1.equals(caracter2));

        //Usamos compareTo
        System.out.println(caracter1.compareTo(caracter2));
        System.out.println(Character.compare(caracter1, caracter2));

        //Convierto char en Character
        char nuevoChar = 'a';
        Character nuevoCharacter = Character.valueOf(nuevoChar);
        Character nuevoCharacter2 = nuevoChar; //funciona por boxing
        System.out.println(nuevoCharacter + "  " + nuevoCharacter2);

        //Convierto en String
        String palabra = nuevoCharacter.toString();
        System.out.println(palabra);

        //Preguntas
        Character caracterNuevo = 'o';
        System.out.println("Numero " + Character.isDigit(caracterNuevo));
        System.out.println("Letra " + Character.isLetter(caracterNuevo));
        System.out.println("Espacio " + Character.isWhitespace(caracterNuevo));
        System.out.println("Mayuscula " + Character.isUpperCase(caracterNuevo));
        System.out.println("Minuscula " + Character.isLowerCase(caracterNuevo));
// Se pueden usar sin tener creado ningún Character
        System.out.println("Numero " + Character.isDigit('8'));
        //....

        //Convertir a May o Min
        System.out.println(Character.toLowerCase('Ñ'));
    }
}