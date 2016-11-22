/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author IngridNiño
 */
public class ListaSimLigada<T>{
    private Nodo<T> inicio;
    public ListaSimLigada(){
        inicio=null;
    }

    public Nodo<T> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }
    
    public void inserta_inicio(T dato){
        Nodo<T> aux = new Nodo<T>(dato);
		aux.setSiguiente(inicio);
		inicio = aux;
    }
    public void inserta_final(T dato){
         Nodo <T> nuevo = new Nodo <T> (dato);
            if(inicio == null){
                inicio = nuevo;
            }else{
         Nodo <T> aux = inicio;
        while(aux.getSiguiente()!=null){
              aux = aux.getSiguiente();
        }
             aux.setSiguiente(nuevo);
    }
    }

    public void inserta_antes_de(T dato, T referencia){
        Nodo <T> nuevo = new Nodo <T> (dato);
       
        if(inicio.getSiguiente() == null){
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }else{
            Nodo <T> posActual = inicio ;
            Nodo <T> ant =null;
            while(posActual.getSiguiente()!= null && !posActual.getDato().equals(referencia)){
                ant = posActual;
                posActual = posActual.getSiguiente();
            }
            ant.setSiguiente(nuevo);
            nuevo.setSiguiente(posActual);
        }
    }
    public void inserta_despues_de(T dato, T referencia){
        Nodo <T> nuevo = new Nodo <T> (dato);
       
        if(inicio.getDato() == referencia){
            inicio.setSiguiente(nuevo); 
        }else{
            Nodo <T> posActual = inicio ;
            Nodo <T> desp =inicio.getSiguiente();
            while(posActual.getSiguiente()!= null && !posActual.getDato().equals(referencia)){
                posActual = posActual.getSiguiente();
                desp = posActual.getSiguiente();
            }
            posActual.setSiguiente(nuevo);
            nuevo.setSiguiente(desp);
        }
    }
    
    public T elimina_primero(){
        Nodo <T> aux = inicio;
        if (inicio == null){
           System.out.println ("Lista vacía.");
        }else{
            inicio = inicio.getSiguiente();
            aux.setSiguiente(null);  
        }
        return aux.getDato();

    }
    
    public T elimina_ultimo(){
        if (inicio == null){
            System.out.println ("Lista vacía.");
        } else 
        if (inicio.getSiguiente() == null){
            inicio = null;
            return inicio.getDato();
        }
        Nodo <T> aux = inicio;
        Nodo <T> aux2;
        while(aux.getSiguiente() != null){
            aux2 = inicio;
            aux = aux.getSiguiente();
            if (aux.getSiguiente() == null){
                aux2.setSiguiente(null);
            }
        }
        return aux.getDato();
    }
    
    public T elimina_elemento(T dato){
          Nodo aux=inicio;
        Nodo aux2 = null;
        Nodo aux3 = inicio.getSiguiente();
        boolean band=true;
        while(aux.getDato()!=dato && band==true){
            if(aux.getSiguiente()!=null){ 
                aux2 = aux;
                aux=aux.getSiguiente();
                aux3 = aux.getSiguiente();
            }else{
                band=false;
            }
        }
        if(band==false){
            System.out.println("El elemento con información"+dato+"no se encuentra en la lista");
            return null;
        }else if(inicio.getDato().equals(dato)){   
                inicio = inicio.getSiguiente();
                aux.setSiguiente(null);
                return(T) aux.getDato();
        } else{
                aux2.setSiguiente(aux3);
                aux.setSiguiente(null); 
                return(T)aux.getDato();
        }
    }
    
    public T elimina_antes(T dato){
        if(inicio!=null){
          if(inicio.getDato().equals(dato)){
              System.out.println("No se puede eliminar porque este es el primer elemento");
          }else if (inicio.getSiguiente().getDato().equals(dato)){
              Nodo aux = inicio;
              inicio =inicio.getSiguiente();
              aux.setSiguiente(null); 
          }else{
              Nodo posActual = inicio;
              Nodo ant = null;
              Nodo desp = inicio.getSiguiente();
              
              while(desp !=null && !desp.getDato().equals(dato)){
                  ant = posActual;
                  posActual = posActual.getSiguiente();
                  desp = posActual.getSiguiente();
              }
              ant.setSiguiente(desp);
              posActual.setSiguiente(null);
          }
        }
        return null;
    }
    
    public T busca_desordenado(T dato){
        Nodo aux=inicio;
        while(aux!=null && aux.getDato()!=dato){
            aux=aux.getSiguiente();
        }
        if(aux==null){
            System.out.println("El elemento no se encuentra en la lista");
            return null;
        }else {
            System.out.println("El elemento sí se encuentra en la lista");
            return (T) aux.getDato();
        }
    }
    
    public T busca_recursivo(Nodo<T> p,T dato){
        if(inicio!=null){
            if(inicio.getDato()==dato){
                System.out.println("El elemento se encuentra en la lista");
                System.out.println("|"+p.getDato()+"|");
            }else{
                busca_recursivo(inicio.getSiguiente(),dato);
            }
        }else
            System.out.println("El elemento no se encuentra en la lista");
        return null;
    }
    
    public T obtenDatoEnPosicion(Integer posicion){
         int i = 0;
         Nodo aux = inicio;
        while (aux != null && i<posicion) {
            aux = aux.getSiguiente();
            i++;
        }
        return  (T) aux.getDato();
    }
    
    private String y ="";
    public String recorreRecursivo(Nodo<T> p){  
        if(p!= null){
            y+= "|"+p.getDato()+ "| --->";
            recorreRecursivo(p.getSiguiente());
        }
        return y; 
    }
    
    public String recorreIterativo(){
        String s=" ";
        Nodo aux;
        aux=inicio;
        while(aux!=null){
            s+= "|"+aux.getDato() + "| --->\n";
            aux=aux.getSiguiente();
        }
        return s;
    }
    
    public void inserta_ordenado(T dato){
        Nodo <T> nuevo = new Nodo <T> (dato);
        if (inicio == null){
            inicio = nuevo;
        }else{
            Nodo aux = inicio;
            Nodo ant = null;
            while (aux != null && dato.equals(aux.getDato())){
                ant = aux;
                aux = aux.getSiguiente();
            }
            if(ant == null){
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
            }else{
                ant.setSiguiente(nuevo);
            }
        }
    }
    
    public int tamañoLista(){
        int cont=0;
        Nodo aux;
        aux=inicio;
        while(aux!=null){
            cont++;
            aux=aux.getSiguiente();
        }
        return cont;
    }
}
