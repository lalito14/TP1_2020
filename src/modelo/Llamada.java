/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Eduardo
 */
public class Llamada {
    private int id;
    private String fechaHora;
    private Recurso recurso;
    private ArrayList<Sintoma> sintomas = new ArrayList<>();
    private Persona persona;
    private Nivel nivel;
    private int CantSintomas;
    
    public Llamada(){
        
    }

    public Llamada(String fechaHora, Recurso recurso, Persona persona, Nivel nivel, int CantSintomas) {
        this.fechaHora = fechaHora;
        this.recurso = recurso;
        this.persona = persona;
        this.nivel = nivel;
        this.CantSintomas = CantSintomas;
    }
 
    

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }
    
    public void asignarSintoma(Sintoma nuevo){
        int b = 0;
        for(Sintoma s : this.getSintomas()){
            if(s.equals(nuevo)){
                b = 1;
            }
        }
        if(b==0){
            sintomas.add(nuevo);
        }
    }

    public ArrayList<Sintoma> getSintomas() {
        return this.sintomas;
    }

    public int getCantSintomas() {
        return CantSintomas;
    }

    public void setCantSintomas(int CantSintomas) {
        this.CantSintomas = CantSintomas;
    }
    
    public int cantidadSintomas(){
        return sintomas.size();
    }
    
    public Nivel obtenerNivel(){
        int alto=0;
        Nivel max = null;
        for(Sintoma s : this.getSintomas()){
            if(s.getNivel().getNivel() > alto){
                alto = s.getNivel().getNivel();
                max = s.getNivel();
            }
        }        
        return max;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
