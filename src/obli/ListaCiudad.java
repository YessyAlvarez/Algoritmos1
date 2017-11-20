package obli;

public class ListaCiudad implements IListaCiudad {
    private NodoCiudad inicio;
    private int cantelementos;
    private int capacidad;

    public ListaCiudad() {
        this.inicio = null;
        this.cantelementos=0;
        this.capacidad = 0;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    //Constructor
    public void Lista(){
        this.inicio=null;
    }

    //Inicio
    public void setInicio(NodoCiudad i){
        inicio=i;
    }
    public NodoCiudad getInicio(){
        return inicio;
    }

    /*****Métodos Básicos*****/

    //PRE:
    //POS: Retorna true si la lista no tiene nodos
    public boolean esVacia(){
        if (this.inicio==null)
            return true;
        else
            return false;
      }
    public boolean buscarciudad(String Ciudad){
       NodoCiudad aux= this.inicio;
       boolean retorno= false;
         while (aux!=null){
             if (aux.getNombre()==Ciudad)
                  retorno =true;
             
             aux=aux.getSig();
         }
        return retorno;
    }

    //PRE: 
    //POS: Agrega un nuevo Nodo al principio de la lista
    public Retorno.Resultado agregarInicio(String ciudad){
       //implementar el metodo
       
       if (cantelementos<capacidad || capacidad==0){
           if (!this.buscarciudad(ciudad)){
               NodoCiudad nuevo = new NodoCiudad(ciudad);
               nuevo.setSig(this.inicio);
               this.inicio=nuevo;
               this.cantelementos=this.cantelementos+1;
               
               this.mostrar(); // sacar este listado no va es una chanchada
               
               return Retorno.Resultado.OK;
           }
           else 
               return Retorno.Resultado.ERROR_1;
       }else
           return Retorno.Resultado.ERROR_2;
       
       
       
    }   
    
    //PRE:
    //POS: Recorre y muestra los datos de lista
    public void mostrar(){
    // implementar el metodo
    NodoCiudad aux = this.inicio;
    while (aux!=null){
        System.out.print(aux.getNombre() + "  - ");
        aux=aux.getSig();
    }
        
}

    @Override
    public void borrarInicio() {
        if (!this.esVacia())
        this.inicio=this.inicio.getSig();
    }
    
}