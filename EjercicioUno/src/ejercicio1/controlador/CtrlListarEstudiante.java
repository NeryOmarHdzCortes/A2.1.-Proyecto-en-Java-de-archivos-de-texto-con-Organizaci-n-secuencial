package ejercicio1.controlador;

import ejercicio1.modelo.ModeloListarEstudiantes;

public class CtrlListarEstudiante {
    ModeloListarEstudiantes objModeloListar;

    public CtrlListarEstudiante() {
        this.objModeloListar = new ModeloListarEstudiantes();
    }
    
    public Object[][] obtenerDatos(String[] columnas) {
        return this.objModeloListar.obtenerMatrizEstudiantes(columnas);
    }
}