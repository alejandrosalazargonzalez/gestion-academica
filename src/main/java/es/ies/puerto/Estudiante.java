package es.ies.puerto;

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
    public Estudiante(String nombre, String id, String matricula) {
        super(id, nombre);
        this.matricula = matricula;
    }
}
