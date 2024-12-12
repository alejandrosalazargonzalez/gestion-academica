package es.ies.puerto;
import java.util.Objects;

public abstract class Persona {
    private String id;
    private String nombre;
    private int edad;

    /**
     * Constructor vacio
     */
    public Persona() {
    }

    /**
     * Constructor completo
     * @param id
     * @param nombre
     * @param edad
     */
    public Persona(String id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getter Setter
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Funcion que saluda
     * @return String con mensaje
     */
    public String saludar()
    {
        return "Hola yo soy " + nombre;
    }

    abstract String pensar();

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(id, persona.id) && Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            "}";
    }
    
}
