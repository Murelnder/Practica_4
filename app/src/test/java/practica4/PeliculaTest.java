package practica4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PeliculaTest {

    @Test
    void testEsClasica() {
        Pelicula peliculaClasica = new Pelicula("Casablanca", "Michael Curtiz", 1942, "Romance", 102);
        Pelicula peliculaNoClasica = new Pelicula("Inception", "Christopher Nolan", 2010, "Ciencia Ficción", 148);

        assertTrue(peliculaClasica.esClasica());
        assertFalse(peliculaNoClasica.esClasica());
    }

    @Test
    void testGetInformacion() {
        Pelicula pelicula = new Pelicula("Pulp Fiction", "Quentin Tarantino", 1994, "Crimen", 154);

        String infoEsperada = "Título: Pulp Fiction, Director: Quentin Tarantino, Año: 1994, Género: Crimen, Duración: 154 min";

        assertEquals(infoEsperada, pelicula.getInformacion());
    }

    @Test
    void testGetTitulo() {
        Pelicula pelicula = new Pelicula("Matrix", "Hermanas Wachowski", 1999, "Ciencia Ficción", 136);
        assertEquals("Matrix", pelicula.getTitulo());
    }

    @Test
    void testToString() {
        Pelicula pelicula = new Pelicula("Matrix", "Hermanas Wachowski", 1999, "Ciencia Ficción", 136);

        assertTrue(pelicula.toString().contains("Matrix"));
        assertTrue(pelicula.toString().contains("Hermanas Wachowski"));

    }
}
