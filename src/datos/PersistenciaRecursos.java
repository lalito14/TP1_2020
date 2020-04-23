/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import modelo.*;

/**
 *
 * @author Mauro
 */
public class PersistenciaRecursos {
    private ArrayList<Recurso> recursos; //almacena recursos en memoria en tiempo de ejecucion

    private static PersistenciaRecursos persistencia = new PersistenciaRecursos();
    
    public PersistenciaRecursos(){
      recursos = new ArrayList<>();
    }
    
    public static PersistenciaRecursos obtenerPersistencia(){
        return persistencia;
    }

    public void agregarRecurso(Recurso nuevo) {
        this.recursos.add(nuevo);
    }

    public ArrayList<Recurso> getRecurso() {
        return this.recursos;
    }
    

}

