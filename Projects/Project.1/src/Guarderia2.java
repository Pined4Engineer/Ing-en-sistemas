import javax.swing.*;
import java.util.ArrayList;

class Boy2 {
    private final String id;
    private final String nombre;
    private int edad;
    private String genero;
    private String alergias;
    private String nombreAcudiente;
    private String numeroAcudiente;

    public Boy2(String id, String nombre, int edad, String genero, String alergias, String nombreAcudiente, String numeroAcudiente) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.numeroAcudiente = numeroAcudiente;
    }

    public String getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String mostrarInfo() {
        return "ID: " + id + " | Nombre: " + nombre + " | Edad: " + edad + " | Género: " + genero +
                " | Documento: " + " | Alergias: " + alergias +
                " | Acudiente: " + nombreAcudiente + " | Contacto: " + numeroAcudiente;
    }
}

class Guarderia2 {
    private ArrayList<Boy2> boys2 = new ArrayList<>();

    public void registrarBoy2() {
        String id = JOptionPane.showInputDialog("Ingrese el ID único del niño:");

        if (buscarBoy2(id) != null) {
            JOptionPane.showMessageDialog(null, "Error: El ID ya existe. Intente con otro.");
            return;
        }

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre completo del niño:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del niño:"));
        String genero = JOptionPane.showInputDialog("Ingrese el género del niño:");
        String documentoIdentidad = JOptionPane.showInputDialog("Ingrese el documento de identidad del niño:");
        String alergias = JOptionPane.showInputDialog("Ingrese las alergias del niño:");
        String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente:");
        String numeroAcudiente = JOptionPane.showInputDialog("Ingrese el número de contacto del acudiente:");

        Boy2 boy2 = new Boy2(id, nombre, edad, genero, alergias, nombreAcudiente, numeroAcudiente);
        boys2.add(boy2);
        JOptionPane.showMessageDialog(null, "Niño registrado con éxito.");
    }

    public Boy2 buscarBoy2(String id) {
        for (Boy2 boy2 : boys2) {
            if (boy2.getId().equals(id)) {
                return boy2;
            }
        }
        return null;
    }

    public void listarBoys2() {
        if (boys2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay niños registrados.");
            return;
        }
        StringBuilder mensaje = new StringBuilder("Lista de niños registrados:\n");
        for (Boy2 boy2 : boys2) {
            mensaje.append(boy2.mostrarInfo()).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

    public void listarMayoresA5() {
        StringBuilder mensaje = new StringBuilder("Niños mayores de 5 años:\n");
        boolean encontrado = false;
        for (Boy2 boy2 : boys2) {
            if (boy2.getEdad() > 5) {
                mensaje.append(boy2.mostrarInfo()).append("\n\n");
                encontrado = true;
            }
        }
        if (!encontrado) {
            mensaje.append("No hay niños mayores de 5 años registrados.");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}

