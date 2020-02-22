/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1compi;

import jdk.nashorn.internal.ir.Terminal;

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class NodoArbol {
private NodoArbol Padre;
private NodoArbol Derecha;
private NodoArbol Izquierda;
private String tipo;
private String Contenido ;


    public NodoArbol( NodoArbol Contenido, NodoArbol Izquierda, NodoArbol Derecha) {
        this.Derecha=Derecha;
        this.Izquierda=Izquierda;
        this.Contenido = Contenido.getContenido();
        this.tipo = Contenido.tipo;
    }

    public NodoArbol( String Contenido, String tipo) {

        this.Contenido = Contenido;
        this.tipo = tipo;
    }

    public NodoArbol() {
    }

    /**
     * @return the Padre
     */
    public NodoArbol getPadre() {
        return Padre;
    }

    /**
     * @param Padre the Padre to set
     */
    public void setPadre(NodoArbol Padre) {
        this.Padre = Padre;
    }

    /**
     * @return the Derecha
     */
    public NodoArbol getDerecha() {
        return Derecha;
    }

    /**
     * @param Derecha the Derecha to set
     */
    public void setDerecha(NodoArbol Derecha) {
        this.Derecha = Derecha;
    }

    /**
     * @return the Izquierda
     */
    public NodoArbol getIzquierda() {
        return Izquierda;
    }

    /**
     * @param Izquierda the Izquierda to set
     */
    public void setIzquierda(NodoArbol Izquierda) {
        this.Izquierda = Izquierda;
    }

    /**
     * @return the Contenido
     */
   
    /**
     * @return the tipo
     */
    public String getTipo() {
    
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the Contenido
     */
    public String getContenido() {
        return Contenido;
    }

    /**
     * @param Contenido the Contenido to set
     */
    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }
    
    
}