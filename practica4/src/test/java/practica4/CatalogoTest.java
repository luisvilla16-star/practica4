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
    void buscarPeliculaPorTituloExistente() {
        catalogo.agregarPelicula(pelicula1);
        catalogo.agregarPelicula(pelicula2);

        String resultado = catalogo.buscarPeliculaPorTitulo("Forrest Gump");

        assertEquals("Forrest Gump", resultado);
    }
}