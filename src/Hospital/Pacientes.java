
package Hospital;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pacientes {
    private String nombre;
    private String cedula;
    private LocalDate fecha;
    private LocalTime horaLlegada;
    private LocalTime horaSalida;
    private String clasificacion;

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHoraLlegada() {
        return horaLlegada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public Pacientes(String nombre, String cedula, LocalDate fecha, LocalTime horaLlegada, LocalTime horaSalida, String clasificacion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fecha = fecha;
        this.horaLlegada = horaLlegada;
        this.horaSalida = horaSalida;
        this.clasificacion = clasificacion;
    }
    }
    
    