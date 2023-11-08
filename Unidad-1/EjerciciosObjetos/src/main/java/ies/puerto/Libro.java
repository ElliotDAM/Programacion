package ies.puerto;
/**
 * Clase Libro creada como ejemplo
 * @author ElliotDAM
 */
public class Libro{

    private String titulo;
    private String autor;
    private int anioPublicacion;

    /**
     * Constructor por defecto de la clase
     */
    public Libro(){}

    /**
     * Constructor con el parametro titulo
     * @param titulo del libro
     */
    public Libro(String titulo){
        this.titulo = titulo;
    }

    /**
     * Constructor con el parametro titulo y autor
     * @param titulo
     * @param autor
     */
    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    /**
     * Constructor con los parametros titulo, autor y anio
     * @param titulo
     * @param autor
     * @param anioPublicacion
     */
    public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    /**
     * Getters and setters de la clase.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * 
     * @return
     */

     public void cambiarAutor(String autor){
        this.autor = autor;
     }
    /**
     * ToString creado para mostrar la información de cada libro.
     * @return informacion del libro.
     */
    public String infoLibro(){

        return "Titulo: "+ titulo + ", Autor: " + autor + ", Anio Publicacion: "+ anioPublicacion + ".";
    }

}