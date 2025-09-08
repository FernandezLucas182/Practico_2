package com.example.practico_2.Model;

public class Libro {
    private String titulo;
    private String autor;
    private int anio;
    private String descripcion;

    private int imagenId;


    public Libro(String titulo, String autor, int anio, String descripcion, int imagenId) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.descripcion = descripcion;
        this.imagenId = imagenId;

    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnio() { return anio; }

    public String getDescripcion() { return descripcion;}

    public int getImagenId() {return imagenId;}
}
