package javarepaso.ejercicios;

import java.util.Arrays;
import java.util.Collections;

public class opArrays {

    public static void main(String[] args) {

        int[] numeros = new int[4];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;

        System.out.println("El primer valor del vector numeros[0]= " + numeros[0]);
        System.out.println("El valor de numeros[3] es= " + numeros[3]);

        int[] numeros2 = {60, 90, 80, 70, 50, 100};
        System.out.println("");
        System.out.println("El primer valor del vector numeros2[0] es= " + numeros2[0]);

        //Reasignar valores a arrays
        numeros[3] = 4000;
        System.out.println("");
        System.out.println("El nuevo valor del vector numeros[3]= " + numeros[3]);

        //Iteración de arrays con bucles for
        System.out.println("");
        System.out.println("Iteración de arrays con bucles for");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("El valor es: " + numeros2[i]);
        }

        //Java ForEach: El uso de Java ForEach nos permite recorrer la lista de elementos 
        //de una forma mas compacta y el código se reduce.
        System.out.println("");
        System.out.println("Iteración del vector numeros2 usando el bucle for each");
        for (int numero : numeros2) {
            System.out.println("Valores del vector numeros2: " + numero);

        }

        /* Para ordenar arrays de cualquier tipo Java dispone del método sort de la clase Arrays.
           Arrays.sort(nombres);
           Para utilizarlo es necesario incluir el import:  
           import java.util.Arrays;
         */
        System.out.println("");
        System.out.println("Ordenando numeros2{60,90,80,70,50,100} Arrays.sort(numeros2)");
        Arrays.sort(numeros2);

        for (int numero : numeros2) {
            System.out.println("El valor es: " + numero);

        }

        /* Ordenar Array de manera descendente: reverseOrder: decirle al método sort() que lo ordene al revés, 
        pero este proceso solo funciona con arrays de objetos, no con arrays de tipos primitivos, por tanto, si lo que buscas es ordenar el array del ejemplo (int) tendrás que cambiar el tipo y usar Integer en vez de int de la siguiente forma:
         */
        Integer[] array = {4, 6, 2, 8, 7};
        Arrays.sort(array, Collections.reverseOrder());

        System.out.println("");
        System.out.println("reverseOrder: Ordenar el Array de manera descendente array ={4,6,2,8,7}");

        for (Integer elemento : array) {
            System.out.println("Array ordenando de manera descendente: " + elemento);
        }

        /* El método Arrays.binarySearch() busca el valor especificado en la matriz especificada del tipo de datos 
        especificado mediante el algoritmo de búsqueda binaria. La matriz debe ordenarse según el método Arrays.sort()
        antes de realizar esta llamada. Si no se ordena, los resultados no están definidos. Si la matriz 
        contiene varios elementos con el valor especificado, no hay garantía de cuál se encontrará.  */
        int[] arraynum = {1, 2, 3, 4};

        int indice = Arrays.binarySearch(arraynum, 3);

        System.out.println("");
        System.out.println("Busqueda Binaria en el Array arraynum = {1, 2, 3, 4}");
        System.out.println("int indice = Arrays.binarySearch(arraynum, 3);");
        System.out.println("El elemento 3 está en la posición " + indice + " del índice.");

        //Arrays  de tipo String 
        System.out.println("");
        System.out.println("Array de tipo String ");
        String[] colores = {"amarillo", "verde", "azul", "violeta", "rojo"};
        for (String color : colores) {
            System.out.println("Array String colores = " + color);

        }

    }

}
