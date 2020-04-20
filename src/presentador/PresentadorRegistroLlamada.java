/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import java.util.ArrayList;
import modelo.Persona;
import datos.PersistenciaPersonas;

/**
 *
 * @author Eduardo
 */
public class PresentadorRegistroLlamada {
    
    private IRegistroLlamada vista;
    private PersistenciaPersonas persistencia;
    
    public PresentadorRegistroLlamada(IRegistroLlamada vista){
        this.vista = vista;
        this.persistencia = new PersistenciaPersonas();
    }
    
    public void agregarPesonas(int dni, String nya, String domicilio, int telefono){
        try{
            Persona nuevo = new Persona(dni, nya, domicilio, telefono);
            this.persistencia.agregarPersona(nuevo);
            vista.notificarPersonaAgregada();
        }catch(Exception e){
            vista.notificarError(e);
        }
        
    }
}
