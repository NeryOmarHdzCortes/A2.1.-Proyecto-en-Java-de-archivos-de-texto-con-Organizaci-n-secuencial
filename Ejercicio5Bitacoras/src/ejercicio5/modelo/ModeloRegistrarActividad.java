package ejercicio5.modelo;

public class ModeloRegistrarActividad {
    ArchivoTexto objArch;

    public void guardarActividad(String fecha, String actividad) {
        Actividad objAct = new Actividad();
        objAct.setFecha(fecha);
        objAct.setActividad(actividad);

        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('w', "bitacora.txt");
        this.objArch.crearLinea(objAct.toString());
        this.objArch.cerrarArchivo('w');
    }
}