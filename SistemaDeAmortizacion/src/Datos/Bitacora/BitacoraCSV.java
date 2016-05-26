package Datos.Bitacora;

import DTOs.DTOBitacora;
import DTOs.DTOModeloVista;
import Datos.Constantes;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BitacoraCSV extends Bitacora{
  private StringWriter escritor;

  public BitacoraCSV(DTOBitacora dto) {
    super(dto);
    this.escritor = new StringWriter();
  }
  
  private void escribirEncabezado(){
    escritor.append(Constantes.ENCABEZADOCSV);
    finalizarEntrada();
  }
  
  private void escribirDTO(DTOModeloVista dto){
    agregarCampo(dto.getNombreCliente());
    agregarCampo(dto.getTipoSistema());
    agregarCampo(dto.getDeuda().toString());
    agregarCampo(String.valueOf(dto.getPlazoPrestamo()));
    agregarCampo(String.valueOf(dto.getInteres()));
    agregarCampo(String.valueOf(dto.getTipoCambio()));
    agregarCampo(String.valueOf(dto.getFechaChucky()));
    finalizarEntrada();
  }
  
  private void agregarCampo(CharSequence string){
    escritor.append(string);
    escritor.append(';');
  }
  
  private void finalizarEntrada(){
    escritor.append("\n");
  }
  
  private boolean formatoAdecuado() throws FileNotFoundException, IOException{
    BufferedReader fr = new BufferedReader(new FileReader(path));
    String primeraLinea = fr.readLine();
    fr.close();
    return primeraLinea == null ? false : primeraLinea.equalsIgnoreCase((String) Constantes.ENCABEZADOCSV);
  }

  @Override
  public void escribir(DTOModeloVista dto) {
    try {
      boolean formatoAdecuado = formatoAdecuado();
      if(!formatoAdecuado){
        escribirEncabezado();
      }
      BufferedWriter fw = new BufferedWriter(new FileWriter(path, formatoAdecuado));
      escribirDTO(dto);
      fw.append(escritor.toString());
      fw.close();
    } catch (IOException ex) {
      System.err.println(ex.getMessage());
    }
  }
  
}
