package Vista;

import DTOs.DTOModeloVista;
import java.util.Scanner;
import Validaciones.Validaciones;


public class Consola implements IVista{
    private String nombreCliente;
    private String montoPrestamo;
    private String periodosTotales;
    private String interesAnual;
    private String sistemaArmotizacion;
    private String moneda;
    Scanner scanner;
    
    public Consola(){
        nombreCliente = "";
        montoPrestamo = "";
        periodosTotales = "";
        interesAnual = "";
        sistemaArmotizacion = "";
        moneda = "";
        scanner = new Scanner(System.in);
    }
    
    @Override
    public void mostrarError(String pError) {
        System.out.println("Error: " + pError);
    }

    @Override
    public void mostrarPantallaInicial() {
        System.out.println("Ingresar nombre del cliente: ");
        nombreCliente =  scanner.nextLine();
        System.out.println("Ingresar monto del prestamo otorgado: ");
        montoPrestamo = scanner.nextLine();
        System.out.println("Ingresar el plazo del préstamo (en años): ");
        periodosTotales =  scanner.nextLine();
        System.out.println("Ingresar el internes anual :");
        interesAnual = scanner.nextLine();
        System.out.println("Ingresar el sistema de armotizacion deseado: ");
        sistemaArmotizacion = scanner.nextLine().toLowerCase();
        System.out.println("Ingresar moneda deseada: ");
        moneda =  scanner.nextLine().toLowerCase();
    }

    @Override
    public void mostrarPantallaFinal(DTOModeloVista dto) {
        System.out.println();
        System.out.println("Tipo de cambio compra BCCR: ");
        System.out.println("Datos de la consulta:");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Monto del préstamos otorgado: " + montoPrestamo
            + " de " + moneda);
        System.out.println("Plazo del préstamo: " + periodosTotales + " años");
        System.out.println("Interés anual: " + interesAnual + "%");
        System.out.println("Sistema de armotización: " + sistemaArmotizacion);
        System.out.println("");
        System.out.println("Tabla de Armotización");
        System.out.println("");
    }

    @Override
    public void enviarDatos() {
        //controlador.enviarVaras(dto)
    }

    @Override
    public void validarEntradaDatos() throws Exception {
        try{
            Validaciones.esDouble(montoPrestamo);
            Validaciones.esDouble(interesAnual);
            Validaciones.esInteger(periodosTotales);
            Validaciones.validarMoneda(moneda);
            Validaciones.validarSistema(sistemaArmotizacion);
        }
        catch (Exception e){
            mostrarError(e.getMessage());
        }
    }
    
}
