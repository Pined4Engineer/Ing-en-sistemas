import javax.swing.*;

class Niños {

    private String edad;
    private String nombre;
    private String genero;
    private String alergias;
    private String id;
    private String nombreAcudiente;
    private String numeroAcudiente;


    public Niños (String edad, String nombre, String genero, String alergias, String id, String nombreAcudiente, String numeroAcudiente
    ) {
        this.edad = edad;
        this.nombre = nombre;
        this.genero = genero;
        this.alergias = alergias;
        this.id = id;
        this.nombreAcudiente = nombreAcudiente;
        this.numeroAcudiente = numeroAcudiente;

    }
    // Getters y Setters
    public String getEdad() { return edad; }
    public String getNombre() { return nombre; }
    public String getGenero() { return genero; }
    public String getAlergias() { return alergias; }
    public String getId() { return id; }
    public String getNombreAcudiente() { return nombreAcudiente;}
    public String getNumeroAcudiente() { return numeroAcudiente; }

    public void setEdad(String edad) { this.edad = edad;}
    public void setNombre(String nombre) { this.nombre = nombre;}
    public void setGenero(String genero) { this.genero = genero;}
    public void setAlergias(String alergias) { this.alergias = alergias;}
    public void setId(String id) { this.id = id;}
    public void setNombreAcudiente(String nombreAcudiente) { this.nombreAcudiente = nombreAcudiente;}
    public void setNumeroAcudiente(String numeroAcudiente) { this.numeroAcudiente = numeroAcudiente;}


    // Metodo para mostrar la información del empleado
    public void mostrarInfo() {
        System.out.println("Edad: " + edad + " | Nombre: " + nombre + " | Genero: " + genero +
                " | Alergias: " + alergias + " | Id: " + id +
                " | Nombre Acudiente: " + nombreAcudiente + " | Numero Acudiente: " + numeroAcudiente);
    }

}

