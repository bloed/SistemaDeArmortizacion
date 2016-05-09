package DTOs;

public class DTOAdaptador {
    private String hostname;
    private Integer port;
    
    public DTOAdaptador(String pHostname, Integer pPort){
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
