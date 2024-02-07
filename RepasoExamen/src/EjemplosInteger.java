public class EjemplosInteger {

    public static void main(String[] args) {
        // write your code here
        Integer numero1 = new Integer(89);
        Integer numero2 = -89;

        //Comparo las posiciones de memoria
        if(numero1==numero2){
            System.out.println("Iguales");
        }else{
            System.out.println("Distintos");
        }
//Comparo los valores
        if(numero1.equals(numero2)){
            System.out.println("Iguales");
        }else{
            System.out.println("Distintos");
        }

        //Comparamos dos valores
        System.out.println(numero1.compareTo(numero2));
        System.out.println(Integer.compare(25,56));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        //Conversiones desde String
        String sueldoString="25418754";
        int sueldoInt = Integer.parseInt(sueldoString);
        System.out.println(sueldoInt);
        Integer sueldoInteger = Integer.valueOf(sueldoString);
        System.out.println(sueldoInteger);

        //Conversiones de tipos
        //Con tipos primivitivos usamos el casting
        double valor1 =5487.25;
        int valor2 = (int)valor1;
        //Con objetos usamos doubleValue, floatValue,..
        Integer valorInicial = 485724;
        Double valorInicialEnDouble = valorInicial.doubleValue();
        System.out.println(valorInicialEnDouble);
        Float valorInicialEnFloat = valorInicial.floatValue();
        System.out.println(valorInicialEnFloat);



        //Max y Min
        Integer mayor = Integer.max(487,9454);
        System.out.println("Maximo "+ mayor);
        Integer menor = Integer.min(487,9454);
        System.out.println("Minimo "+ menor);
    }
}
