/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import modelo.Persona;

/**
 *
 * @author Eduardo
 */
public interface IAccesoPersonas {
    public void agregarPersona(Persona nuevo);
    public ArrayList<Persona> getPersonas();
}
