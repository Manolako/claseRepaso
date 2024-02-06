package mascotas;

public class main {
    public static void main(String[] args) {
        TiendaMascota tiendaMascota = new TiendaMascota();


        tiendaMascota.agregarmascota("Pepa", 4, "Cerdo");
        tiendaMascota.agregarmascota("Filipa", 1, "Puercoespin");
        tiendaMascota.agregarmascota("Sultan",6, "Perro");

        tiendaMascota.vendermascota("Pepa");


        tiendaMascota.mostrarInventario();

    }
}
