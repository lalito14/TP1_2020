/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import java.util.ArrayList;
import modelo.Persona;
import datos.PersistenciaPersonas;
import datos.PersistenciaSintomas;
import javax.swing.JOptionPane;
import modelo.Sintoma;

/**
 *
 * @author Eduardo
 */
public class PresentadorRegistroLlamada {
    
    private IRegistroLlamada vista;
    private PersistenciaPersonas perper;
    private PersistenciaSintomas persin;
    
    public PresentadorRegistroLlamada(IRegistroLlamada vista){
        this.vista = vista;
        this.perper = new PersistenciaPersonas();
        this.persin = new PersistenciaSintomas();
    }
    
    public void agregarPesonas(int dni, String nya, String domicilio, int telefono){
        try{
            Persona np = new Persona(dni, nya, domicilio, telefono);
            this.perper.agregarPersona(np);
            vista.notificarPersonaAgregada();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor, llene los campos correctamente");
        }
        
    }
    
    public void agregarSintoma(String sin){
        try{
            Sintoma ns = new Sintoma(sin);
            this.persin.agregarSintoma(ns);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor, agrege uno o varios sintomas");
        }
        finally{
            this.mostrarSintomas();
        }
    }
    
    public void mostrarSintomas(){
        vista.mostrarSintomas(persin.getSintomas());
    }
}
