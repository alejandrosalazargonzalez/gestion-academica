package es.ies.puerto;
import java.util.Objects;

public class Materia {
    private String nombre;
    private String codigo;
    

    public Materia() {
    }

    public Materia(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Materia)) {
            return false;
        }
        Materia materia = (Materia) o;
        return Objects.equals(nombre, materia.nombre) && Objects.equals(codigo, materia.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, codigo);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", codigo='" + getCodigo() + "'" +
            "}";
    }
    
}
