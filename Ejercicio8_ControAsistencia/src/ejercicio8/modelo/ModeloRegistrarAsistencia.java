package ejercicio8.modelo;

public class ModeloRegistrarAsistencia {
    ArchivoTexto objArch;

    public void guardarAsistencia(String nombre, String fecha, String estado) {
        Asistencia objAsis = new Asistencia();
        objAsis.setNombre(nombre);
        objAsis.setFecha(fecha);
        objAsis.setEstado(estado);

        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('w', "asistencia.txt");
        this.objArch.crearLinea(objAsis.toString());
        this.objArch.cerrarArchivo('w');
    }
}