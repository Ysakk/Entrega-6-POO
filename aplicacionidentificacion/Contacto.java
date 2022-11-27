package id.aplicacionidentificacion;

/**
 *
 * @author Isaac
 */
public class Contacto {
    private String identificación;
    private String nombre;
    private String apellido;
    
    public Contacto (String identificación, String nombre, String apellido) {
        this.identificación = identificación;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String getidentificación() {
        return identificación;
    }
    public String getNombre() {
        return nombre;
    }
    
    public String getapellido() {
        return apellido;
    }
}
