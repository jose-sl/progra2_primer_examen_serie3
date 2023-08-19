public class Espectador {

    String nombre;

    int edad;

    int dinero;

    public Espectador(String nombre, int edad, int dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public void imprimirEspectador() {
        System.out.println("Espectador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dinero=" + dinero +
                '}');
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
}
