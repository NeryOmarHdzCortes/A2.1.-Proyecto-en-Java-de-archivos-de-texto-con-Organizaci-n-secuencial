package ejercicio1.modelo;

public class ModeloListarEstudiantes {
    ArchivoTexto objArchivoTexto;
    
    public Object[][] obtenerMatrizEstudiantes(String[] columnas){
        this.objArchivoTexto = new ArchivoTexto();
        if (!this.objArchivoTexto.abrirArchivoTexto('r', "estudiantes.txt")) {
            return new Object[0][0];
        }
        Object[][] datos = this.objArchivoTexto.obtenerMatrizLineas(columnas.length);        
        this.objArchivoTexto.cerrarArchivo('r');
        return datos;
    }
}