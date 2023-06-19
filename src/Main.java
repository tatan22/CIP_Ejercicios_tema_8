public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        // Utiliza los setters para asignar valores a las propiedades
        persona.setEdad(25);
        persona.setNombre("Juan");
        persona.setTelefono("123456789");

        // Utiliza los getters para obtener los valores de las propiedades y mostrarlos por consola
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Teléfono: " + persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    // Getters y Setters para la propiedad 'edad'
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getters y Setters para la propiedad 'nombre'
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters para la propiedad 'telefono'
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
