package Adaptador;

import DTOs.DTOAdaptadorGettHTTP;
import Datos.Constantes;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.w3c.dom.Document;


public class BCCRCambioDolar extends AdaptadorGetHTTP{

  public BCCRCambioDolar() throws UnsupportedEncodingException{
    super(new DTOAdaptadorGettHTTP(Constantes.URLBCCR, 
                                "tcIndicador=" + URLEncoder.encode("317", "UTF-8") +   
                                "&tcFechaInicio=" + URLEncoder.encode(Utilitario.Utilitario.obtenerFecha(), "UTF-8")+
                                "&tcFechaFinal=" + URLEncoder.encode(Utilitario.Utilitario.obtenerFecha(), "UTF-8")+
                                "&tcNombre=" + URLEncoder.encode("Josue Arrieta", "UTF-8")+
                                "&tnSubNiveles=" + URLEncoder.encode("No", "UTF-8")));
  }
  
  
  @Override
  public String realizarPeticion() throws Exception {
      
        realizarConexion();
        Document xml =  obtenerInformacion();
        cerrarConexion();
        return procesarXml(xml);
      
  }

  @Override
  protected String procesarXml(Document pXml) {
      return pXml.getElementsByTagName("NUM_VALOR").item(0).getChildNodes().item(0).getNodeValue();
  }
}
