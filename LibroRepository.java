import java.util.List;

public interface LibroRepository {
    List<Libro> listarLibros();
    Libro recuperarLibro(int isbn);
    void agregarLibro(Libro libro);
    void eliminarLibro(int isbn);

}
