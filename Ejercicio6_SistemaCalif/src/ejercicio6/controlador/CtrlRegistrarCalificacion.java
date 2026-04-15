package ejercicio6.controlador;

import ejercicio6.modelo.ModeloRegistrarCalificacion;

public class CtrlRegistrarCalificacion {
    ModeloRegistrarCalificacion objModeloRegistrar;

    public CtrlRegistrarCalificacion() {
        this.objModeloRegistrar = new ModeloRegistrarCalificacion();
    }

    public void registrarCalificacion(String nombre, String materia, double calificacion) {
        this.objModeloRegistrar.guardarCalificacion(nombre, materia, calificacion);
    }

}