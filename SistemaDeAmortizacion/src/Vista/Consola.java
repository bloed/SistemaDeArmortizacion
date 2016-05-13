package Vista;

import DTOs.DTOModeloVista;
import java.util.Scanner;



public class Consola implements IVista{
    private String nombreCliente;
    private Double montoPrestamo;
    private Integer periodosTotales;
    private Double interesAnual;
    private String sistemaArmotizacion;
    private String moneda;
    Scanner scanner;
    
    public Consola(){
        nombreCliente = "";
        montoPrestamo = 0.0;
        periodosTotales = 0;
        interesAnual = 0.0;
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
        montoPrestamo = scanner.nextDouble();
        System.out.println("Ingresar el plazo del préstamo (en años): ");
        periodosTotales =  scanner.nextInt();
        System.out.println("Ingresar el internes anual :");
        interesAnual = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingresar el sistema de armotizacion deseado: ");
        sistemaArmotizacion = scanner.nextLine();
        System.out.println("Ingresar moneda deseada: ");
        moneda =  scanner.nextLine();
    }

    @Override
    public void mostrarPantallaFinal(DTOModeloVista dto) {
        System.out.println();
        System.out.println("Tipo de cambio compra BCCR: ");
        System.out.println("Datos de la consulta:");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Monto del préstamos otorgado: " + montoPrestamo.toString()
            + " de " + moneda);
        System.out.println("Plazo del préstamo: " + periodosTotales.toString() + " años");
        System.out.println("Interés anual: " + interesAnual.toString() + "%");
        System.out.println("Sistema de armotización: " + sistemaArmotizacion);
        System.out.println("");
        System.out.println("Tabla de Armotización");
        System.out.println("");
    }

    @Override
    public void enviarDatos() {
        //controlador.enviarVaras(dto)
    }
    
}
