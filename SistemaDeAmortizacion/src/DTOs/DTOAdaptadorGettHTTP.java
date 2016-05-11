package DTOs;


public class DTOAdaptadorGettHTTP {
    private String url;
    private String parametros;
    
    public DTOAdaptadorGettHTTP (String pUrl, String pParametros){
        url = pUrl;
        parametros = pParametros;
    }
    
    public String getUrl(){
        return url;
    }
    public String getParametros(){
        return parametros;
    }
}
