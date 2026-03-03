package practica4;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Guillen Aviles Eduardo
 * Este es la clase del catalogo
 * Al inicio crea 3 pleliculas
 */

public class Catalogo {

    ArrayList<Pelicula> peliculas = new ArrayList<>();
    Scanner tecaldo = new Scanner(System.in);

    Pelicula p1 = new Pelicula("Inception", "Christopher Nolan", 2010, "Ciencia Ficcion", 148);

    Pelicula p2 = new Pelicula("The Godfather", "Francis Ford Coppola", 1972, "Drama/Crime", 175);

    Pelicula p3 = new Pelicula("Pulp Fiction", "Quentin Tarantino", 1994, "Crime/Drama", 154);

    /*
     * Metodo donde se agrega una pelicula en el catalogo llamado pelicula
     * 
     * @param pelicula
     */
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    /*
     * Metodo donde muesta las pelculas que contiene el catalogo
     * 
     * @return
     */
    public String getPeliculas() {

        String info = "";

        for (Pelicula p : peliculas) {
            info += p.toString() + "\n\n";
        }

        return info;
    }

    /*
     * Metodo de buscar la pelcula por titulo
     * 
     * @param titulo
     * 
     * @return
     */
    public String buscarPeliculaPorTitulo(String titulo) {

        for (Pelicula p : peliculas) {
            if (p.getTitulo().equalsIgnoreCase(titulo)) {
                return p.toString();
            }
        }

        return "Película no encontrada";
    }

    /*
     * Metodo to string donde va llama la funcion getPeliuclas()
     * 
     * @see getPliculas()
     */
    public String toString() {
        return getPeliculas();
    }

    /**
     * Metodo de incializar donde se agregan las 3 peliculas que se definieron.
     */
    public void inicializar() {
        peliculas.add(p1);
        peliculas.add(p2);
        peliculas.add(p3);
    }

    /*
     * @return la cantidad de pliculas que se encuentran en el arrgelo
     */
    public int cantidadPleiculas() {
        return peliculas.size();
    }
}
