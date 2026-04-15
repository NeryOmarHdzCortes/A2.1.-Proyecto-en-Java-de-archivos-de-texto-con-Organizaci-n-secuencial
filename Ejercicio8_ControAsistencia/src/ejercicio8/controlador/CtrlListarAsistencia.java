package ejercicio8.controlador;

import ejercicio8.modelo.ModeloListarAsistencia;

public class CtrlListarAsistencia {
    ModeloListarAsistencia objModeloListar;

    public CtrlListarAsistencia() {
        this.objModeloListar = new ModeloListarAsistencia();
    }

    public Object[][] obtenerDatos(String[] columnas) {
        return this.objModeloListar.obtenerMatrizAsistencias(columnas);
    }
}