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
public class PersistenciaPersonas implements IAccesoPersonas{
    private  ArrayList<Persona> personas;

    private static PersistenciaPersonas persistencia = new PersistenciaPersonas();
    
    
    public PersistenciaPersonas (){
        personas = new ArrayList<>();
    }
    public static PersistenciaPersonas obtenerPersistencia(){
        return persistencia;
    }

    @Override
    public void agregarPersona(Persona nuevo) {
        this.personas.add(nuevo);
    }

    @Override
    public ArrayList<Persona> getPersonas() {
        return this.personas;
    }

    
}
