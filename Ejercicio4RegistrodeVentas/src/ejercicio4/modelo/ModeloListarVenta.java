package ejercicio4.modelo;

public class ModeloListarVenta {
    ArchivoTexto objArchivoTexto;

    public Object[][] obtenerMatrizVentas(String[] columnas) {
        this.objArchivoTexto = new ArchivoTexto();
        if (!this.objArchivoTexto.abrirArchivoTexto('r', "ventas.txt")) {
            return new Object[0][0];
        }
        Object[][] datos = this.objArchivoTexto.obtenerMatrizLineas(columnas.length);
        this.objArchivoTexto.cerrarArchivo('r');
        return datos;
    }
}