package practica4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class CatalogoTest {

    private Catalogo catalogo;
    private Pelicula pelicula1;
    private Pelicula pelicula2;

    @BeforeEach
    public void setUp() {
        catalogo = new Catalogo();
        pelicula1 = new Pelicula("El Señor de los Anillos", "Peter Jackson", 2001, "Fantasía", 178);
        pelicula2 = new Pelicula("Forrest Gump", "Robert Zemeckis", 1994, "Drama", 142);
    }

    @Test
    void testAgregarPelicula() {
        assertEquals(0, catalogo.cantidadPleiculas());

        catalogo.agregarPelicula(pelicula1);
        assertEquals(1, catalogo.cantidadPleiculas());

        catalogo.agregarPelicula(pelicula2);
        assertEquals(2, catalogo.cantidadPleiculas());

    }

    @Test
    void testBuscarPeliculaPorTitulo() {
        catalogo.agregarPelicula(pelicula1);
        catalogo.agregarPelicula(pelicula2);

        String resultado = catalogo.buscarPeliculaPorTitulo("Forrest Gump");
        assertTrue(resultado.contains("Forrest Gump"));
        assertTrue(resultado.contains("1994"));
    }

    @Test
    void testGetPeliculas() {
        catalogo.agregarPelicula(pelicula1);
        catalogo.agregarPelicula(pelicula2);

        String listaPeliculas = catalogo.getPeliculas();

        assertTrue(listaPeliculas.contains("El Señor de los Anillos"));
        assertTrue(listaPeliculas.contains("Forrest Gump"));
        assertTrue(listaPeliculas.contains("2001"));
        assertTrue(listaPeliculas.contains("1994"));
    }

    @Test
    void testInicializar() {
        Catalogo catalogo1 = new Catalogo();
        catalogo1.inicializar();
        assertEquals(3, catalogo1.cantidadPleiculas());

    }

    @Test
    void testToString() {
        catalogo.agregarPelicula(pelicula2);
        assertTrue(catalogo.toString().contains("Forrest Gump"));
    }

}