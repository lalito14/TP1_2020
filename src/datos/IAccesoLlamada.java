/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import modelo.Llamada;

/**
 *
 * @author Ian Lehmann
 */
public interface IAccesoLlamada {
    public void agregarLlamada(Llamada nuevo);
    public ArrayList<Llamada> getLlamada();
}
