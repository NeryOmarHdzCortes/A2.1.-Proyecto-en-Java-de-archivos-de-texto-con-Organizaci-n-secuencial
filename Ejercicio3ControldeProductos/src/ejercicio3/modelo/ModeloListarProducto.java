package ejercicio3.modelo;

public class ModeloListarProducto {
    ArchivoTexto objArchivoTexto;

    public Object[][] obtenerMatrizProductos(String[] columnas) {
        this.objArchivoTexto = new ArchivoTexto();
        if (!this.objArchivoTexto.abrirArchivoTexto('r', "productos.txt")) {
            return new Object[0][0];
        }
        Object[][] datos = this.objArchivoTexto.obtenerMatrizLineas(columnas.length);
        this.objArchivoTexto.cerrarArchivo('r');
        return datos;
    }
}