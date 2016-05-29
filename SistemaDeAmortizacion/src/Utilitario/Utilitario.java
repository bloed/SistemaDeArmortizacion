package Utilitario;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Utilitario {
    public static String obtenerFecha(){
        DateFormat dateFormat = new SimpleDateFormat("d/M/yyy");
        Date date = new Date();
        return dateFormat.format(date); //2014/08/06 15:59:48
  }
    public static double truncate(double numero){
        return Math.floor(numero * 100) / 100; //pone un numero a 2 decimales
    }
}
