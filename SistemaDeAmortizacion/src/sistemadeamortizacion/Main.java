package sistemadeamortizacion;


import Adaptador.AdaptadorLocalHost;
import Adaptador.BCCRCambioDolar;
import Adaptador.IAdaptador;
import DTOs.DTOAdaptadorGettHTTP;
import DTOs.DTOAdaptadorLocalHost;
import DTOs.DTOSistemaAmortizacion;
import DTOs.DTOVistaModelo;
import Datos.Bitacora.Bitacora;
import Datos.Bitacora.BitacoraCSV;
import Datos.Bitacora.BitacoraXML;
import Datos.Constantes;
import Factory.Factory;
import Modelo.Monedas.Colon;
import Modelo.Sistemas.Aleman;
import Modelo.Sistemas.Americano;
import Modelo.Sistemas.Frances;
import Modelo.Sistemas.SistemaAmortizacion;
import Vista.Consola;
import Vista.GUI;
import Vista.IVista;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;




public class Main {

    
    public static void main(String[] args) throws Exception {
      SistemaAmortizacion s = new Americano(new DTOSistemaAmortizacion("Fernando", 5, 0.15, new Colon(1000000), "Aleman"));
      Bitacora b = new BitacoraCSV("C:\\Users\\fm010\\Documents\\Bitacora.csv");
      b.escribir(s.obtenerDTO());
        /*
        IAdaptador adaptador2 = new BCCRCambioDolar();
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
        vista.mostrarPantallaFinal(null);
        
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
        }*/
    }
    public static void imprimirMenuPrincipal(){
        System.out.println("Sistema de Armotizacion");
        System.out.println("1. Consola");
        System.out.println("2. GUI");
        System.out.println("3. Salir");
    }
    private static String obtenerFecha(){
      DateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
      Date date = new Date();
      return dateFormat.format(date); //2014/08/06 15:59:48
    }
}
