/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import modelo.Recurso;

/**
 *
 * @author Eduardo
 */
public interface IAccesoRecursos {
    public void agregarRecurso(Recurso nuevo);
    public ArrayList<Recurso> getRecurso();
}
