/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package obli;

/**
 *
 * @author RC
 */
public class NodoCrucero{
	private int dato;
        private String nombre;
        private String ciudad;
        private int capacidad;
        private int estrellas;

    public NodoCrucero(int dato, String nombre, String ciudad, int capacidad, int estrellas) {
        this.dato = dato;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
        this.estrellas = estrellas;
        this.sig = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }
	private NodoCrucero sig;
        

    //Constructor
    public NodoCrucero(int n){
        this.dato=n;
        this.sig=null;
    }

    //Dato
    public void setDato(int d){
        this.dato=d;
    }
    public int getDato(){
        return this.dato;
    }

    //Siguiente
    public void setSig(NodoCrucero s){
        this.sig=s;
    }
    public NodoCrucero getSig(){
        return this.sig;
    }
}
