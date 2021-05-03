/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kjbs1
 */
public class Bicola extends Cola {
   
    public Bicola (int tamano){
        super(tamano);
    }//Constructor
    
    public boolean insertarIni (TDA_Prioridad dato){
        //VERIFICA SI LLENA, VERIFICA SI ESTA VACIA Y SE VA A INSERTAR UN DATO, INSERTA NORMAL.
        if(estaColaLLenaINI()) return false;
        
        if(estaColaVacia()) ini = fin=0;
        else ini--;
        
        vector[ini] = dato;
        PrioridadBI(dato);
        
        return true;
    }
    
    private boolean estaColaLLenaINI(){
        return ini==0;
    }
    /////////////////////////////////////////////////////////////////////////////
    public void PrioridadBI(TDA_Prioridad dato) {
        TDA_Prioridad temp;
        for (int i = ini+1; i <= fin; i++) {
            if (dato.getNivel() <= vector[i].getNivel()) {
                temp = vector[i];
                vector[i] = dato;
                vector[i - 1] = temp;
            }
        }
    }
    /////////////////////////////////////////////////////////////////////////////
    
    public boolean eliminarFin(){
        //1.-SI ESTA VACIA, 2.-SI HAY UN ELEMENTO, 3.- ELIMINAR NORMAL POR FIN
        if(estaColaVacia()) return false;
        
        if(hayUnSoloDato())ini=fin=-1;
        else fin--;
        return true;
    }
    
}
