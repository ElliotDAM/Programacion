package es.ies.puerto.modelo.entity;

public class LibroEntity {
    private String isbn;
    private String titulo;
    private String autor;
    private String fechaPublicacion;
    private int idBiblioteca;
    
    public LibroEntity(String isbn, String titulo, String autor, String fechaPublicacion, int idBiblioteca) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.idBiblioteca = idBiblioteca;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getIdBiblioteca() {
        return idBiblioteca;
    }

    
}
