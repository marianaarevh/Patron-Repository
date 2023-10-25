import java.util.List;

public interface LibroRepository {
    List<Libro> listarLibros();
    Libro recuperarLibro(String isbn);
    void agregarLibro(Libro libro);
    void eliminarLibro(String isbn);

}
