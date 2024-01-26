
package javarepaso;

public class JavaRepaso {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Andres", "Dias", 28, "Las flores y Montreal", "09544125");

        Usuario usuario2 = new Usuario("Juan", "Perez", 25, "Los olivos", "09544555");

        usuario1.mostrarDatos(true);
        usuario2.mostrarDatos(true);

        Usuario usuario3 = new Usuario("Juan", "Perez");
        Usuario usuario4 = new Usuario("Luis", "Guerrero");

        usuario3.mostrarDatos();
        usuario4.mostrarDatos();

        // Instanciamos de la Subclase Empleado
        Usuario usuario5 = new Empleado("Angel", "Donoso", 35, "La independencia", "09586755");
        usuario5.mostrarDatos(true);

    }

}
