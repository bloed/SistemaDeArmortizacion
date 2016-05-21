package Controlador;

import DTOs.DTOModeloVista;
import DTOs.DTOSistemaAmortizacion;
import DTOs.DTOVistaModelo;
import Datos.Bitacora;
import Datos.BitacoraXML;
import Modelo.Monedas.Colon;
import Modelo.Sistemas.Americano;
import Modelo.Sistemas.SistemaAmortizacion;
import Observer.IObserver;
import Vista.IVista;


public abstract class AbstractAmortizacionController implements IObserver{
    private IVista vista;
    
    public AbstractAmortizacionController(IVista pVista){
        vista = pVista;
    }
    protected void actualizarVista(DTOModeloVista dto){
        vista.mostrarPantallaFinal(dto);
    }
    protected void actualizarBitacora(DTOModeloVista dto){
        try{
            Bitacora bitacora = new BitacoraXML("Bitacora.xml");
            bitacora.escribir(dto);
        }
        catch(Exception e){
            vista.mostrarError(e.getMessage());
        }
    }
    public void crearSistemaArmotizacion(DTOVistaModelo dto){
        try{
            //nadadamas crear a todos
        }
        catch(Exception e){
            vista.mostrarError(e.getMessage());
        }
    }

    @Override
    public <T> void update(T dto) {
        DTOModeloVista dtoReal = (DTOModeloVista) dto;
        actualizarBitacora(dtoReal);
        actualizarVista(dtoReal);
    }
}
