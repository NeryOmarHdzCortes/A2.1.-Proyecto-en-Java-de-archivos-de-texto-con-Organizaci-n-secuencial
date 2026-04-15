package ejercicio2.controlador;

import ejercicio2.modelo.ModeloRegistrarContacto;

public class CtrlRegistrarContacto {
    ModeloRegistrarContacto objModeloRegistrar;

    public CtrlRegistrarContacto() {
        this.objModeloRegistrar = new ModeloRegistrarContacto();
    }

    public void registrarContacto(String nombre, String telefono, String email) {
        this.objModeloRegistrar.guardarContacto(nombre, telefono, email);
    }
}