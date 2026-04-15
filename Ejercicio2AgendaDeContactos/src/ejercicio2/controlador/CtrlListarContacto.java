package ejercicio2.controlador;

import ejercicio2.modelo.ModeloListarContacto;

public class CtrlListarContacto {
    ModeloListarContacto objModeloListar;

    public CtrlListarContacto() {
        this.objModeloListar = new ModeloListarContacto();
    }

    public Object[][] obtenerDatos(String[] columnas) {
        return this.objModeloListar.obtenerMatrizContactos(columnas);
    }
}