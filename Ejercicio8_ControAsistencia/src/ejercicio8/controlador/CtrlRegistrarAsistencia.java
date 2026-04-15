package ejercicio8.controlador;

import ejercicio8.modelo.ModeloRegistrarAsistencia;

public class CtrlRegistrarAsistencia {
    ModeloRegistrarAsistencia objModeloRegistrar;

    public CtrlRegistrarAsistencia() {
        this.objModeloRegistrar = new ModeloRegistrarAsistencia();
    }

    public void registrarAsistencia(String nombre, String fecha, String estado) {
        this.objModeloRegistrar.guardarAsistencia(nombre, fecha, estado);
    }
}