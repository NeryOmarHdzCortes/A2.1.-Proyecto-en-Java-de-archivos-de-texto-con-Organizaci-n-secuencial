package ejercicio9.controlador;

import ejercicio9.modelo.ModeloListarLibro;

public class CtrlListarLibro {
    ModeloListarLibro objModeloListar;

    public CtrlListarLibro() {
        this.objModeloListar = new ModeloListarLibro();
    }

    public Object[][] obtenerDatos(String[] columnas) {
        return this.objModeloListar.obtenerMatrizLibros(columnas);
    }
}