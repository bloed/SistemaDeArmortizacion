package Adaptador;

import DTOs.DTOAdaptadorPostHTTP;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class AdaptadorPostHTTP extends AdaptadorAbstracto {
    private HttpURLConnection conexion; 
    private String url;
    private String parametros;
    
    public AdaptadorPostHTTP(DTOAdaptadorPostHTTP dto){
        url = dto.getUrl();
        parametros = dto.getParametros();
    }

    @Override
    protected void realizarConexion() throws Exception {
        try{
            URL urlObjetivo = new URL(url);
            conexion = (HttpURLConnection)urlObjetivo.openConnection();
            conexion.setRequestMethod("POST");
            conexion.setRequestProperty("Content-Type", 
                "application/x-www-form-urlencoded");

            conexion.setRequestProperty("Content-Length", 
                Integer.toString(parametros.getBytes().length));
            conexion.setRequestProperty("Content-Language", "en-US");  

            conexion.setUseCaches(false);
            conexion.setDoOutput(true);
            mandarInformacion();
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
    
    protected void mandarInformacion() throws Exception{
        try{
            DataOutputStream escritor = new DataOutputStream (
            conexion.getOutputStream());
            escritor.writeBytes(parametros);
            escritor.close();
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
            cerrarConexion();
            throw e;
        }
    }
}
