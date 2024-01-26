
package javarepaso.ejercicios;

public class opStrings {

    public static void main(String[] args) {

        //Concatenaciones con strings
        System.out.println("Concatenacion");
        String texto1 = "Programación";
        String texto2 = "Facil";
        String texto3 = texto1.concat(" ").concat(texto2);
        System.out.println(texto3);

        //Indices en java
        // indexOf se utiliza para obtener el índice de la primera 
        //aparición de un criterio especificado en los parámetros del método
        String text1 = "hola Bienvenidos a Programación Fácil, hola";
        int valorIndice = text1.indexOf("Fácil");
        System.out.println("");
        System.out.println("El valor del indice donde empieza la subcadena (Fácil) es: " + valorIndice);

        // El método lastIndexOf() devuelve la posición de la última aparición de un carácter 
        //especificado o una subcadena en una cadena.
        int valorIndice2 = text1.lastIndexOf("a");
        int valorIndice3 = text1.lastIndexOf("hola");
        System.out.println("");
        System.out.println("El valor del incice especificado (a) en la cadena es " + valorIndice2);
        System.out.println("El valor del incice especificado (hola) en la cadena es " + valorIndice3);

        /* El método Java String replace() se usa para reemplazar un carácter específico con el carácter 
        dado, ambos pasados ​​como parámetros. Este método es adecuado para reemplazar cualquier carácter 
        en una Cadena con algún otro carácter de su elección. */
        System.out.println("");
        String text2 = "una cadena de caracteres o cadena de texto o simplemente cadena (String en inglés)"
                + " es una secuencia ordenada de símbolos ";

        String nuevoTexto = text2.replace("cadena", "String");
        System.out.println("Nueva cadena de texto: " + nuevoTexto);

        //charAt: Devuelve el carácter situado en la posición index pasada por parámetro. 
        //La primera posición de la cadena es la 0.
        char caracter = text2.charAt(20);
        System.out.println("");
        System.out.println("El caracter ubicado en la posicion 20=  " + caracter);

        //substring(): Devuelve una subcadena, la cual corresponde al contenido entre los valores beginIndex y endIndex. 
        //En el caso de que no se especifique endIndex, se asumirá como índice el final de la cadena.
        String subTexto = text2.substring(8, 100);
        System.out.println("");
        System.out.println("Substring = " + subTexto);

        //length(): Devuelve el tamaño de la cadena de texto.
        System.out.println("");
        int longitud = text2.length();
        System.out.println("La longitud de la cadena text2 es = " + longitud);

        //toLowerCase(): Convierte todos los caracteres de la cadena a minúsculas.
        String text3 = "Hola Mundo con Java, funcion toLowerCase, curso de programacion fácil";
        String minusculas = text3.toLowerCase();
        System.out.println("");
        System.out.println("toLowerCase: La cadena text3 cambiada a minusculas = " + minusculas);

        //toUpperCase(): Convierte todos los caracteres de la cadena a mayúsculas.
        String mayusculas = text3.toUpperCase();
        System.out.println("");
        System.out.println("toUpperCase: La cadena text3 cambiada a mayusculas = " + mayusculas);

    }

}
