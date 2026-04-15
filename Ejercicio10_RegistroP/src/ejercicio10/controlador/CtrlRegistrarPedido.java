package ejercicio10.controlador;

import ejercicio10.modelo.ModeloRegistrarPedido;

public class CtrlRegistrarPedido {
    ModeloRegistrarPedido objModeloRegistrar;

    public CtrlRegistrarPedido() {
        this.objModeloRegistrar = new ModeloRegistrarPedido();
    }

    public void registrarPedido(String cliente, String producto, int cantidad) {
        this.objModeloRegistrar.guardarPedido(cliente, producto, cantidad);
    }
}