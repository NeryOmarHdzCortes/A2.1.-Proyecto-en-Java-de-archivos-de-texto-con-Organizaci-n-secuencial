package ejercicio9.modelo;

public class ModeloRegistrarLibro {
    ArchivoTexto objArch;

    public void guardarLibro(String isbn, String titulo, String autor) {
        Libro objLib = new Libro();
        objLib.setIsbn(isbn);
        objLib.setTitulo(titulo);
        objLib.setAutor(autor);

        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('w', "libros.txt");
        this.objArch.crearLinea(objLib.toString());
        this.objArch.cerrarArchivo('w');
    }
}