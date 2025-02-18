//Abstracción
//¿Qué se solicita finalmente? (problema)
// Finalmente se solicita un programa para almacenar informacion sobre sus empleados.

//¿Qué información es relevante dado el problema anterior?
// numero de idnetificacion, nombre completo, puesto, correo electrico, numero telefonico y fecha de contratacion.

//¿Cómo se agrupa la información relevante?
// Se representa con una clase "Empleado", en la cual cada empleado es un "Objeto".

//¿Qué funcionalidades se solicitan finalmente?
// Almacenar y gestionar la informacion de los empleados.

//Descomposición:
//¿Cómo se distribuyen las funcionalidades?
//¿Qué debo hacer para probar las funcionalidades?
//Crear la clase Empleado con los atributos mencionados.//
// Implementar métodos para acceder y modificar los datos (getters y setters).
//Crear una lista de empleados para gestionar múltiples registros.


import java.util.Scanner;
import java.util.ArrayList;

class Empleado {
    private String id;
    private String nombre;
    private String puesto;
    private String correo;
    private String telefono;
    private String fechaContratacion;


    public Empleado(String id, String nombre, String puesto, String correo, String telefono, String fechaContratacion) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaContratacion = fechaContratacion;

    }
    // Getters y Setters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public String getCorreo() { return correo; }
    public String getTelefono() { return telefono; }
    public String getFechaContratacion() { return fechaContratacion; }

    public void setPuesto(String puesto) { this.puesto = puesto; }
    public void setCorreo(String correo) { this.correo = correo; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    // Metodo para mostrar la información del empleado
    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Puesto: " + puesto +
                " | Correo: " + correo + " | Teléfono: " + telefono +
                " | Fecha de contratación: " + fechaContratacion);
    }

}