/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
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
        int a = 0;
        for(Sintoma s : sintoma){
            if(s.getDescripcion() == nuevo.getDescripcion()){
                a = 1;
            }
        }
        if(a == 0){
            this.sintoma.add(nuevo);
        }
        else{
            JOptionPane.showMessageDialog(null, "El sintoma ya fue agregado anteriormente");
        }
    }
    public ArrayList<Sintoma> getSintomas(){
        return this.sintoma;
    }
    public int cantidadSintomas(){
        int cant = sintoma.size();
        return cant;
    }
}
