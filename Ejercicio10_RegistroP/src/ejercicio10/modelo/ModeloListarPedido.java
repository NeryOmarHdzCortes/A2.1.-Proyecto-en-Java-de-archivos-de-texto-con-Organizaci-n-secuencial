package ejercicio10.modelo;

public class ModeloListarPedido {
    ArchivoTexto objArchivoTexto;

    public Object[][] obtenerMatrizPedidos(String[] columnas) {
        this.objArchivoTexto = new ArchivoTexto();
        if (!this.objArchivoTexto.abrirArchivoTexto('r', "pedidos.txt")) {
            return new Object[0][0];
        }
        Object[][] datos = this.objArchivoTexto.obtenerMatrizLineas(columnas.length);
        this.objArchivoTexto.cerrarArchivo('r');
        return datos;
    }
}