package Validaciones;

import Datos.Constantes;

public class Validaciones {
    public Validaciones(){ } 
    
    public static void esInteger(String pInteger) throws Exception{
        try{
            Integer.parseInt(pInteger);
        }
        catch(Exception e){
            throw new Exception(pInteger + " con formato incorrecto, debe ser un entero.");
        }
    }
    public static void esDouble(String pDouble) throws Exception{
        try{
            Double.parseDouble(pDouble);
        }
        catch(Exception e){
            throw new Exception(pDouble + " con formato incorrecto, debe ser un flotante.");
        }
    }
    public static void validarMoneda(String pMoneda) throws Exception{
        if (!(pMoneda.equals(Constantes.COLON) || pMoneda.equals(Constantes.DOLAR))){
            throw new Exception("Moneda ingresada incorrecta.");
        }
    }
    public static void validarSistema(String pSistemaArmotizacion) throws Exception{
        if (!(pSistemaArmotizacion.equals(Constantes.ALEMAN) || 
                pSistemaArmotizacion.equals(Constantes.AMERICANO) ||
                    pSistemaArmotizacion.equals(Constantes.FRANCES))){
            throw new Exception("Sistema Armotizacion ingresado incorrecto.");
        }
    }
}
