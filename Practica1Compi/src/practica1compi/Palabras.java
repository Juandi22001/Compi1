/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1compi;

import org.omg.PortableServer.IdAssignmentPolicy;

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class Palabras {

    public enum Tipo {
        LLaveAbierta,
        LlaveCerrada,
        Digito,
        Letra,
        ComentarioDeLinea,
        Comentario,
        Concatenacion,
        OR,
        Interroga,
        Asterisco,
        Mas,
        DosPuntos,
        Conjunto,
        PuntoyComa,
        Id,
        Comillas,
        Flecha,
        Coma,
         Vocales,
        Otras,
        Abecedario,
        Operaciones,
        Expresion,
        Punto,
        FinComentario,
        ConjuntoT,
        Intervalo
    }

    private String Lexema;
    private Tipo tipo;
    private String Valor;
    private String Anteior;
    private String Siguiente;
    private int Indice;
    private boolean Anu;

    public Palabras(String Lexema, Tipo tipo) {
        this.Lexema = Lexema;
        this.tipo = tipo;
    }

    public Palabras() {
    }

    /**
     * @return the Lexema
     */
    public String getLexema() {
        return Lexema;
    }

    /**
     * @param Lexema the Lexema to set
     */
    public void setLexema(String Lexema) {
        this.Lexema = Lexema;
    }

    /**
     * @return the tipo
     */
    public String getTipo() 
    {
    switch(tipo){
        case Coma:
            return "coma";
            
        case Digito:
            return "Digitos";
        case Letra:
            return " Token ID";
        case ComentarioDeLinea:
            return "Comentario de linea";
        case Comentario:
            return "Comentario Multilinea";
        case Concatenacion:
            return "Concatenacion";
        case OR:
            return " OR     |";
        case Interroga:
            return "Interroga";
            
        case Intervalo:
            return "~ ";
        case Asterisco:
            return "*";
        case Mas:
            return "+";
        case DosPuntos:
            return "Dos puntos";
        case Conjunto:
            return "Conjunto";
        case PuntoyComa:
            return "Ppunto Y coma";
        case Flecha:
            return "Flecha C->";
        case Id:
            return "Pvariable";
        case Otras:
            return "Palabra Reservada Otras";
        case Abecedario:
            return "Palabra Reservada Abecedario";
      case Operaciones:
            return "Palabra Reservada Operaciones";
              case Expresion:
            return "Palabra Reservada Expresion";
              case Comillas :
                  
                  return "Comillas";
                       case FinComentario:
                  
                  return "Fin de Comentario";
           
                    
              case Punto:
                  return  "Punto";
                          
              case ConjuntoT:
                  return  "Conjunto de Terminales";
                
              case LLaveAbierta:
                  return "Llava Abierta";
              case LlaveCerrada:
                  return "Llava Cerrada";
                      
        
        default:
         return "Desconocido";
    }
    }
    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the Valor
     */
    public String getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(String Valor) {
        this.Valor = Valor;
    }

    /**
     * @return the Anteior
     */
    public String getAnteior() {
        return Anteior;
    }

    /**
     * @param Anteior the Anteior to set
     */
    public void setAnteior(String Anteior) {
        this.Anteior = Anteior;
    }

    /**
     * @return the Siguiente
     */
    public String getSiguiente() {
        return Siguiente;
    }

    /**
     * @param Siguiente the Siguiente to set
     */
    public void setSiguiente(String Siguiente) {
        this.Siguiente = Siguiente;
    }

    /**
     * @return the Indice
     */
    public int getIndice() {
        return Indice;
    }

    /**
     * @param Indice the Indice to set
     */
    public void setIndice(int Indice) {
        this.Indice = Indice;
    }

    /**
     * @return the Anu
     */
    public boolean isAnu() {
        return Anu;
    }

    /**
     * @param Anu the Anu to set
     */
    public void setAnu(boolean Anu) {
        this.Anu = Anu;
    }

}
