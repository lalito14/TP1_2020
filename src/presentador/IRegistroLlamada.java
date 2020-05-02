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
public interface IRegistroLlamada {
    public void agregarPersona();
    public void notificarPersonaAgregada();
    public void notificarError(Exception e);
    public void mostrarSintomas(ArrayList<Sintoma> sintoma, Sintoma sin);
    public void agregarSintoma();
    public void cargarSintomas(ArrayList<Sintoma> sintoma);
}
