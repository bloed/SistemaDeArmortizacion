package sistemadeamortizacion;

import Adaptador.AdaptadorAbstracto;
import Adaptador.AdaptadorLocalHost;
import Adaptador.AdaptadorGetHTTP;
import DTOs.DTOAdaptadorLocalHost;
import DTOs.DTOAdaptadorGettHTTP;
import java.io.StringReader;
import java.net.URLEncoder;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import org.xml.sax.InputSource;




public class Main {

    
    public static void main(String[] args) throws Exception {
        AdaptadorAbstracto adaptador = new AdaptadorLocalHost(new DTOAdaptadorLocalHost("localhost",8666));
        try{
            System.out.println(adaptador.realizarPeticion());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        String urlParameters = "tcIndicador=" + URLEncoder.encode("318", "UTF-8") +   
                                "&tcFechaInicio=" + URLEncoder.encode("10/5/2016", "UTF-8")+
                                "&tcFechaFinal=" + URLEncoder.encode("10/5/2016", "UTF-8")+
                                "&tcNombre=" + URLEncoder.encode("Josue Arrieta", "UTF-8")+
                                "&tnSubNiveles=" + URLEncoder.encode("No", "UTF-8");
                
        String URL = "http://indicadoreseconomicos.bccr.fi.cr/indicadoreseconomicos/WebServices/wsindicadoreseconomicos.asmx/ObtenerIndicadoresEconomicos?";
        
        AdaptadorAbstracto adaptador2 = new AdaptadorGetHTTP(new DTOAdaptadorGettHTTP(URL,urlParameters));
        String resultado = "";
        try{
            resultado = adaptador2.realizarPeticion();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
        int i = resultado.indexOf("<NUM_VALOR>");
        i += 11;
        int j = resultado.indexOf("</NUM_VALOR>");
        String numero = resultado.substring(i, j);

        System.out.println(numero);
        
        /*String path = "/DataSet"
                + "/diffgr:diffgram"
                + "/Datos_de_INGC011_CAT_INDICADORECONOMIC"
                + "/INGC011_CAT_INDICADORECONOMIC"
                + "/DES_FECHA";

        
        XPathFactory xpathFactory = XPathFactory.newInstance();
        XPath xpath = xpathFactory.newXPath();

        InputSource source = new InputSource(new StringReader(resultado));
        String numero = xpath.evaluate(path, source);

        System.out.println("numero = " + numero);*/

        
        
    }
        
        
    

    
}
