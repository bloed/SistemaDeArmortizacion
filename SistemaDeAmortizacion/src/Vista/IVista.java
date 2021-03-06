package Vista;

import DTOs.DTOModeloVista;


public interface IVista {
    public abstract void mostrarError(String pError);
    public abstract void mostrarPantallaInicial();
    public abstract void mostrarPantallaFinal(DTOModeloVista dto);
    public abstract void enviarDatos();
    public abstract Boolean validarEntradaDatos();
}
