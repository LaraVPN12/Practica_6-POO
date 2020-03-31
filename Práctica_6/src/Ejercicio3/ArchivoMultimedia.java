
package Ejercicio3;

public class ArchivoMultimedia {
    protected String NombreArchivo;
    protected String Formato;

    public ArchivoMultimedia(String NombreArchivo, String Formato) {
        this.NombreArchivo = NombreArchivo;
        this.Formato = Formato;
    }

    public String getNombreArchivo() {
        return NombreArchivo;
    }

    public void setNombreArchivo(String NombreArchivo) {
        this.NombreArchivo = NombreArchivo;
    }

    public String getFormato() {
        return Formato;
    }

    public void setFormato(String Formato) {
        this.Formato = Formato;
    }
    public void Reproducir(){
        System.out.println("Archivo Multimedia en Reproducción...");
        System.out.println("Nombre del Archivo: "+this.NombreArchivo+"\nFormato: "+this.Formato);
    }
}
