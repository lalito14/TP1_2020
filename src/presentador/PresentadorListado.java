package presentador;

import datos.PersistenciaLlamada;
import modelo.Llamada;
import vista.Listado;

public class PresentadorListado {
    
    private IListado vista;
    private PersistenciaLlamada perlla;
    public PresentadorListado(IListado vista){
        this.vista = vista;
        this.perlla = PersistenciaLlamada.obtenerPersistencia();
    }
    
    public String recurso(String id){
        int ID = Integer.parseInt(id);
        for(Llamada l : perlla.getLlamada()){
            if(l.getId()== ID){
                return l.getRecurso().mostrarDatos();
            }
        }
        return null;
    }
    
    public void mostrarDatosPersonas(){
    vista.mostrarDatosLlamada(perlla.getLlamada());
    }
}
