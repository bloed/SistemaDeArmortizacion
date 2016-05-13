package DTOs;

import java.util.Scanner;

public class DTOVistaModelo {
    //DTO que se usa para enviar de la vista al modelo
    private String nombreCliente;
    private Double montoPrestamo;
    private Integer periodosTotales;
    private Double interesAnual;
    private String sistemaArmotizacion;
    private String moneda;
    
    public DTOVistaModelo(String pNombreCliente, Double pMontoPrestamo, Integer pPeriodosTotales,
            Double pInteresAnual, String pSistemaArmotizacion, String pMoneda){
        nombreCliente = pNombreCliente;
        montoPrestamo = pMontoPrestamo;
        periodosTotales = pPeriodosTotales;
        interesAnual = pInteresAnual;
        sistemaArmotizacion = pSistemaArmotizacion;
        moneda = pMoneda;
    }


    public String getNombreCliente() {
        return nombreCliente;
    }
    public Double getMontoPrestamo() {
        return montoPrestamo;
    }
    public Integer getPeriodosTotales() {
        return periodosTotales;
    }
    public Double getInteresAnual() {
        return interesAnual;
    }
    public String getSistemaArmotizacion() {
        return sistemaArmotizacion;
    }
    public String getMoneda() {
        return moneda;
    }
}
