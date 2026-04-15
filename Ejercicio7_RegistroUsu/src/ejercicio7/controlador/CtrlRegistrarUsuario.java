package ejercicio7.controlador;

import ejercicio7.modelo.ModeloRegistrarUsuario;

public class CtrlRegistrarUsuario {
    ModeloRegistrarUsuario objModeloRegistrar;

    public CtrlRegistrarUsuario() {
        this.objModeloRegistrar = new ModeloRegistrarUsuario();
    }

    public void registrarUsuario(String usuario, String contrasena) {
        this.objModeloRegistrar.guardarUsuario(usuario, contrasena);
    }
}