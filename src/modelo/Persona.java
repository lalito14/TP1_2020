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
public class Persona {
    private int dni;
    private String nya;
    private int telefono;
    private String domicilio;
    
    public Persona() {
    }

    public Persona(int dni, String nya, String domicilio, int telefono) {
        this.dni = dni;
        this.nya = nya;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    public int getDni() {
        return dni;
    }

    public String getNya() {
        return nya;
    }

    public void setNya(String nya) {
        this.nya = nya;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    
}
