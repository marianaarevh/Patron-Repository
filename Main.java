import java.util.List;

public class Main {
    public static void main(String[] args){
        LibroRepository libroRepository = new SistemaLibrosRepository();

        // agregar libros
        Libro libro1 = new Libro("9780307350486","Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("9780061120084","Matar un ruiseñor", "Harper Lee");
        Libro libro3 = new Libro("9780743273565","El Gran Gatsby", "F. Scott Fitzgerald");

        libroRepository.agregarLibro(libro1);
        libroRepository.agregarLibro(libro2);
        libroRepository.agregarLibro(libro3);

        // listar libros

        System.out.println("lista de libros: ");
        List<Libro> libros = libroRepository.listarLibros();
        for (Libro libro : libros) {
            System.out.println(libro);
        }

        // recuperar libro
        String isbn = "9780061120084";
        System.out.println("buscando libro con isbn = " + isbn);

        Libro libroEncontrado = libroRepository.recuperarLibro(isbn);
        System.out.println("libro encontrado: "+libroEncontrado);

        // eliminar libro
        isbn = "9780307350486";
        System.out.println("eliminando libro con isbn = " + isbn);
        libroRepository.eliminarLibro(isbn);

        
        System.out.println("lista de libros: ");
        libros = libroRepository.listarLibros();
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
