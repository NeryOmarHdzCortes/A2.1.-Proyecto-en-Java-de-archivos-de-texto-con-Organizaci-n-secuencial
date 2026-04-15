package ejercicio6.modelo;

public class ModeloRegistrarCalificacion {
    ArchivoTexto objArch;

    public void guardarCalificacion(String nombre, String materia, double calificacion) {
        Calificacion objCal = new Calificacion();
        objCal.setNombre(nombre);
        objCal.setMateria(materia);
        objCal.setCalificacion(calificacion);

        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('w', "calificaciones.txt");
        this.objArch.crearLinea(objCal.toString());
        this.objArch.cerrarArchivo('w');
    }
}