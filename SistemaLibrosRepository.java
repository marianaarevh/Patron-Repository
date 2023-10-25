import java.util.ArrayList;
import java.util.List;

public class SistemaLibrosRepository implements LibroRepository{
    List<Libro> libros = new ArrayList<>();

    @Override
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public List<Libro> listarLibros() {
        return libros;
    }

    @Override
    public Libro recuperarLibro(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    @Override
    public void eliminarLibro(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                libros.remove(libro);
                break;
            }
        }
    }

}
