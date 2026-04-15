package ejercicio5.modelo;

public class Actividad {
    private String fecha;
    private String actividad;

    public Actividad(String fecha, String actividad) {
        this.fecha = fecha;
        this.actividad = actividad;
    }

    public Actividad() {
        this("", "");
    }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getActividad() { return actividad; }
    public void setActividad(String actividad) { this.actividad = actividad; }

    @Override
    public String toString() {
        return fecha + "," + actividad;
    }
}