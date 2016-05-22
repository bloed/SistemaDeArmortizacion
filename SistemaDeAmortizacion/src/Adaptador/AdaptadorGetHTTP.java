package Adaptador;

import DTOs.DTOAdaptadorGettHTTP;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

public abstract class AdaptadorGetHTTP implements IAdaptador {
    private HttpURLConnection conexion; 
    private String url;
    private String parametros;
    private String tipo;
    
    
    public AdaptadorGetHTTP(DTOAdaptadorGettHTTP dto){
        url = dto.getUrl();
        parametros = dto.getParametros();
        tipo = "GET";
    }

    protected void realizarConexion() throws Exception {
        try{
            URL urlObjetivo = new URL(url+parametros);
            conexion = (HttpURLConnection)urlObjetivo.openConnection();
            conexion.setRequestMethod(tipo);
            conexion.setRequestProperty("Content-Type", 
                "text/xml; charset=utf-8");

            conexion.setRequestProperty("Content-Length", 
                Integer.toString(parametros.getBytes().length));
            conexion.setRequestProperty("Content-Language", "en-US");  

            conexion.setUseCaches(false);
            conexion.setDoOutput(true);
        }
        catch(Exception e){
            throw e;
        }
    }

    protected Document obtenerInformacion() throws Exception {
        //devuelve un XML  ya que es el formato de datos del web service
        try{
            InputStream stream = conexion.getInputStream();

            DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
            DocumentBuilder constructorXML = fabrica.newDocumentBuilder();
            Document xml = constructorXML.parse(stream);
            return xml;
        }
        catch(Exception e){
            cerrarConexion();
            throw e;
        }
    }

    protected void cerrarConexion() throws Exception {
        try{
            conexion.disconnect();
        }
        catch(Exception e){
            throw e;
        }
    }

    protected abstract String procesarXml(Document pXml);
    //se implementa para cada subclase dependiendo de qué se requiere del XML
    
}
