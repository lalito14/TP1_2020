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
    private Estados estado;
    
    public Recurso(){     
        
    }
    
    public Recurso(Estados estado) {
        this.estado = estado;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }
    
    public String mostrarDatos(){
        return null;
    }
    
}
