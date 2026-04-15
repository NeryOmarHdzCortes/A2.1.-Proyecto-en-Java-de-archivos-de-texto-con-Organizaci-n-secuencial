package ejercicio10.modelo;

public class Pedido {
    private String cliente;
    private String producto;
    private int cantidad;

    public Pedido(String cliente, String producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Pedido() {
        this("", "", 0);
    }

    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    @Override
    public String toString() {
        return cliente + "," + producto + "," + cantidad;
    }
}