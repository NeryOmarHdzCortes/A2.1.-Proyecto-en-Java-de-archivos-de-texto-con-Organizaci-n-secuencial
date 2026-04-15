package ejercicio5.controlador;

import ejercicio5.modelo.ModeloRegistrarActividad;

public class CtrlRegistrarActividad {
    ModeloRegistrarActividad objModeloRegistrar;

    public CtrlRegistrarActividad() {
        this.objModeloRegistrar = new ModeloRegistrarActividad();
    }

    public void registrarActividad(String fecha, String actividad) {
        this.objModeloRegistrar.guardarActividad(fecha, actividad);
    }
}