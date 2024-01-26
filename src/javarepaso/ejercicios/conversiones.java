
package javarepaso.ejercicios;

public class conversiones {

    public static void main(String[] args) {

        int numero1 = 10;
        double numero2 = 3.14;

        /*numero1 obtiene una conversión implícita a double durante la operación,
        hecha la operación su valor sigue siendo entero, la conversión implícita
        la realiza automáticamente java
         */
        double resultado = numero1 + numero2;

        System.out.println("Conversion implicita");
        System.out.println("El resultado de la suma es " + resultado);
        System.out.println("Valor de numero1 sigue siendo entero despues de la operacion= " + numero1);

        //Asignamos el valor de la suma de dos enteros a una variable de tipo double, se realiza la conversión implícita
        int n1 = 10;
        int n2 = 20;
        double r = n1 + n2;
        System.out.println("El resultado de la suma  tipo Double es =  " + r);
        System.out.println("El valor de n1 y n2 luego de la operacion es: " + "n1=" + n1 + " n2=" + n2);

        // Conversión explicita o Casting
        long num1 = 10L;
        long num2 = 20L;
        /*
        si queremos asignar la operacion de dos numeros long a una variable de tipo entero,
        java nos adevertita que hay una posible perdida de datos en la conversion y nos impide
        ejecutar la operacion.
        int res=num1+num2;
        Aqui necesitamos realizar una conversion explicita o Casting
            
         */
        System.out.println("");
        System.out.println("Conversion explicita Casting int res=(int)(num1+num2); ");
        int res = (int) (num1 + num2);
        System.out.println("El resultado es " + res);

        /*Esta conversión explícita funciona porque los valores de tipo long no son muy grandes, pero si 
          asignaríamos  números muy grandes  nos devolvería un resultado erróneo, por lo que más adelante sé     
         indicará como solucionar estos casos
         */
    }

}
