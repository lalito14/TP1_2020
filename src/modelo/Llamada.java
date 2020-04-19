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
    private String fechaHora;
    private Recurso recurso;
    private Nivel nivel;
    private ArrayList<Sintoma> sintomas;
    private Persona persona;
    
    public Llamada(){
        
    }

    public Llamada(String fechaHora, Recurso recurso, Nivel nivel, ArrayList<Sintoma> sintomas, Persona persona) {
        this.fechaHora = fechaHora;
        this.recurso = recurso;
        this.nivel = nivel;
        this.sintomas = sintomas;
        this.persona = persona;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public ArrayList<Sintoma> getSintomas() {
        return sintomas;
    }

    public void setSintomas(ArrayList<Sintoma> sintomas) {
        this.sintomas = sintomas;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    
}
