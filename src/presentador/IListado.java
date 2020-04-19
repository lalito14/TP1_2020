/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import java.util.ArrayList;
import modelo.Persona;
import modelo.Sintoma;

/**
 *
 * @author Eduardo
 */
public interface IListado {
    public void mostrarDatosPersonas(ArrayList<Persona> personas);
    public void listarSintomas(ArrayList<Sintoma> sintomas);

    
}
