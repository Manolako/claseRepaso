package mascotas;

import com.sun.security.auth.NTDomainPrincipal;

public class TiendaMascota {
        mascota[] inventario;

        int cantidadMascotas;

        public TiendaMascota() {
            this.inventario = new mascota[100];
            this.cantidadMascotas=0;
        }
        public void agregarmascota(String nombre, int edad, String tipoAnimal){
            mascota mascota = new mascota(nombre, edad, tipoAnimal);
            inventario[cantidadMascotas]=mascota;
            cantidadMascotas++;
            System.out.println("La mascota" + nombre+ "se ha añadido correctamente");
        }

        public void vendermascota(String nombre){
            for (int i = 0; i < cantidadMascotas; i++) {
                if (inventario[i].getNombre()==nombre) {
                System.out.println("La mascota "+ inventario[i].getNombre()+" Se ha vendido");
                inventario[i]=null;
                    for (int j = 0; j < cantidadMascotas; j++) {
                        inventario[j]=inventario[j+1];

                    }
                    cantidadMascotas--;
                    return;
                }

            }
            System.out.println("La mascota con nombre"+nombre+"no se encuentra");
        }
        public void mostrarInventario() {
            if (cantidadMascotas == 0) {
                System.out.println("No hay mascotas en el inventario");
            } else {
                System.out.println("Inventario de la tienda");
                for (int i = 0; i < cantidadMascotas; i++) {
                    System.out.println("Nombre de la mascota" +inventario[i]);

                }

            }
        }

}

