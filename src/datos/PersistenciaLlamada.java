/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import modelo.Llamada;

/**
 *
 * @author Ian Lehmann
 */
public class PersistenciaLlamada implements IAccesoLlamada {
    private  ArrayList<Llamada> llamada;

    private static PersistenciaLlamada persistencia = new PersistenciaLlamada();
    
    
    public PersistenciaLlamada (){
        llamada = new ArrayList<>();
    }
    public static PersistenciaLlamada obtenerPersistencia(){
        return persistencia;
    }

    @Override
    public void agregarLlamada(Llamada nuevo) {
        this.llamada.add(nuevo);
    }

    @Override
    public ArrayList<Llamada> getLlamada() {
        return this.llamada;
    }
}
