package sistemadeamortizacion;

import Adaptador.AdaptadorPython;
import DTOs.DTOAdaptador;

public class Main {

    
    public static void main(String[] args) {
        AdaptadorPython adaptador = new AdaptadorPython(new DTOAdaptador("localhost",8666));
        try{
            System.out.println(adaptador.leerSocket());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
