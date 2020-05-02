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
public class PersistenciaSintoma implements IAccesoSintoma{
    private  ArrayList<Sintoma> sintoma = new ArrayList<>();
    private  ArrayList<Nivel> nivel = new ArrayList<>();

    private static PersistenciaSintoma persistencia = new PersistenciaSintoma();
    
    
    public PersistenciaSintoma (){
        Nivel n1 = new Nivel(1);
        Nivel n2 = new Nivel(2);
        Nivel n3 = new Nivel(3);
        nivel.add(n1);
        nivel.add(n2);
        nivel.add(n3);
        sintoma.add(new Sintoma("Tos seca", n1));
        sintoma.add(new Sintoma("Dolor muscular o en articulaciones", n1));
        sintoma.add(new Sintoma("Dolor de garganta", n1));
        sintoma.add(new Sintoma("Fatiga", n1));
        sintoma.add(new Sintoma("Fiebre", n2));
        sintoma.add(new Sintoma("Nauseas o vomitos", n2));
        sintoma.add(new Sintoma("Dolor de cabeza", n2));
        sintoma.add(new Sintoma("Escalofrios", n2));
        sintoma.add(new Sintoma("Dificultad para respirar", n3));
    }
    public static PersistenciaSintoma obtenerPersistencia(){
        return persistencia;
    }

    @Override
    public void agregarSintoma(Sintoma nuevo) {
        this.sintoma.add(nuevo);
    }

    @Override
    public ArrayList<Sintoma> getSintoma() {
        return this.sintoma;
    }

    @Override
    public Sintoma buscarSintoma(String sin) {
        for(Sintoma s : sintoma){
            if(s.getDescripcion().equals(sin)){
                return s;
            }
        }
        return null;
    }

    @Override
    public void crearSintoma(String descripcion, int nivel) {
        
    }

    @Override
    public void agregarNivel(Nivel nuevo) {
        this.nivel.add(nuevo);
    }

    @Override
    public ArrayList<Nivel> getNivel() {
        return this.nivel;
    }

    @Override
    public Nivel buscarNivel(int niv) {
        for(Nivel n : nivel){
            if(n.getNivel() == niv){
                return n;
            }
        }
        return null;
    }
    
}
