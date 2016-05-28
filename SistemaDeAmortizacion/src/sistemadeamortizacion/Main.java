package sistemadeamortizacion;


import Adaptador.AdaptadorChuky;
import Adaptador.BCCRCambioDolar;
import Adaptador.IAdaptador;
import DTOs.DTOAdaptadorGettHTTP;
import DTOs.DTOAdaptadorLocalHost;
import DTOs.DTOBitacora;
import DTOs.DTOCliente;
import DTOs.DTOMoneda;
import DTOs.DTOSistemaAmortizacion;
import DTOs.DTOVistaModelo;
import Datos.Bitacora.Bitacora;
import Datos.Bitacora.BitacoraCSV;
import Datos.Bitacora.BitacoraXML;
import Datos.Constantes;
import Factory.Factory;
import Modelo.Clientes.Cliente;
import Modelo.Monedas.Colon;
import Modelo.Monedas.Moneda;
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
    private static String obtenerFecha(){
      DateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
      Date date = new Date();
      return dateFormat.format(date); 
    }
}
