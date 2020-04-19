/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import jdk.nashorn.internal.codegen.CompilerConstants;
import modelo.Persona;

/**
 *
 * @author Eduardo
 */
public class PersistenciaPersonas {
    private ArrayList<Persona> personas; //almacena personas en memoria en tiempo de ejecucion
    
    private static PersistenciaPersonas p = new PersistenciaPersonas();

    public PersistenciaPersonas(){
      personas = new ArrayList<>();
    }
    
    public static PersistenciaPersonas getPersistenciaPersonas(){
        return p;
    }
    
    public void agregarPersona(Persona nuevo) {
        this.personas.add(nuevo);
    }
    public ArrayList<Persona> getPersonas(){
        return this.getPersonas();
    }
}
