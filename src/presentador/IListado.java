/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import java.util.ArrayList;
import modelo.Llamada;
import modelo.Sintoma;

/**
 *
 * @author Eduardo
 */
public interface IListado {
    public void mostrarDatosLlamada(ArrayList<Llamada> llamada);
    public void listarSintomas(ArrayList<Sintoma> sintomas);

    
}
