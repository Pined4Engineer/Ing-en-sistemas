import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Batallon {
    private String id;
    private String nombre;

    private LinkedList<VehiculoApoyo> apoyos;
    private LinkedList<VehiculoBlindado> vehiculoBlindados;
    private LinkedList<VehiculoTransporteTropas> vehiculoTransporteTropas;
    private LinkedList<VehiculoMilitar> vehiculos;
    private List<Mision> misiones;

    public Batallon(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    
}