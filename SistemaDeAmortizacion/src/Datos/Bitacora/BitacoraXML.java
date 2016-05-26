package Datos.Bitacora;

import DTOs.DTOBitacora;
import DTOs.DTOCuota;
import DTOs.DTOModeloVista;
import Modelo.Cuotas.Cuota;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

public class BitacoraXML extends Bitacora{
  private Document documento;
  private File archivo;

  public BitacoraXML(DTOBitacora dto) throws Exception {
    super(dto);
    this.archivo = new File(path);
    try {
      this.documento = abrirDocumento();
    } catch (Exception e) {
      this.documento = crearDocumento();
      crearElementoRaiz("Bitacora");
    }
  }
  
  private Document abrirDocumento() throws ParserConfigurationException, SAXException, IOException{
    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = dbFactory.newDocumentBuilder();
    return builder.parse(archivo);
  }
  
  private Document crearDocumento() throws ParserConfigurationException{
    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
    return dBuilder.newDocument();
  }
  
  private Element crearElementoRaiz(String nombre){
    Element elementoRaiz = documento.createElement(nombre);
    documento.appendChild(elementoRaiz);
    return elementoRaiz;
  }
  
  private Element obtenerElementoRaiz(){
    return documento.getDocumentElement();
  }
  
  private void agregarNuevoHijoAElemento(String nombreHijo, String valor, Element padre){
    Element nuevoElemento = documento.createElement(nombreHijo);
    nuevoElemento.appendChild(documento.createTextNode(valor));
    padre.appendChild(nuevoElemento);
  }
  
  private void agregarHijoAElemento(Element padre, Element hijo){
    padre.appendChild(hijo);
  }
  
  private void escribirDocumentoXML() throws TransformerConfigurationException, TransformerException{
    StreamResult result = new StreamResult(new File(path));
    TransformerFactory tf = TransformerFactory.newInstance();
    Transformer transformer = tf.newTransformer();
    transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
    transformer.setOutputProperty(OutputKeys.METHOD, "xml");
    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
    transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
    transformer.transform(new DOMSource(documento), result);
  }
  
  
  @Override
  public void escribir(DTOModeloVista dto)
  {
    try {
      Element raiz =  obtenerElementoRaiz();
      Element nuevaAmortizacion = documento.createElement("Amortizacion");
      Element listaCuotas = documento.createElement("Cuotas");
      Element nuevaCuota;
      DTOCuota dtoCuota;
      agregarNuevoHijoAElemento("Cliente", dto.getNombreCliente(), nuevaAmortizacion);
      agregarNuevoHijoAElemento("Sistema", dto.getNombreCliente(), nuevaAmortizacion);
      agregarNuevoHijoAElemento("Deuda", dto.getDeuda().toString(), nuevaAmortizacion);
      agregarNuevoHijoAElemento("Plazo", String.valueOf(dto.getPlazoPrestamo()), nuevaAmortizacion);
      agregarNuevoHijoAElemento("Interes", String.valueOf(dto.getInteres()), nuevaAmortizacion);
      agregarNuevoHijoAElemento("TipoCambio", String.valueOf(dto.getTipoCambio()), nuevaAmortizacion);
      agregarNuevoHijoAElemento("Fecha", String.valueOf(dto.getFechaChucky()), nuevaAmortizacion);
      for (Cuota cuota : dto.getCuotas()) {
        dtoCuota = cuota.getDTO();
        nuevaCuota = documento.createElement("Cuota");
        agregarNuevoHijoAElemento("Deuda", String.valueOf(cuota.getDeuda()), nuevaCuota);
        agregarNuevoHijoAElemento("Pago", String.valueOf(cuota.getPago()), nuevaCuota);
        agregarNuevoHijoAElemento("Amortizacion", String.valueOf(cuota.getAmortizacion()), nuevaCuota);
        agregarNuevoHijoAElemento("Interes", String.valueOf(cuota.getInteres()), nuevaCuota);
        agregarHijoAElemento(listaCuotas, nuevaCuota);
      }
      agregarHijoAElemento(nuevaAmortizacion, listaCuotas);
      agregarHijoAElemento(raiz, nuevaAmortizacion);
      escribirDocumentoXML();
    } catch (TransformerException ex) {
      System.err.println(ex.getMessage());
    }
  }
}
