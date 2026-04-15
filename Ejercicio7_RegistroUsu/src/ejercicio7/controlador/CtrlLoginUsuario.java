package ejercicio7.controlador;

import ejercicio7.modelo.ModeloLoginUsuario;

public class CtrlLoginUsuario {
    ModeloLoginUsuario objModeloLogin;

    public CtrlLoginUsuario() {
        this.objModeloLogin = new ModeloLoginUsuario();
    }

    public boolean validarLogin(String usuario, String contrasena) {
        return this.objModeloLogin.validarCredenciales(usuario, contrasena);
    }
}