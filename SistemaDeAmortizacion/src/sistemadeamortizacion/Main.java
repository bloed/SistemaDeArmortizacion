package sistemadeamortizacion;


import Adaptador.AdaptadorLocalHost;
import Adaptador.BCCRCambioDolar;
import Adaptador.IAdaptador;
import DTOs.DTOAdaptadorGettHTTP;
import DTOs.DTOAdaptadorLocalHost;
import Vista.Consola;
import Vista.GUI;
import Vista.IVista;
import java.net.URLEncoder;
import java.util.Scanner;




public class Main {

    
    public static void main(String[] args) throws Exception {
        /*IAdaptador adaptador = new AdaptadorLocalHost(new DTOAdaptadorLocalHost("localhost",8666));
        try{
            System.out.println(adaptador.realizarPeticion());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        String urlParameters = "tcIndicador=" + URLEncoder.encode("318", "UTF-8") +   
                                "&tcFechaInicio=" + URLEncoder.encode("10/5/2016", "UTF-8")+
                                "&tcFechaFinal=" + URLEncoder.encode("10/5/2016", "UTF-8")+
                                "&tcNombre=" + URLEncoder.encode("Josue Arrieta", "UTF-8")+
                                "&tnSubNiveles=" + URLEncoder.encode("No", "UTF-8");
                
        String URL = "http://indicadoreseconomicos.bccr.fi.cr/indicadoreseconomicos/WebServices/wsindicadoreseconomicos.asmx/ObtenerIndicadoresEconomicos?";
        
        IAdaptador adaptador2 = new BCCRCambioDolar(new DTOAdaptadorGettHTTP(URL,urlParameters));
        String resultado = "";
        try{
            resultado = adaptador2.realizarPeticion();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
               
        System.out.println(resultado);
        
        IVista vista = new Consola();
        
        vista.mostrarPantallaInicial();
        vista.validarEntradaDatos();
        vista.mostrarPantallaFinal(null);*/
        
        Boolean control = true;
        Scanner scanner = new Scanner(System.in);
        String opcionElegida;
        IVista vista;
        while (control){
            imprimirMenuPrincipal();
            opcionElegida = scanner.nextLine();
            if (opcionElegida.equals("1")){
                vista = new Consola();
                vista.mostrarPantallaInicial();
            }
            else if (opcionElegida.equals("2")){
                vista = new GUI();
                vista.mostrarPantallaInicial();
            }
            else if (opcionElegida.equals("3")){
                System.out.println("Bye Bye");
                control = false;
            }
            else{
                System.out.println("Opción incorrecta.");
            }
        }
    }
    public static void imprimirMenuPrincipal(){
        System.out.println("Sistema de Armotizacion");
        System.out.println("1. Consola");
        System.out.println("2. GUI");
        System.out.println("3. Salir");
    }
        
        
    

    
}
