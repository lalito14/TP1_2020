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
public class Medico extends Recurso{
    private String nombre;
    private String interno;
    
    public Medico(){
        
    }
    
    public Medico(String nombre, String interno){
        this.nombre = nombre;
        this.interno = interno;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setInterno(String interno){
        this.interno = interno;
    }
    
    public String getInterno(){
        return this.interno;
    }

    public Medico(String nombre, String interno, Estados estado) {
        super(estado);
        this.nombre = nombre;
        this.interno = interno;
    }
    
    
}
