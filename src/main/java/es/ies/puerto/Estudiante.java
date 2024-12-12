package es.ies.puerto;
import java.util.Objects;

public class Estudiante extends Persona {
    private String matricula;

    /**
     * Constructor vacio
     */
    public Estudiante(){
        super();
    }

    /**
     * Constructor completo
     * @param nombre
     * @param id
     * @param matricula
     */
    public Estudiante(String nombre, String id, int edad, String matricula) {
        super(id, nombre, edad);
        this.matricula = matricula;
    }


    public Estudiante(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Metodo que retorna estudiar
     * @return
     */
    public String estudiar()
    {
        return "Estoy estudiando";
    }

    @Override
    String pensar(){
        return "Tengo examen mañana";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Estudiante)) {
            return false;
        }
        Estudiante estudiante = (Estudiante) o;
        return Objects.equals(matricula, estudiante.matricula);
    }


    @Override
    public String toString() {
        return "{" +
            " matricula='" + getMatricula() + "'" +
            "}";
    }
    
}
