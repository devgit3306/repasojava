
package javarepaso;

public class Empleado extends Usuario {

    public Empleado(String nombre, String apellidos, int edad, String direccion, String telefono) {
        super(nombre, apellidos, edad, direccion, telefono);
        this.tipoUsuario = "Empleado/a.";
    }

    public Empleado(String nombre, String apellidos) {
        super(nombre, apellidos);
        this.tipoUsuario = "Empleado/a.";
    }

}
