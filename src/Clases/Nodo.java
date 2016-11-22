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
public class Nodo<T>{
    public Nodo(){
		dato = null;
		siguiente = null;
	}
    public Nodo(T dato){
		this.dato = dato;
		siguiente = null;
        }
    
	private T dato;
	private Nodo<T> siguiente;
        
	public T getDato() {
		return dato;
	}
	public void setDato(T dato) {
		this.dato = dato;
	}
	public Nodo<T> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}
	public String toString(){
		return "["+dato+"]";
	}
}
