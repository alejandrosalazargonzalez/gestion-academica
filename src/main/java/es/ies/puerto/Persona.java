package es.ies.puerto;
import java.util.Objects;

public class Persona {
    private String id;
    private String nombre;

    /**
     * Constructor vacio
     */
    public Persona() {
    }

    /**
     * Constructor completo
     * @param id
     * @param nombre
     */
    public Persona(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
