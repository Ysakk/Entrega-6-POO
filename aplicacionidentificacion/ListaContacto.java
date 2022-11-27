package id.aplicacionidentificacion;
import java.util.*;
/**
 *
 * @author Isaac
 */
public class ListaContacto {
    public Vector lista;
    
    public ListaContacto() {
        lista = new Vector();
    }
    
    public void agregarContacto (Contacto a) {
        lista.add(a);
    }
    
    public String[][] obtenerMatriz() {
        String datos[][] = new String [lista.size()][3];
        for (int i=0; i<lista.size();i++){
            Contacto a = (Contacto)lista.elementAt(i);
            datos[i][0] = a.getidentificación();
            datos[i][1] = a.getNombre();
            datos[i][2] = a.getapellido();
        }
    return datos;
    }
    
    public String convertirTexto() {
        String texto = "";
        for (int i =0;i<lista.size();i++){
            Contacto a =(Contacto)lista.elementAt(i);
            texto = texto + "Identificación = " + a.getidentificación() + "\n" + "Nombre = " +a.getNombre() + "\n" + "Apellidos = " + a.getapellido() + "\n------\n";
        }
    return texto;    
    }
}
