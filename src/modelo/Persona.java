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
    private String nombre;
    private String Apellido;
    private int telefono;
    private String domicilio;
    
    public Persona() {
    }

    public Persona(int dni, String nombre, String Apellido, int telefono, String domicilio) {
        this.dni = dni;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
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
