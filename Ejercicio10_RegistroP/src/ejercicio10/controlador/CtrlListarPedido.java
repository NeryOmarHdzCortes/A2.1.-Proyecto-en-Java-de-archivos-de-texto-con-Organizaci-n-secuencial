package ejercicio10.controlador;

import ejercicio10.modelo.ModeloListarPedido;

public class CtrlListarPedido {
    ModeloListarPedido objModeloListar;

    public CtrlListarPedido() {
        this.objModeloListar = new ModeloListarPedido();
    }

    public Object[][] obtenerDatos(String[] columnas) {
        return this.objModeloListar.obtenerMatrizPedidos(columnas);
    }
}