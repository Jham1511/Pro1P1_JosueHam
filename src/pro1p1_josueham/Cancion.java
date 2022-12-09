/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1p1_josueham;

/**
 *
 * @author SKX Kafei
 */
public class Cancion {

    private String nombre, album, artista;
    private int anio, duracion;

    public Cancion() {
    }

    @Override
    public String toString() {
        return "Nombre de la cancion: " + nombre
                + "\nNombre del album: " + album
                + "\nNombre del Artista: " + artista
                + "\nAño de lanzamiento: " + anio
                + "\nDuracion de la cancion: " + duracion;
    }

    public Cancion(String nombre, String album, String artista, int anio, int duracion) {
        this.nombre = nombre;
        this.album = album;
        this.artista = artista;
        this.anio = anio;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

}//Fin de la clase

