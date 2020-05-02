/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import modelo.Nivel;
import modelo.Sintoma;

/**
 *
 * @author Ian Lehmann
 */
public interface IAccesoSintoma {
    public void agregarSintoma(Sintoma nuevo);
    public ArrayList<Sintoma> getSintoma();
    public Sintoma buscarSintoma(String sin);
    public void crearSintoma(String descripcion, int nivel);
    public void agregarNivel(Nivel nuevo);
    public ArrayList<Nivel> getNivel();
    public Nivel buscarNivel(int n);
}
