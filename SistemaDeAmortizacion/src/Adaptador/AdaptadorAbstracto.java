package Adaptador;

import DTOs.DTOAdaptador;
import java.net.Socket;


public abstract class AdaptadorAbstracto {
    protected String hostname;
    protected Integer port;
    protected Socket socket;
    
    public AdaptadorAbstracto (DTOAdaptador dto ) {
        hostname = dto.getHostName();
        port = dto.getPort();
    }
    public String leerSocket() throws Exception{
        realizarConexion();
        String resultado =  obtenerInformacion();
        cerrarConexion();
        return resultado;
    }
    
    protected abstract void realizarConexion () throws Exception;
    protected abstract String obtenerInformacion() throws Exception;
    protected abstract void cerrarConexion() throws Exception;
}
