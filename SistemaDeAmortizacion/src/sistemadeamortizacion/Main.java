package sistemadeamortizacion;

import Adaptador.AdaptadorAbstracto;
import Adaptador.AdaptadorLocalHost;
import Adaptador.AdaptadorPostHTTP;
import DTOs.DTOAdaptadorLocalHost;
import DTOs.DTOAdaptadorPostHTTP;
import java.net.URLEncoder;

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
                
        String URL = "http://indicadoreseconomicos.bccr.fi.cr/indicadoreseconomicos/WebServices/wsindicadoreseconomicos.asmx/ObtenerIndicadoresEconomicos";
        
        AdaptadorAbstracto adaptador2 = new AdaptadorPostHTTP(new DTOAdaptadorPostHTTP(URL,urlParameters));
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
    
        
    }
        
        
    

    
}
