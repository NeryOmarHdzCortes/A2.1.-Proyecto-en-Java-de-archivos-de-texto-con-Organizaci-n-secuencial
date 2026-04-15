package ejercicio1.modelo;

public class ModeloRegistrarEstudiante {
    ArchivoTexto objArch;

    public void guardarEstudiante(String numControl, String nombre, String carrera, double promedio) {
        Estudiante objEst = new Estudiante();
        objEst.setNumControl(numControl);
        objEst.setNombre(nombre);
        objEst.setCarrera(carrera);
        objEst.setPromedio(promedio);

        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('w', "estudiantes.txt");
        this.objArch.crearLinea(objEst.toString());
        this.objArch.cerrarArchivo('w');
    }
}