public class Pelicula {

    String titulo;

    String duracion;

    int edadMinima;

    String director;

    public Pelicula(String titulo, String duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public void imprimirPelicula() {
        System.out.println("Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", duracion='" + duracion + '\'' +
                ", edadMinima=" + edadMinima +
                ", director='" + director + '\'' +
                '}');
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
