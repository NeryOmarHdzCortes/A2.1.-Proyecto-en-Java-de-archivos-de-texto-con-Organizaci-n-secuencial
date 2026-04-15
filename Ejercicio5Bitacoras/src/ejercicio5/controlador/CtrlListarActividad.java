package ejercicio5.controlador;

import ejercicio5.modelo.ModeloListarActividad;

public class CtrlListarActividad {
    ModeloListarActividad objModeloListar;

    public CtrlListarActividad() {
        this.objModeloListar = new ModeloListarActividad();
    }

    public Object[][] obtenerDatos(String[] columnas) {
        return this.objModeloListar.obtenerMatrizActividades(columnas);
    }
}