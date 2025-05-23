package co.edu.poli.proyecto.modelo;

import java.io.*;
import java.util.*;

/**
 * La clase {@code FertilizanteOrganico} representa un tipo especializado de {@link Fertilizante}
 * que incluye información adicional sobre el tipo de fertilizante orgánico.
 * 
 * <p>Hereda de {@code Fertilizante} e implementa la interfaz {@link Serializable}
 * para permitir la serialización de sus instancias.</p>
 * 
 * <p>Esta clase está pensada para modelar fertilizantes de origen orgánico,
 * diferenciándolos de los fertilizantes químicos u otros tipos.</p>
 * 
 * @author Jerónimo Rojas
 */
public class FertilizanteOrganico extends Fertilizante implements Serializable{
	
	/**
     * Constructor que inicializa un objeto {@code FertilizanteOrganico} con los datos heredados 
     * y el tipo específico de fertilizante orgánico.
     *
     * @param idFertilizante     Identificador único del fertilizante
     * @param nombre             Nombre del fertilizante
     * @param tipofertIlizante   Tipo general del fertilizante (debería ser "orgánico" aquí)
     * @param fechacompra        Año de compra del fertilizante
     * @param proveedor          Proveedor del fertilizante
     * @param tipoorganico       Tipo específico del fertilizante orgánico
     */
    public FertilizanteOrganico(int idFertilizante, String nombre, String tipofertIlizante, int fechacompra,
			String proveedor, String tipoorganico) {
		super(idFertilizante, nombre, tipofertIlizante, fechacompra, proveedor);
		this.tipoorganico = tipoorganico;
	}
    
    /**
     * Devuelve una representación en cadena del objeto {@code FertilizanteOrganico}.
     *
     * @return Cadena representativa del objeto
     */
	@Override
	public String toString() {
		return "FertilizanteOrganico [tipoorganico=" + tipoorganico + super.toString() + "]";
	}

	/**
     * Obtiene el tipo específico del fertilizante orgánico.
     *
     * @return Tipo del fertilizante orgánico
     */
    public String getTipoorganico() {
        return tipoorganico;
    }

    /**
     * Establece el tipo específico del fertilizante orgánico.
     *
     * @param tipoorganico Tipo del fertilizante orgánico
     */
    public void setTipoorganico(String tipoorganico) {
        this.tipoorganico = tipoorganico;
    }


	/**
     * Tipo específico de fertilizante orgánico (por ejemplo: compost, humus, estiércol, etc.).
     */
    private String tipoorganico;

    /**
     * Muestra la información detallada del fertilizante orgánico.
     */
    public void mostrarInformacion() {
        // TODO implement here
        return;
    }

}