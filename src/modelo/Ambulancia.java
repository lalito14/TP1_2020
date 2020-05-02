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
    
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public Ambulancia(int id, Estados estado) {
        super(estado);
        this.id = id;
    }

    @Override
    public String mostrarDatos() {
        super.mostrarDatos();
        return "Ambulancia\n" + "\nNumero de ambulancia: " + this.getId();
    }
    
    
}
