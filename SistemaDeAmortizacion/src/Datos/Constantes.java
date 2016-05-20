package Datos;

import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Constantes {
  public static String COLON = "colones";
  public static String DOLAR = "dolares";
  public static String ALEMAN = "aleman";
  public static String FRANCES = "frances";
  public static String AMERICANO = "americano";
  public static String CLASECLIENTE = "Modelo.Clientes.Persona";
  public static String CLASECOLON = "Modelo.Monedas.Colon";
  public static String CLASEDOLAR = "Modelo.Monedas.Dolar";
  public static String CLASEALEMAN = "Modelo.Sistemas.Aleman";
  public static String CLASEFRANCES = "Modelo.Sistemas.Frances";
  public static String CLASEAMERICANO = "Modelo.Sistemas.Americano";
  public static String URLBCCR = "http://indicadoreseconomicos.bccr.fi.cr/indicadoreseconomicos/WebServices/wsindicadoreseconomicos.asmx/ObtenerIndicadoresEconomicos?";
  
  private static String obtenerFecha(){
    DateFormat dateFormat = new SimpleDateFormat("d/M/yyy");
    Date date = new Date();
    return dateFormat.format(date); //2014/08/06 15:59:48
  }
}
