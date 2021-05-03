/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kjbs1
 */
public class Cola {
    protected TDA_Prioridad[] vector;
    protected int ini;
    protected int fin;
    
    /*
    Constructoorrrr
    */
    public Cola(int tamano){
        vector = new TDA_Prioridad[tamano];
        ini = -1; 
        fin= -1;
    }
    
    //INSERTA EN COLA UN DATO AL FINAL DE LA DISPONIBILIDAD DEL VECTOR
    public boolean insertar (TDA_Prioridad dato){
        if(estaColaLlena()){
            return false;
        }
        fin++;
        vector[fin]=dato;
        
        if(ini==-1){
            ini=0;
        }//INCREMENTA CUANDO COLA VACIA
        if (fin >= 1) Prioridad(dato);
        
        
        return true;
    }
    
    ////////////////////////////////////////////////////////////////////////////////
    
    public void Prioridad(TDA_Prioridad dato) {
        TDA_Prioridad temp; int T1, T2;
        for (int i = fin - 1; i >= ini; i--) {
            if (dato.getNivel() > vector[i].getNivel()) {
                temp = vector[i];
                vector[i] = dato;
                vector[i + 1] = temp;
            }
        }
    }
    ///////////////////////////////////////////////////////////////////////////////
    
    /*EVALUA SI COLA ESTA LLENA REGRESA UN TRUE. REGRESA FALSE SI NO ESTA LLENA*/
    public boolean estaColaLlena(){
        return fin == vector.length-1;
    }
    
    public boolean eliminar(){
        if(estaColaVacia())return false;
        
        if(hayUnSoloDato()){
            ini =-1;
            fin =-1;
            return true;
        }
        ini++;
        return true;
    }
    
    protected boolean estaColaVacia(){
        return ini == -1 && fin == -1;
    }
    
    protected boolean hayUnSoloDato(){
        return ini == fin;
    }
    
    public TDA_Prioridad getValor(int pos){
        return vector[pos];
    }
    public int getIni(){
        return ini;
    }
    public int getFin(){
        return fin;
    }
    
}
