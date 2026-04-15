package ejercicio7.modelo;

public class ModeloRegistrarUsuario {
    ArchivoTexto objArch;

    public void guardarUsuario(String usuario, String contrasena) {
        Usuario objUsu = new Usuario();
        objUsu.setUsuario(usuario);
        objUsu.setContrasena(contrasena);

        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('w', "usuarios.txt");
        this.objArch.crearLinea(objUsu.toString());
        this.objArch.cerrarArchivo('w');
    }
}