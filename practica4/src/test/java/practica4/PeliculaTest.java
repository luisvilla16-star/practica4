package practica4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PeliculaTest {

    @Test
    public void testConstructorYPersistenciaDatos() {
        Pelicula pelicula = new Pelicula("El Padrino", "Francis Ford Coppola", 1972, "Drama", 175);

        assertEquals("El Padrino", pelicula.getTitulo());
        assertEquals("Francis Ford Coppola", pelicula.getDirector());
        assertEquals(1972, pelicula.getAñoEstreno());
        assertEquals("Drama", pelicula.getGenero());
        assertEquals(175, pelicula.getDuracion());
    }

    @Test
    public void testEsClasica() {
        Pelicula peliculaClasica = new Pelicula("Casablanca", "Michael Curtiz", 1942, "Romance", 102);
        Pelicula peliculaNoClasica = new Pelicula("Inception", "Christopher Nolan", 2010, "Ciencia Ficción", 148);

        assertTrue(peliculaClasica.esClasica());
        assertFalse(peliculaNoClasica.esClasica());
    }

    @Test
    public void testToString() {
        Pelicula pelicula = new Pelicula("Matrix", "Hermanas Wachowski", 1999, "Ciencia Ficción", 136);

        assertTrue(pelicula.toString().contains("Matrix"));
        assertTrue(pelicula.toString().contains("1999"));
    }
}
