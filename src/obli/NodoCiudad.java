/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package obli;

public class NodoCiudad{
	private int dato;
        private String nombre;
	private NodoCiudad sig;
        private ListaCrucero LC;

    public NodoCiudad(String nombre) {
        this.nombre = nombre;
        this.LC = new ListaCrucero();
        this.sig = null;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Constructor
    public NodoCiudad(int n){
        this.dato=n;
        this.sig=null;
    }

    //Siguiente
    public void setSig(NodoCiudad s){
        this.sig=s;
    }
    public NodoCiudad getSig(){
        return this.sig;
    }
}
