package presentador;

import datos.PersistenciaPersonas;
import vista.Listado;

public class PresentadorListado {
    
    private IListado vista;
    private PersistenciaPersonas persistencia;
    public PresentadorListado(IListado vista){
        this.vista = vista;
        this.persistencia = PersistenciaPersonas.obtenerPersistencia();
    }
   
    public void mostrarDatosPersonas(){
    vista.mostrarDatosPersonas(persistencia.getPersonas());
    }
}
