package ejercicio2.modelo;

public class ModeloListarContacto {
    ArchivoTexto objArchivoTexto;

    // Devuelve una matriz para llenar el JTable
    public Object[][] obtenerMatrizContactos(String[] columnas) {
        this.objArchivoTexto = new ArchivoTexto();
        if (!this.objArchivoTexto.abrirArchivoTexto('r', "contactos.txt")) {
            return new Object[0][0];
        }
        Object[][] datos = this.objArchivoTexto.obtenerMatrizLineas(columnas.length);
        this.objArchivoTexto.cerrarArchivo('r');
        return datos;
    }
}