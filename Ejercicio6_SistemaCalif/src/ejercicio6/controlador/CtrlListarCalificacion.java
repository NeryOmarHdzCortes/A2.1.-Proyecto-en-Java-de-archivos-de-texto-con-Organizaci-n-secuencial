package ejercicio6.controlador;

import ejercicio6.modelo.ModeloListarCalificacion;

public class CtrlListarCalificacion {
    ModeloListarCalificacion objModeloListar;

    public CtrlListarCalificacion() {
        this.objModeloListar = new ModeloListarCalificacion();
    }

    public Object[][] obtenerDatos(String[] columnas) {
        return this.objModeloListar.obtenerMatrizCalificaciones(columnas);
    }
}