package Adaptador;

import DTOs.DTOAdaptadorGettHTTP;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class AdaptadorGetHTTP extends AdaptadorAbstracto {
    private HttpURLConnection conexion; 
    private String url;
    private String parametros;
    private String tipo;
    
    public AdaptadorGetHTTP(DTOAdaptadorGettHTTP dto){
        url = dto.getUrl();
        parametros = dto.getParametros();
        tipo = "GET";
    }

    @Override
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

    @Override
    protected String obtenerInformacion() throws Exception {
        try{
            InputStream stream = conexion.getInputStream();
            BufferedReader lector = new BufferedReader(new InputStreamReader(stream));
            String resultado = "";
            String line;
            while((line = lector.readLine()) != null) {
                resultado += line + "\n";
            }
            return resultado;
        }
        catch(Exception e){
            cerrarConexion();
            throw e;
        }
    }

    @Override
    protected void cerrarConexion() throws Exception {
        try{
            conexion.disconnect();
        }
        catch(Exception e){
            throw e;
        }
    }
}
