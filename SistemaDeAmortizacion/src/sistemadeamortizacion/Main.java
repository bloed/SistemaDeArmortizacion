package sistemadeamortizacion;


import Adaptador.BCCRCambioDolar;
import Adaptador.IAdaptador;
import Vista.Consola;
import Vista.GUI;
import Vista.IVista;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;




public class Main {

    
    public static void main(String[] args) throws Exception {
        /*IAdaptador a = new BCCRCambioDolar();
        System.out.println(a.realizarPeticion());*/
        //Si sale no se puede instanciar, volver a intentar. Es problema con el BCCR
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
