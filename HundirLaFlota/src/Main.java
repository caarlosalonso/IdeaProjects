public class Main {
    public static void main(String[] args) {

        char[][] tablero = new char[10][10];

        for (int filas = 0; filas != tablero.length; filas++) {
            for (int columnas = 0; columnas != tablero.length; columnas++) {
                tablero[filas][columnas] = 'X';
            }
        }
        for (char[] numeros : tablero) {
            System.out.println(numeros);
        }
    }
}