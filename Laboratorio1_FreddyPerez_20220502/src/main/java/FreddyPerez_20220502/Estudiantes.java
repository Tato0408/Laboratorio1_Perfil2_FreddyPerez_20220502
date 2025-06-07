package FreddyPerez_20220502;

public class Estudiantes {
    public int id;
    public String nombre;
    public String edad;
    public double promedio;

    public Estudiantes(int id, String nombre, String edad, double promedio) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Promedio: " + promedio;
    }
}
