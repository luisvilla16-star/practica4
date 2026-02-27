package practica4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatalogoTest {

    private Catalogo catalogo;
    private Pelicula pelicula1;
    private Pelicula pelicula2;

    @BeforeEach
    void setUp() {
        catalogo = new Catalogo();
        pelicula1 = new Pelicula("El Señor de los Anillos", "Peter Jackson", 2001, "Fantasía", 178);
        pelicula2 = new Pelicula("Forrest Gump", "Robert Zemeckis", 1994, "Drama", 142);
    }
    @Test
    void agregarPelicula() {
        catalogo.agregarPelicula(pelicula1);
        assertTrue(catalogo.getPeliculas().contains("El Señor de los Anillos"));

        catalogo.agregarPelicula(pelicula2);
        assertTrue(catalogo.getPeliculas().contains("Forrest Gump"));
    }

    @Test
    void getPeliculas() {
        catalogo.agregarPelicula(pelicula1);
        catalogo.agregarPelicula(pelicula2);

        String listaPeliculas = catalogo.getPeliculas();

        assertTrue(listaPeliculas.contains("El Señor de los Anillos"));
        assertTrue(listaPeliculas.contains("Forrest Gump"));
        assertTrue(listaPeliculas.contains("2001"));
        assertTrue(listaPeliculas.contains("1994"));
    }

    @Test
    public void testBuscarPeliculaPorTituloExistente() {
        catalogo.agregarPelicula(pelicula1);
        catalogo.agregarPelicula(pelicula2);

        String resultado = catalogo.buscarPeliculaPorTitulo("Forrest Gump");
        assertTrue(resultado.contains("Forrest Gump"));
        assertTrue(resultado.contains("1994"));
    }

    @Test
    public void testBuscarPeliculaPorTituloNoExistente() {
        catalogo.agregarPelicula(pelicula1);

        String resultado = catalogo.buscarPeliculaPorTitulo("Titanic");
        assertEquals("No se encontró la película con título: Titanic", resultado);
    }

    @Test
    public void testBuscarPeliculaPorTituloCaseInsensitive() {
        catalogo.agregarPelicula(pelicula1);

        String resultado = catalogo.buscarPeliculaPorTitulo("el señor de los anillos");
        assertTrue(resultado.contains("El Señor de los Anillos"));
    }
    @Test
    public void testCatalogoVacio() {
        String resultado = catalogo.getPeliculas();
        assertEquals("El catálogo está vacío", resultado);
    }
}