package Adaptador;

import DTOs.DTOAdaptadorGettHTTP;
import org.w3c.dom.Document;


public class BCCRCambioDolar extends AdaptadorGetHTTP{

    public BCCRCambioDolar(DTOAdaptadorGettHTTP dto) {
        super(dto);
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
