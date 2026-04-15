package ejercicio3.controlador;

import ejercicio3.modelo.ModeloRegistrarProducto;

public class CtrlRegistrarProducto {
    ModeloRegistrarProducto objModeloRegistrar;

    public CtrlRegistrarProducto() {
        this.objModeloRegistrar = new ModeloRegistrarProducto();
    }

    public void registrarProducto(String id, String nombre, double precio, int cantidad) {
        this.objModeloRegistrar.guardarProducto(id, nombre, precio, cantidad);
    }
}