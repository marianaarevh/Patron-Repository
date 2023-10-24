public class Libro {
    private int isbn;
    private String titulo;
    private String autor;

    public Libro(int isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }


    // ISBN 
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    // Titulo
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Autor
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // ToString
    @Override
    public String toString() {
        return "Libro [ISBN: " + isbn + ", Título: " + titulo + ", Autor: " + autor + "]";
    }
}
