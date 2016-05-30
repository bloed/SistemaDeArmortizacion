package Controlador;

import DTOs.DTOBitacora;
import DTOs.DTOModeloVista;
import DTOs.DTOMoneda;
import DTOs.DTOSistemaAmortizacion;
import DTOs.DTOVistaModelo;
import Datos.Bitacora.BitacoraXML;
import Datos.Bitacora.Bitacora;
import Datos.Bitacora.BitacoraCSV;
import Factory.Factory;
import Modelo.Monedas.Moneda;
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
            Bitacora bitacoraXML = new BitacoraXML(new DTOBitacora("Bitacora.xml"));
            bitacoraXML.escribir(dto);
            Bitacora bitacoraCSV = new BitacoraCSV(new DTOBitacora("Bitacora.csv"));
            bitacoraCSV.escribir(dto);
        }
        catch(Exception e){
            throw e;
        }
    }
    public void crearSistemaArmotizacion(DTOVistaModelo dto){
        try{
            Moneda moneda = Factory.Crear(Datos.Constantes.CLASEMONEDA+dto.getMoneda(), new DTOMoneda(dto.getMontoPrestamo(),dto.getMoneda()));
            SistemaAmortizacion sistema = Factory.Crear(Datos.Constantes.CLASESISTEMA+dto.getSistemaArmotizacion(), 
                    new DTOSistemaAmortizacion(dto.getNombreCliente(), dto.getPeriodosTotales(), 
                            dto.getInteresAnual()/100, moneda, dto.getSistemaArmotizacion()));
            sistema.attach(this);
            sistema.calcularCuotas();
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
