/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kjbs1
 */
public class TDA_Prioridad {
    private char dato;
    private int nivel;
    
    public TDA_Prioridad (char d,int n){
        dato = d;
        nivel = n;
    }
    /*CONSTRUCTOR*/  

    public TDA_Prioridad(){
    }
///////////////////////////////////////////////////////////////////////////////////////////       

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
 ///////////////////////////////////////////////////////////////////////////////////////   
    @Override
    public String toString(){
        return "Dato: "+dato+", Prioridad: "+nivel;
    }
}
