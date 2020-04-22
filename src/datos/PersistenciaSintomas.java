/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import modelo.Sintoma;

/**
 *
 * @author Ian Lehmann
 */
public class PersistenciaSintomas {
    private ArrayList<Sintoma> sintoma; //almacena personas en memoria en tiempo de ejecucion

    public PersistenciaSintomas(){
      sintoma = new ArrayList<>();
    }
    
    public void agregarSintoma(Sintoma nuevo){
        this.sintoma.add(nuevo);
    }
    public ArrayList<Sintoma> getSintomas(){
        return this.sintoma;
    }
}
