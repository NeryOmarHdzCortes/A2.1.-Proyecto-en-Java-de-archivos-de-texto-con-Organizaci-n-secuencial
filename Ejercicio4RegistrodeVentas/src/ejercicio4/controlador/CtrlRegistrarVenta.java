package ejercicio4.controlador;

import ejercicio4.modelo.ModeloRegistrarVenta;

public class CtrlRegistrarVenta {
    ModeloRegistrarVenta objModeloRegistrar;

    public CtrlRegistrarVenta() {
        this.objModeloRegistrar = new ModeloRegistrarVenta();
    }

    public void registrarVenta(String fecha, String producto, int cantidad, double total) {
        this.objModeloRegistrar.guardarVenta(fecha, producto, cantidad, total);
    }
}