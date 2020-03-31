
package Ejercicio3;

public class Audio extends ArchivoMultimedia{
    public Audio(String NombreArchivo, String Formato){
        super(NombreArchivo, Formato);
    }
    @Override
    public void Reproducir(){
        System.out.println("Audio en Reproducción");
        System.out.println("Nombre del Archivo: "+this.NombreArchivo+"\nFormato: "+this.Formato);
    }
}
