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
public abstract class Recurso {
    private boolean estado;

    public Recurso(){
        
    }
    public Recurso(boolean estado) {
        this.estado = estado;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
