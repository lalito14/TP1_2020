/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

/**
 *
 * @author Eduardo
 */
public interface IRegistroLlamada {
    public void agregarPersona();
    public void notificarPersonaAgregada();
    public void notificarError(Exception e);
}
