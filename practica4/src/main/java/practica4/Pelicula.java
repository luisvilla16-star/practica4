package practica4;

public class Pelicula {
    private String titulo;
    private String director;
    private int añoEstreno;
    private String genero;
    public int duracion;

    public Pelicula() {
    }

    /**
     * constructor que incilaiza con parametro la pelicula
     * @param titulo de la pelicula
     * @param directorio de la pelicula
     * @param añoEstreno de la pelicula
     * @param genero de la pelicula
     * @param duracion de la pelicula
     */
    public Pelicula(String titulo, String directorio, int añoEstreno, String genero, int duracion) {
        this.titulo = titulo;
        this.director = directorio;
        this.añoEstreno = añoEstreno;
        this.genero = genero;
        this.duracion = duracion;
    }

    /**
     * metodo de la clase  para mostrar el titulo de la pelicula
     * @return titulo de la pelicula
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * metodo de la clase para modificar el titulo de la pelicula
     * @param titulo de la pelicula
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Metodo de la clase para mostrar el nombre del rictor de la pelicula
     * @return director de la pelicula
     */
    public String getDirector() {
        return director;
    }

    /**
     * metodo de la clase para modificar el nombre del director de la pelicula
     * @param director de la pelicual
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * metodo de la clase permite mostrar el año de estre de la pelicual
     * @return añoEstreno de la pelicula
     */
    public int getAñoEstreno() {
        return añoEstreno;
    }

    /**
     * metodo de la clase para modificar  el año de estreno de la pelicula
     * @param añoEstreno de la pelicula
     */
    public void setAñoEstreno(int añoEstreno) {
        this.añoEstreno = añoEstreno;
    }

    /**
     * metodo de la clase muestra el genero de la pelicula
     * @return genero de la pelicual
     */
    public String getGenero() {
        return genero;
    }

    /**
     * metodo de la clase que permite modificar el genero de la pelicula
     * @param genero de la pelicual
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * metodo de la clase mostrar la duracion de la pelicula
     * @return duracion de la pelicula
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * metodo de la clase modificar la duaracion de la pelicual
     * @param duracion  de la pelicual
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * devuelve la infromacion del la pelicula
     */
    public void getInformacion() {
        System.out.println("titulo:" + this.titulo);
        System.out.println("director:" + this.director);
        System.out.println("Año Estreno:" + this.añoEstreno);
        System.out.println("Genero:" + this.genero);
        System.out.println("Duracion:" + this.duracion);
    }

    /**
     * deuielve si ya pericula es clasica
     * @return regresa un boolean
     */
    public boolean esClasica() {
        if (this.añoEstreno <=2000) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * regresa la cadena de la con la infromacion
     * @return string
     */
    public String toString(){
        return "Título: " + this.titulo + "\n" +
                "Director: " + this.director + "\n" +
                "Año Estreno: " + this.añoEstreno + "\n" +
                "Género: " + this.genero + "\n" +
                "Duración: " + this.duracion +"\n";
    }
}
