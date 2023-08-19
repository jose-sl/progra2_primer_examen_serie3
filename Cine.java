import java.util.Arrays;

public class Cine {

    Pelicula pelicula;

    int precio;

    int filas;

    int columnas;

    String asientosLibres[][];

    public Cine(Pelicula pelicula, int precio, int filas, int columnas) {
        this.pelicula = pelicula;
        this.precio = precio;
        this.filas = filas;
        this.columnas = columnas;
    }

    public String[][] inicializarSala(String[] identificadorColumnas) {

        String asientosSala1[][] = new String[filas][columnas];

        // inicializacion de la sala
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                asientosSala1[fila][columna] = String.format("%1$s%2$s ",fila + 1,identificadorColumnas[columna]);
            }
        }
        return asientosSala1;
    }

    public void imprimirCine() {
        System.out.println("Cine{" +
                "pelicula=" + pelicula +
                ", precio=" + precio +
                '}');
    }

    public void imprimirAsientosLibres(int filas, int columnas) {
        for (int fila = filas - 1; 0 <= fila; fila--) {
            for (int columna = 0; columna < columnas; columna++) {
                if (asientosLibres[fila][columna] == null)
                    System.out.print("|| ");
                else
                    System.out.print(asientosLibres[fila][columna]);
            }
            System.out.println("\n");
        }
    }

    public void reservarAsiento(int fila, String identificador, String[] identificadorColumnas) {
        for (int columna = 0; columna < identificadorColumnas.length; columna++) {
            if (identificador.equals(identificadorColumnas[columna])) {
                asientosLibres[fila - 1][columna] = null;
                break;
            }
        }
        System.out.println(String.format("Asiento %1$s%2$s reservado.", fila, identificador));
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public String[][] getAsientosLibres() {
        return asientosLibres;
    }

    public void setAsientosLibres(String[][] asientosLibres) {
        this.asientosLibres = asientosLibres;
    }
}
