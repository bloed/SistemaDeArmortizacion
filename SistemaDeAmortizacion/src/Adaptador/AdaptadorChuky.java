package Adaptador;

import DTOs.DTOAdaptadorLocalHost;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class AdaptadorChuky implements IAdaptador{
    //se usara para conectarse con el backend chuky
    private String hostname;
    private Integer port;
    private Socket socket; //creamos socket con java y conectamos socket externo
    
    public AdaptadorChuky(){
      hostname = "localhost";
      port = 8666;
    }
    


    private void realizarConexion() throws Exception{
        try {
            socket = new Socket(hostname,port);
        } 
        catch (Exception e){
            throw e;
        }
    }

    private String obtenerInformacion() throws Exception{
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            return reader.readLine();
        }
        catch (Exception e) {
            throw e;
        }
    }  

    private void cerrarConexion() throws Exception {
        try {
            socket.close();
        } 
        catch (Exception e){
            throw e;
        }
    }  

    @Override
    public String realizarPeticion() throws Exception {
        realizarConexion();
        String resultado =  obtenerInformacion();
        cerrarConexion();
        return resultado;
    }
}
