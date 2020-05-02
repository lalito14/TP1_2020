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
public class Turno extends Recurso{
    private String fechaHora;
    private int telefono;

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Turno(String fechaHora, int telefono, Estados estado) {
        super(estado);
        this.fechaHora = fechaHora;
        this.telefono = telefono;
    }

    @Override
    public String mostrarDatos() {
        super.mostrarDatos();
        return "Turno\n" + "\nFecha del turno: " + this.getFechaHora() + "\n" + "Num de telefono: " + this.getTelefono();
    }
    
    
    
}
