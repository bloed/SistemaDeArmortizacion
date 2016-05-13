package DTOs;

public class DTOAdaptadorLocalHost {
    //dto para constructor de la clase AdaptadorLocalHost
    private String hostname;
    private Integer port;
    
    public DTOAdaptadorLocalHost(String pHostname, Integer pPort){
        hostname = pHostname;
        port = pPort;
    }
    public String getHostName(){
        return hostname;
    }
    public Integer getPort(){
        return port;
    }
}
