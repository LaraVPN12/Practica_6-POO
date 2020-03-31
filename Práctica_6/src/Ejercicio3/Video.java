
package Ejercicio3;

public class Video extends ArchivoMultimedia{
    protected String Tamaño;
    
    public Video(String NombreArchivo, String Formato, String Tamaño){
        super(NombreArchivo, Formato);
        this.Tamaño=Tamaño;
    }
    @Override
    public void Reproducir(){
        System.out.println("Video en Reproducción...");
        System.out.println("Nombre del Archivo: "+this.NombreArchivo+"\nFormato: "+this.Formato+"\nTamaño en MB: "+this.Tamaño);
    }
}
