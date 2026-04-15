package ejercicio4.modelo;

public class ModeloRegistrarVenta {
    ArchivoTexto objArch;

    public void guardarVenta(String fecha, String producto, int cantidad, double total) {
        Venta objVen = new Venta();
        objVen.setFecha(fecha);
        objVen.setProducto(producto);
        objVen.setCantidad(cantidad);
        objVen.setTotal(total);

        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('w', "ventas.txt");
        this.objArch.crearLinea(objVen.toString());
        this.objArch.cerrarArchivo('w');
    }
}