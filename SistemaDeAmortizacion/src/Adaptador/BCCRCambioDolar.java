package Adaptador;

import DTOs.DTOAdaptadorGettHTTP;
import Datos.Constantes;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.w3c.dom.Document;


public class BCCRCambioDolar extends AdaptadorGetHTTP{

  public BCCRCambioDolar() throws UnsupportedEncodingException{
    this(new DTOAdaptadorGettHTTP(Constantes.URLBCCR, 
                                "tcIndicador=" + URLEncoder.encode("318", "UTF-8") +   
                                "&tcFechaInicio=" + URLEncoder.encode(obtenerFecha(), "UTF-8")+
                                "&tcFechaFinal=" + URLEncoder.encode(obtenerFecha(), "UTF-8")+
                                "&tcNombre=" + URLEncoder.encode("Josue Arrieta", "UTF-8")+
                                "&tnSubNiveles=" + URLEncoder.encode("No", "UTF-8")));
  }
  
  protected BCCRCambioDolar(DTOAdaptadorGettHTTP dto) {
    super(dto);
  }
  private static String obtenerFecha(){
    DateFormat dateFormat = new SimpleDateFormat("d/M/yyy");
    Date date = new Date();
    return dateFormat.format(date); //2014/08/06 15:59:48
  }
    @Override
    public String realizarPeticion() throws Exception {
        realizarConexion();
        Document xml =  obtenerInformacion();
        cerrarConexion();
        return procesarXml(xml);
    }

    @Override
    public String procesarXml(Document pXml) {
        return pXml.getElementsByTagName("NUM_VALOR").item(0).getChildNodes().item(0).getNodeValue();
    }
}
