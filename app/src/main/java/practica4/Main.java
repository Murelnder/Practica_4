package practica4;

/*
 * El main no regresa nada, solo muestra la infomracion en la consola 
 * @author Guillen Aviles Eduardo
 */
public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        catalogo.inicializar();
        System.out.println(catalogo.buscarPeliculaPorTitulo("test"));
        System.out.println(catalogo.buscarPeliculaPorTitulo("Inception"));

        System.out.println(catalogo);
    }
}
