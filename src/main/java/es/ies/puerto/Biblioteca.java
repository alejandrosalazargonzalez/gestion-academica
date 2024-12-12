package es.ies.puerto;

import java.util.List;
import java.util.Objects;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;


    public Biblioteca() {
    }

    public Biblioteca(String nombre, List<Libro> libros) {
        this.nombre = nombre;
        this.libros = libros;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return this.libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Registra un libro
     * @param libro
     * @return
     */
    public boolean registrarLibros(Libro libro)
    {
        if (libro == null) {
            return false;
        }
        libros.add(libro);
        return true;
    }

    /**
     * Lista los libros
     * @return
     */
    public String listarLibros()
    {
        return libros.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Biblioteca)) {
            return false;
        }
        Biblioteca biblioteca = (Biblioteca) o;
        return Objects.equals(nombre, biblioteca.nombre) && Objects.equals(libros, biblioteca.libros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, libros);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", libros='" + getLibros() + "'" +
            "}";
    }
    
}
