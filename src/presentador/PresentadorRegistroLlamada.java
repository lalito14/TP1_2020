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
    
    public void agregarPesonas(int dni, String nya, String domicilio, int telefono, int lvl){
        try{
            Persona np = new Persona(dni, nya, domicilio, telefono, lvl);
            this.perper.agregarPersona(np);
            vista.notificarPersonaAgregada();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor, llene los campos correctamente");
        }
        
    }
    
    public void agregarSintoma(String sin){
        int lvl = 0;
        try{
            Sintoma s = new Sintoma(sin);
            
            if(s.getDescripcion() == "Dificultad para respirar"){
                lvl = 3;
            }
            else if(s.getDescripcion() == "Fiebre" || s.getDescripcion() == "Nauseas o vomitos" ||
                    s.getDescripcion() == "Dolor de cabeza" || s.getDescripcion() == "Escalofrios"){
                lvl = 2;
            }
            else{
                lvl = 1;
            }
            this.persin.agregarSintoma(s);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor, agrege uno o varios sintomas");
        }
        finally{
            this.mostrarSintomas(lvl);
        }
    }
    
    public void mostrarSintomas(int lvl){
        vista.mostrarSintomas(persin.getSintomas(), lvl);
    }
}
