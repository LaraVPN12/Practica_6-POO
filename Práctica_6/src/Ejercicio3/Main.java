
package Ejercicio3;

public class Main {
    public static void main(String[] args){
        ArchivoMultimedia archivo = new ArchivoMultimedia("Práctica6", ".java");
        Audio audio = new Audio("AUD", ".mp3");
        Video video = new Video("Toy Story 4", ".mkv", "3,589");
        archivo.Reproducir();
        System.out.println("*****************************************");
        archivo=audio;
        archivo.Reproducir();
        System.out.println("*****************************************");
        archivo=video;
        archivo.Reproducir();
    }
}
