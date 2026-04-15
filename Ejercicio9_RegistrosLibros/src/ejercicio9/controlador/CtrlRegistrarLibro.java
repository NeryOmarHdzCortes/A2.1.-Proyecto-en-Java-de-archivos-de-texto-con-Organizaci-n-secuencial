package ejercicio9.controlador;

import ejercicio9.modelo.ModeloRegistrarLibro;

public class CtrlRegistrarLibro {
    ModeloRegistrarLibro objModeloRegistrar;

    public CtrlRegistrarLibro() {
        this.objModeloRegistrar = new ModeloRegistrarLibro();
    }

    public void registrarLibro(String isbn, String titulo, String autor) {
        this.objModeloRegistrar.guardarLibro(isbn, titulo, autor);
    }
}