
package javarepaso;

public class Usuario {

    //Atributos
    String nombre;
    String apellidos;
    int edad;
    String direccion;
    String telefono;
    String tipoUsuario = "Sin especificar";

    //Constructor de la clase
    public Usuario(String nombre, String apellidos, int edad, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Usuario(String nombre, String apellidos) {

        this.nombre = nombre;
        this.apellidos = apellidos;

    }

    //Método mostrar la información del constructor
    public void mostrarDatos(Boolean completo) {

        System.out.println("--------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Tipo de usuario: " + tipoUsuario);

    }

    //Método mostrar la información del constructor Reducido
    public void mostrarDatos() {

        System.out.println("--------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Tipo de usuario: " + tipoUsuario);

    }

}
