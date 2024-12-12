package es.ies.puerto;

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

    @Override
    String pensar()
    {
        return "Mañana tengo que corregir el examen";
    }
}
