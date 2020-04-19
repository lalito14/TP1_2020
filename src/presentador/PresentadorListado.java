/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import datos.PersistenciaPersonas;
import vista.Listado;

/**
 *
 * @author Eduardo
 */
public class PresentadorListado {
    
    private IListado vista;
    private PersistenciaPersonas persistencia;
    public PresentadorListado(IListado vista){
        this.vista = vista;
        this.persistencia = new PersistenciaPersonas();
    }
   
    public void obtenerDatosPersona(){
    vista.mostrarDatosPersonas(persistencia.getPersonas());
}
}
