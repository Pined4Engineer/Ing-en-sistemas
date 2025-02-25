import javax.swing.*;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Niños> listaNiños = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            // Menú de opciones
            String[] opciones = {"Registrar Niño", "Buscar Niño por ID", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción:",
                    "Guardería",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            switch (seleccion) {
                case 0: // Registrar niño
                    registrarNiño(listaNiños);
                    break;
                case 1: // Buscar niño por ID
                    buscarNiño(listaNiños);
                    break;
                case 2: // Salir del programa
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    continuar = false;
                    break;
            }
        }
    }

    // Método para registrar un niño
    public static void registrarNiño(ArrayList<Niños> lista) {
        try {
            String edad = JOptionPane.showInputDialog("Ingrese la edad del niño:");
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del niño:");
            String genero = JOptionPane.showInputDialog("Ingrese el género del niño:");
            String alergias = JOptionPane.showInputDialog("Ingrese las alergias del niño:");
            String id = JOptionPane.showInputDialog("Ingrese el ID del niño:");
            String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente:");
            String numeroAcudiente = JOptionPane.showInputDialog("Ingrese el número de teléfono del acudiente:");

            // Crear objeto y agregarlo a la lista
            Niños niño = new Niños(edad, nombre, genero, alergias, id, nombreAcudiente, numeroAcudiente);
            lista.add(niño);

            JOptionPane.showMessageDialog(null, "Niño registrado con éxito.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese datos válidos.");
        }
    }

    // Método para buscar un niño por ID
    public static void buscarNiño(ArrayList<Niños> lista) {
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay niños registrados.");
            return;
        }

        String idBuscado = JOptionPane.showInputDialog("Ingrese el ID del niño a buscar:");
        Niños resultado = buscarPorId(lista, idBuscado);

        if (resultado != null) {
            JOptionPane.showMessageDialog(null, "Niño encontrado:\n" + resultado.getNombre());
            resultado.mostrarInfo();
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún niño con el ID ingresado.");
        }
    }

    // Método para buscar un niño por ID en la lista
    public static Niños buscarPorId(ArrayList<Niños> lista, String id) {
        for (Niños niño : lista) {
            if (niño.getId().equals(id)) {
                return niño;
            }
        }
        return null;}
    }

