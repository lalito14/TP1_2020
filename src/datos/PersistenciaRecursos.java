/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import modelo.*;
import static modelo.Estados.*;

/**
 *
 * @author Mauro
 */
public class PersistenciaRecursos {
    private ArrayList<Ambulancia> Ambulancia; //almacena recursos en memoria en tiempo de ejecucion
    private ArrayList<Medico> Medico;
    private ArrayList<Turno> Turno;

    private static PersistenciaRecursos persistencia = new PersistenciaRecursos();
    
    public PersistenciaRecursos(){
      Ambulancia = new ArrayList<>();
      Ambulancia a1 = new Ambulancia(27872, activo);
      Ambulancia a2 = new Ambulancia(36963, activo);
      this.agregarAmbulancia(a1);
      this.agregarAmbulancia(a2);
      
      Medico = new ArrayList<>();
      Medico m1 = new Medico("Dr. Mengeche", 6969, activo);
      Medico m2 = new Medico("Dr. Neme Toll", 1212, activo);
      this.agregarMedico(m1);
      this.agregarMedico(m2);
      
      Turno = new ArrayList<>();
      Turno t1 = new Turno("24/4 18:00", 386537040, activo);
      Turno t2 = new Turno("24/4 19:00", 386537040, activo);
      Turno t3 = new Turno("24/4 20:00", 386537040, activo);
      this.agregarTurno(t1);
      this.agregarTurno(t2);
      this.agregarTurno(t3);
      
    }
    
    public static PersistenciaRecursos obtenerPersistencia(){
        return persistencia;
    }

    public void agregarAmbulancia(Ambulancia nuevo) {
        this.Ambulancia.add(nuevo);
    }

    public ArrayList<Ambulancia> getAmbulancia() {
        return this.Ambulancia;
    }
    
    public void agregarMedico(Medico nuevo){
        this.Medico.add(nuevo);
    }
    
    public ArrayList<Medico> getMedico(){
        return this.Medico;
    }
    
    public void agregarTurno(Turno nuevo){
        this.Turno.add(nuevo);
    }
    
    public ArrayList<Turno> getTurno(){
        return this.Turno;
    }
}

