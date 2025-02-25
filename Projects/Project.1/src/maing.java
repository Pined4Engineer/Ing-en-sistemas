import javax.swing.*;


public class maing {
    public static void main(String[] args) {
        Guarderia2 guarderia2 = new Guarderia2();
        boolean continuar = true;

        while (continuar) {
            String[] opciones = {"Registrar Niño", "Buscar Niño por ID", "Listar Niños Mayores a 5 Años", "Listar Todos", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(
                    null, "Seleccione una opción:", "Guardería",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, opciones, opciones[0]
            );

            switch (seleccion) {
                case 0:
                    guarderia2.registrarBoy2();
                    break;
                case 1:
                    String id = JOptionPane.showInputDialog("Ingrese el ID del niño a buscar:");
                    Boy2 boy2 = guarderia2.buscarBoy2(id);
                    if (boy2 != null) {
                        JOptionPane.showMessageDialog(null, "Niño encontrado:\n" + boy2.mostrarInfo());
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró ningún niño con el ID ingresado.");
                    }
                    break;
                case 2:
                    guarderia2.listarMayoresA5();
                    break;
                case 3:
                    guarderia2.listarBoys2();
                    break;
                case 4:
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    continuar = false;
                    break;
            }
        }
    }
}
