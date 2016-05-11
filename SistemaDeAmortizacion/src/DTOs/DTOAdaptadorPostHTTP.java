package DTOs;


public class DTOAdaptadorPostHTTP {
    private String url;
    private String parametros;
    
    public DTOAdaptadorPostHTTP (String pUrl, String pParametros){
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
