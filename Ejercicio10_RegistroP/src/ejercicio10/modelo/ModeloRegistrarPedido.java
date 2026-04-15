package ejercicio10.modelo;

public class ModeloRegistrarPedido {
    ArchivoTexto objArch;

    public void guardarPedido(String cliente, String producto, int cantidad) {
        Pedido objPed = new Pedido();
        objPed.setCliente(cliente);
        objPed.setProducto(producto);
        objPed.setCantidad(cantidad);

        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('w', "pedidos.txt");
        this.objArch.crearLinea(objPed.toString());
        this.objArch.cerrarArchivo('w');
    }
}