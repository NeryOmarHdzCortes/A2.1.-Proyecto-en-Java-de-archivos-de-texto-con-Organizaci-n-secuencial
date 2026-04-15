package ejercicio7.modelo;

public class ModeloLoginUsuario {
    ArchivoTexto objArchivoTexto;

    public boolean validarCredenciales(String usuario, String contrasena) {
        this.objArchivoTexto = new ArchivoTexto();
        if (!this.objArchivoTexto.abrirArchivoTexto('r', "usuarios.txt")) {
            return false;
        }
        String lineas = this.objArchivoTexto.obtenerLineas();
        this.objArchivoTexto.cerrarArchivo('r');

        if (lineas.isEmpty()) {
            return false;
        }

        String[] filas = lineas.split("\n");
        for (String fila : filas) {
            String[] datos = fila.split(",");
            if (datos.length == 2) {
                if (datos[0].equals(usuario) && datos[1].equals(contrasena)) {
                    return true;
                }
            }
        }
        return false;
    }
}