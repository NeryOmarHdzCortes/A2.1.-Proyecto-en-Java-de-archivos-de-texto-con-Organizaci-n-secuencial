package ejercicio6.modelo;

public class ModeloListarCalificacion {
    ArchivoTexto objArchivoTexto;

    public Object[][] obtenerMatrizCalificaciones(String[] columnas) {
        this.objArchivoTexto = new ArchivoTexto();
        if (!this.objArchivoTexto.abrirArchivoTexto('r', "calificaciones.txt")) {
            return new Object[0][0];
        }
        Object[][] datos = this.objArchivoTexto.obtenerMatrizLineas(columnas.length);
        this.objArchivoTexto.cerrarArchivo('r');
        return datos;
    }
}