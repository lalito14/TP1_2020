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
public class Sintoma {
    private String descripcion;
    private Nivel nivel;
    
    public Sintoma(String descripcion, Nivel nivel){
        this.descripcion = descripcion;
        this.nivel = nivel;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public String getDescripcion(){
        return descripcion;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }
    
    
    
}
