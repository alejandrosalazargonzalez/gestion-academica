package es.ies.puerto;
import java.util.Objects;

public class Profesor extends Persona {
    private String especialidad;

    /**
     * Constructor vacio
     */
    public Profesor(){

    }

    /**
     * Constructor completo
     * @param id
     * @param nombre
     * @param edad
     * @param especialidad
     */
    public Profesor(String id, String nombre, int edad, String especialidad){
        super(id,nombre,edad);
        this.especialidad = especialidad;
    }
    
    
    public Profesor(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public String getEspecialidad() {
        return this.especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Metodo que enseña 
     * @return
     */
    public String enseniar(){
        return "Soy profesor y enseño";
    }

    @Override
    String pensar()
    {
        return "Mañana tengo que corregir el examen";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Profesor)) {
            return false;
        }
        Profesor profesor = (Profesor) o;
        return Objects.equals(especialidad, profesor.especialidad);
    }

    @Override
    public String toString() {
        return "{" +
            " especialidad='" + getEspecialidad() + "'" +
            "}";
    }
    
}
