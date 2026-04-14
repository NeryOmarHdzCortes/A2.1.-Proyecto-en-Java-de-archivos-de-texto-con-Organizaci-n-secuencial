package ejercicio3.controlador;

import ejercicio3.modelo.ModeloListarProducto;

public class CtrlListarProducto {
    ModeloListarProducto objModeloListar;

    public CtrlListarProducto() {
        this.objModeloListar = new ModeloListarProducto();
    }

    public Object[][] obtenerDatos(String[] columnas) {
        return this.objModeloListar.obtenerMatrizProductos(columnas);
    }
}