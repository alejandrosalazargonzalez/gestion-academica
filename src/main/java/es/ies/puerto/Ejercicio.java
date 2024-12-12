package es.ies.puerto;

public class Ejercicio {
    static Persona persona;
    public static void main(String[] args) {
        persona = new Estudiante("Pepe","soyId",20,"matricula");
        System.out.println(persona.saludar());
    }
}
