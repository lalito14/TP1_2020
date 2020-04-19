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
public class Ambulancia extends Recurso{
    private int id;
    
    public Ambulancia(){
        
    }
    public Ambulancia(int id){
        this.id = id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
}
