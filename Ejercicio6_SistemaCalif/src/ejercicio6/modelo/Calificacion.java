package ejercicio6.modelo;

public class Calificacion {
    private String nombre;
    private String materia;
    private double calificacion;

    public Calificacion(String nombre, String materia, double calificacion) {
        this.nombre = nombre;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public Calificacion() {
        this("", "", 0.0);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getMateria() { return materia; }
    public void setMateria(String materia) { this.materia = materia; }

    public double getCalificacion() { return calificacion; }
    public void setCalificacion(double calificacion) { this.calificacion = calificacion; }

    @Override
    public String toString() {
        return nombre + "," + materia + "," + calificacion;
    }
}