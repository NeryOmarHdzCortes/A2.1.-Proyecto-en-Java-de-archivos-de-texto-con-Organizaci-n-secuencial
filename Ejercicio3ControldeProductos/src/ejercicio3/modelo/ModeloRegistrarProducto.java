package ejercicio3.modelo;

public class ModeloRegistrarProducto {
    ArchivoTexto objArch;

    public void guardarProducto(String id, String nombre, double precio, int cantidad) {
        Producto objProd = new Producto();
        objProd.setId(id);
        objProd.setNombre(nombre);
        objProd.setPrecio(precio);
        objProd.setCantidad(cantidad);

        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('w', "productos.txt");
        this.objArch.crearLinea(objProd.toString());
        this.objArch.cerrarArchivo('w');
    }
}