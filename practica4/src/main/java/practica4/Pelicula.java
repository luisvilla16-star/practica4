package practica4;

public class Pelicula {

    private String titulo;
    private String director;
    private int añoEstreno;
    private String genero;
    private int duracion;

    public Pelicula() {}

    public Pelicula(String titulo, String director, int añoEstreno, String genero, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.añoEstreno = añoEstreno;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    public int getAñoEstreno() {
        return añoEstreno;
    }
    public void setAñoEstreno(int añoEstreno) {
        this.añoEstreno = añoEstreno;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getInformacion() {
        return "Título: " + titulo +
                ", Director: " + director +
                ", Año: " + añoEstreno +
                ", Género: " + genero +
                ", Duración: " + duracion + " min";
    }
    public boolean esClasica() {
        return añoEstreno <= 2000;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\n" +
                "Director: " + director + "\n" +
                "Año Estreno: " + añoEstreno + "\n" +
                "Género: " + genero + "\n" +
                "Duración: " + duracion + "\n";
    }
}