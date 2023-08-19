public class Main {

    public static void main(String args[]) {
        System.out.println("#### INICIANDO PROGRAMA DE SALA DE CINE ####");
        System.out.println("--- Publicando película de estreno ---");

        Pelicula megan = new Pelicula("Megan", "102 minutos", 13, "Gerard Johnstone");
        megan.imprimirPelicula();

        System.out.println("--- Iniciando Sala de cine ---");

        Cine sala1 = new Cine(megan, 40, 8, 9);
        String identificadorColumnas[] = {"A","B","C","D","E","F","G","H","I"};
        sala1.setAsientosLibres(sala1.inicializarSala(identificadorColumnas));
        sala1.imprimirAsientosLibres(sala1.getFilas(), sala1.getColumnas());

        System.out.println("--- Espectador 1 compra boletos ---");
        Espectador jose = new Espectador("José Sánchez", 19, 120);
        jose.imprimirEspectador();
        // El espectador aparta 3 asientos
        sala1.reservarAsiento(6, "B", identificadorColumnas);
        sala1.reservarAsiento(6, "C", identificadorColumnas);
        sala1.reservarAsiento(6, "D", identificadorColumnas);

        sala1.imprimirAsientosLibres(sala1.getFilas(), sala1.getColumnas());

        System.out.println("--- Espectador 2 compra boletos ---");
        Espectador carlos = new Espectador("Carlos Sánchez", 20, 80);
        carlos.imprimirEspectador();
        // El espectador aparta 2 asientos
        sala1.reservarAsiento(5, "E", identificadorColumnas);
        sala1.reservarAsiento(5, "F", identificadorColumnas);

        sala1.imprimirAsientosLibres(sala1.getFilas(), sala1.getColumnas());

        System.out.println("--- Espectador 3 compra boletos ---");
        Espectador ernesto = new Espectador("Ernesto Flores", 20, 200);
        ernesto.imprimirEspectador();
        // El espectador aparta 5 asientos
        sala1.reservarAsiento(4, "B", identificadorColumnas);
        sala1.reservarAsiento(4, "C", identificadorColumnas);
        sala1.reservarAsiento(4, "D", identificadorColumnas);
        sala1.reservarAsiento(4, "E", identificadorColumnas);
        sala1.reservarAsiento(4, "F", identificadorColumnas);

        sala1.imprimirAsientosLibres(sala1.getFilas(), sala1.getColumnas());
    }
}
