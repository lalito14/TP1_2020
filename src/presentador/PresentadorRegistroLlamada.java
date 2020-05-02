/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import java.util.ArrayList;
import modelo.*;
import datos.*;
import javax.swing.JOptionPane;
import static modelo.Estados.*;

/**
 *
 * @author Eduardo
 */
public class PresentadorRegistroLlamada {
    
    private IRegistroLlamada vista;
    private PersistenciaLlamada perlla;
    private PersistenciaSintoma persin;
    private PersistenciaRecursos perrec;
    private Llamada llamada;
    
    
    public PresentadorRegistroLlamada(IRegistroLlamada vista){
        this.vista = vista;
        this.perlla = PersistenciaLlamada.obtenerPersistencia();
        this.persin = PersistenciaSintoma.obtenerPersistencia();
        this.perrec = PersistenciaRecursos.obtenerPersistencia();
        this.llamada = new Llamada();
    }
    
    public void cargarSintomas(){
        vista.cargarSintomas(persin.getSintoma());
    }
    
    public void agregarLlamada(int dni, String nya, String dom, int tel, int nv){   
        Recurso recurso = null;
        int bandera = 0;
        int cant = llamada.cantidadSintomas();
        try{
            switch(nv){
            case 1:
                for(Turno t : perrec.getTurno()){
                    if(t.getEstado().equals(activo)){
                        recurso = t;
                        recurso.setEstado(inactivo);
                        bandera = 1;
                        break;
                    }
                }
                break;
            case 2:
                for(Medico m : perrec.getMedico()){
                    if(m.getEstado().equals(activo)){
                        recurso = m;
                        recurso.setEstado(inactivo);
                        bandera = 1;
                        break;
                    }
                }
                break;
            case 3:
                for(Ambulancia a : perrec.getAmbulancia()){
                    if(a.getEstado().equals(activo)){
                        recurso = a;
                        recurso.setEstado(inactivo);
                        bandera = 1;
                        break;
                    }
                }
                break;   
            }
            Persona per = new Persona(dni, nya, dom, tel);
            Nivel niv = llamada.obtenerNivel();
            llamada.setFechaHora("2/5/2020 12:55");
            llamada.setRecurso(recurso);
            llamada.setPersona(per);
            llamada.setNivel(niv);
            llamada.setCantSintomas(cant);
            llamada.setId(perlla.getLlamada().size() + 1);
            perlla.agregarLlamada(llamada);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No existen recursos disponibles");
        }
    }
    
    public void agregarSintoma(String sintoma){
        Sintoma sin = persin.buscarSintoma(sintoma);
        try{
            llamada.asignarSintoma(sin);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor, agrege uno o varios sintomas");
        }
        finally{
            this.mostrarSintomas(sin);
        }
    }
    
    public void mostrarSintomas(Sintoma sin){
        vista.mostrarSintomas(llamada.getSintomas(), sin);
    }
}
