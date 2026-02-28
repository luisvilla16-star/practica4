package practica4;

import java.util.ArrayList;

/**
 * Clase que representa el catálogo de películas en el streaming
 */
public class Catalogo {

    private ArrayList<Pelicula> peliculas;

    /**
     * Constructor que inicializa la lista de películas como vacía
     */
    public Catalogo() {
        peliculas = new ArrayList<>();
    }

    /**
     * Agregar película
     * @param p objeto Pelicula para agregar
     */
    public void agregarPelicula(Pelicula p) {
        peliculas.add(p);
    }

    /**
     * Devuelve la información de todas las películas
     * @return resultado
     */
    public String getPeliculas() {
        if (peliculas.isEmpty()) {
            return "El catálogo está vacío";
        }

        String resultado = "";

        for (Pelicula p : peliculas) {
            resultado += "Titulo: " + p.getTitulo() + "\n";
            resultado += "Director: " + p.getDirector() + "\n";
            resultado += "Año Estreno: " + p.getAñoEstreno() + "\n";
            resultado += "Genero: " + p.getGenero() + "\n";
            resultado += "Duracion: " + p.getDuracion() + "\n";
            resultado += "----------------------\n";
        }

        return resultado;
    }

    /**
     * Busca la película por el título
     * @param titulo
     * @return información o mensaje de no encontrado
     */
    public String buscarPeliculaPorTitulo(String titulo) {
        for (Pelicula p : peliculas) {
            if (p.getTitulo().equalsIgnoreCase(titulo)) {
                return p.getInformacion();
            }
        }
        return "No se encontró la película con título: " + titulo;
    }
}