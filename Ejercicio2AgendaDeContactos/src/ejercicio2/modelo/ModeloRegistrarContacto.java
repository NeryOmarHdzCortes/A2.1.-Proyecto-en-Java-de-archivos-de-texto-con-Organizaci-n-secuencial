package ejercicio2.modelo;

public class ModeloRegistrarContacto {
    ArchivoTexto objArch;

    public void guardarContacto(String nombre, String telefono, String email) {
        Contacto objCon = new Contacto();
        objCon.setNombre(nombre);
        objCon.setTelefono(telefono);
        objCon.setEmail(email);

        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('w', "contactos.txt");
        this.objArch.crearLinea(objCon.toString());
        this.objArch.cerrarArchivo('w');
    }
}