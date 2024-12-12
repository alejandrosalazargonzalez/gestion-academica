package es.ies.puerto;
import java.util.Objects;

public class Cursos {
    private String nombre;
    private String codigo;
    

    public Cursos() {
    }

    public Cursos(String nombre, String codigo) {
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

    /**
     * agrega un estudiante
     * @param estudiante
     * @return
     */
    public Estudiante agregarEstudiante(Estudiante estudiante){
        return estudiante;
    }

    /**
     * lista los estudiantes
     * @return
     */
    public String listarEstudiante()
    {
        return "listando estudiantes";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cursos)) {
            return false;
        }
        Cursos cursos = (Cursos) o;
        return Objects.equals(nombre, cursos.nombre) && Objects.equals(codigo, cursos.codigo);
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
