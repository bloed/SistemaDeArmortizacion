package DTOs;


public class DTOAdaptadorGettHTTP {
    //dto para constructor de la clase AdaptadorGetHTTP
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
