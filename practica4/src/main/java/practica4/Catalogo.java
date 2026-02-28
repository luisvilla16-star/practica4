package practica4;
import java.util.ArrayList;

/**
 * Clase que representa el catalogo de peliculas en el streaming
 */
public class Catalogo {
    ArrayList<Pelicula> peliculas;

    /**
     * Constructor que incializa la lista de pelicula como vacia
     */
    public Catalogo() {
        peliculas = new ArrayList<Pelicula>();
    }

    /**
     * Agregar pelicula
     * @param p objeto Pelicula para agrgar
     */
    public void agregarPelicula(Pelicula p) {
        peliculas.add(p);
    }

    /**
     * devierve la informacion de todas las peliculas
     * @return resultado
     */
    public String getPeliculas() {
        String resultado = "";

        for(Pelicula p : peliculas) {
            resultado += "Titulo: " + p.getTitulo() + "\n";
            resultado += "Director: " + p.getDirector() + "\n";
            resultado += "Año Estreno: " + p.getAñoEstreno() + "\n";
            resultado += "Genero: " + p.getGenero() + "\n";
            resultado += "Duracion: " + p.getDuracion() + "\n";
            resultado += "----------------------\n";
        }
        if (resultado.equals("")) {
            return "El catálogo está vacío";
        }
        return  resultado;
    }

    /**
     * bausca la pelicual por le titulo
     * @param titulo
     * @return titulo
     */

    public String buscarPeliculaPorTitulo(String titulo) {
        for (Pelicula p : peliculas) {
            if (p.getTitulo().equalsIgnoreCase(titulo)) {
                return p.toString();
            }
        }
        return "No se encontró la película con título: " + titulo;
    }

    /**
     * regrea un cadena ordenada de informacion
     * @return reultado
     */
    public String toString(){
        String resultado = "";
        for(Pelicula p : peliculas) {
            resultado += "Titulo: " + p.getTitulo() + "\n";
            resultado += "Director: " + p.getDirector() + "\n";
            resultado += "Año Estreno: " + p.getAñoEstreno() + "\n";
            resultado += "Genero: " + p.getGenero() + "\n";
            resultado += "Duracion: " + p.getDuracion() + "\n";
            resultado += "----------------------\n";

        }
        if (resultado.equals("")) {
            return "El catálogo está vacío";
        }
        return resultado;
    }

}


