/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Eduardo
 */
public class Nivel {
    private String descripcion;
    
    public Nivel(){
        
    }
    public Nivel(String descripcion){
        this.descripcion = descripcion;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
}
