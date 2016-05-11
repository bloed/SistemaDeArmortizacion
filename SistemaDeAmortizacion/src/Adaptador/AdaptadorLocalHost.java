package Adaptador;

import DTOs.DTOAdaptadorLocalHost;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class AdaptadorLocalHost extends AdaptadorAbstracto{

    private String hostname;
    private Integer port;
    private Socket socket;
    
    public AdaptadorLocalHost (DTOAdaptadorLocalHost dto) {
        hostname = dto.getHostName();
        port = dto.getPort();
    }

    @Override
    protected void realizarConexion() throws Exception{
        try {
            socket = new Socket(hostname,port);
        } 
        catch (Exception e){
            throw e;
        }
    }

    @Override
    protected String obtenerInformacion() throws Exception{
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            return reader.readLine();
        }
        catch (Exception e) {
            throw e;
        }
    }  

    @Override
    protected void cerrarConexion() throws Exception {
        try {
            socket.close();
        } 
        catch (Exception e){
            throw e;
        }
    }  
}
