package practica4;

/**
 * Clase Pelicula con sus atributos de titulo, director, el año, el genero y su
 * tiempo.
 */
public class Pelicula {

    String titulo;
    String director;
    int year;
    String genero;
    int time;

    /*
     * El constructor de la clase pelicula
     * 
     * @param titulo
     * 
     * @param director
     * 
     * @param year
     * 
     * @param genero
     * 
     * @param time
     */

    public Pelicula(String titulo, String director, int year, String genero, int time) {
        this.titulo = titulo;
        this.director = director;
        this.year = year;
        this.genero = genero;
        this.time = time;
    }

    /*
     * El metodo que regresa toda la informacion sobre la pelicula
     * 
     * @return
     */
    public String getInformacion() {
        return ("Título: " + titulo + ", Director: " + director + ", Año: " + year + ", Género: " + genero
                + ", Duración: " + time + " min");
    }

    /*
     * El metodo para determinar si la pelicula es clasica o no
     * 
     * @return regresa un verdadero si la variable year vale mas que 24
     */
    public boolean esClasica() {
        if (year < 2001) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * El metodo toString donde regresa el toString del constructor
     */
    public String toString() {
        return ("\n\nEl titulo de la pelicula es:" + titulo + " su director es:" + director + " el año que salio es:"
                + year
                + " el genero de la pelicula es: " + genero + " con  un tiempo de: " + time);
    }

    /*
     * El metodo que regresa el titulo de la pelicula
     * 
     * @return regresa el titulo de la pratica
     */
    public String getTitulo() {
        return titulo;
    }
}
