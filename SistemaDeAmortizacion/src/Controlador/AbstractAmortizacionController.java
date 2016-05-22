package Controlador;

import DTOs.DTOModeloVista;
import DTOs.DTOSistemaAmortizacion;
import DTOs.DTOVistaModelo;
import Datos.Bitacora.BitacoraXML;
import Datos.Bitacora.Bitacora;
import Datos.Bitacora.BitacoraCSV;
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
    protected void actualizarBitacora(DTOModeloVista dto) throws Exception{
        try{
            Bitacora bitacoraXML = new BitacoraXML("Bitacora.xml");
            bitacoraXML.escribir(dto);
            Bitacora bitacoraCSV = new BitacoraCSV("Bitacora.csv");
            bitacoraCSV.escribir(dto);
        }
        catch(Exception e){
            throw e;
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
        try{
            DTOModeloVista dtoReal = (DTOModeloVista) dto;
            actualizarBitacora(dtoReal);
            actualizarVista(dtoReal);
        }
        catch(Exception e){
            vista.mostrarError(e.getMessage());
        }
    }
}
