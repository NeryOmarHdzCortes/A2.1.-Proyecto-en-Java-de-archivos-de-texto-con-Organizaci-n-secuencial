package ejercicio4.controlador;

import ejercicio4.modelo.ModeloListarVenta;

public class CtrlListarVenta {
    ModeloListarVenta objModeloListar;

    public CtrlListarVenta() {
        this.objModeloListar = new ModeloListarVenta();
    }

    public Object[][] obtenerDatos(String[] columnas) {
        return this.objModeloListar.obtenerMatrizVentas(columnas);
    }
}