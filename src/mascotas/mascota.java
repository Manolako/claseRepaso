package mascotas;
public class mascota {
    private String nombre;

    private int edad;

    private String tipoAnimal;

    public mascota(String nombre, int edad, String tipoAnimal){
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAnimal = tipoAnimal;
    }

    public String getNombre() {
        return nombre;
    }
}
