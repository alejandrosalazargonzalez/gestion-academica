package es.ies.puerto;
import java.util.Objects;

public class Examen {
    private String fecha;

    public Examen() {
    }

    public Examen(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Examen fecha(String fecha) {
        setFecha(fecha);
        return this;
    }

    /**
     * cambia la fecha del examen
     * @param fecha
     * @return
     */
    public String actualizarrFecha(String fecha)
    {
        setFecha(fecha);
        return getFecha();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Examen)) {
            return false;
        }
        Examen examen = (Examen) o;
        return Objects.equals(fecha, examen.fecha);
    }

    @Override
    public String toString() {
        return "{" +
            " fecha='" + getFecha() + "'" +
            "}";
    }
    
}
