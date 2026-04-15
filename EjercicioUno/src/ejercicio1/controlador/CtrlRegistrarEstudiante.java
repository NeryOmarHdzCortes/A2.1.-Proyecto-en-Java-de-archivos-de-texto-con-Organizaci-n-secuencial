package ejercicio1.controlador;

import ejercicio1.modelo.ModeloRegistrarEstudiante;

public class CtrlRegistrarEstudiante {
    ModeloRegistrarEstudiante objModeloRegistrar;

    public CtrlRegistrarEstudiante() {
        this.objModeloRegistrar = new ModeloRegistrarEstudiante();
    }
    
    public void registrarEstudiante(String numControl, String nombre, String carrera, double promedio) {
        this.objModeloRegistrar.guardarEstudiante(numControl, nombre, carrera, promedio);
    }
}