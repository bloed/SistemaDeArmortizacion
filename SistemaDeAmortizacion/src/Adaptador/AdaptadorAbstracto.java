package Adaptador;


public abstract class AdaptadorAbstracto {

    
    public AdaptadorAbstracto ( ) { }
    //por aahora no se usa
    public String realizarPeticion() throws Exception{
        realizarConexion();
        String resultado =  obtenerInformacion();
        cerrarConexion();
        return resultado;
    }
    
    protected abstract void realizarConexion () throws Exception;
    protected abstract String obtenerInformacion() throws Exception;
    protected abstract void cerrarConexion() throws Exception;
}
