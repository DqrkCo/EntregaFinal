package co.edu.poli.proyecto.modelo;

import java.io.*;
import java.util.*;

/**
 * La clase {@code FertilizanteQuimico} representa un tipo específico de {@link Fertilizante}
 * caracterizado por contener un porcentaje de componente químico.
 * 
 * <p>Hereda de la clase {@code Fertilizante} e implementa la interfaz {@link Serializable}
 * para permitir la serialización del objeto.</p>
 * 
 * <p>Esta clase permite modelar fertilizantes no orgánicos y almacenar el nivel de concentración química.</p>
 * 
 * @author Jerónimo Rojas
 */
public class FertilizanteQuimico extends Fertilizante implements Serializable{

	/**
     * Constructor que inicializa una instancia de {@code FertilizanteQuimico} con los datos proporcionados.
     *
     * @param idFertilizante     Identificador único del fertilizante
     * @param nombre             Nombre del fertilizante
     * @param tipofertIlizante   Tipo general del fertilizante (debería ser "químico" aquí)
     * @param fechacompra        Año de compra del fertilizante
     * @param proveedor          Proveedor del fertilizante
     * @param porcentajequimico  Porcentaje del componente químico
     */
    public FertilizanteQuimico(int idFertilizante, String nombre, String tipofertIlizante, int fechacompra,
			String proveedor, int porcentajequimico) {
		super(idFertilizante, nombre, tipofertIlizante, fechacompra, proveedor);
		this.porcentajequimico = porcentajequimico;
	}
    
    /**
     * Devuelve una representación en cadena del objeto {@code FertilizanteQuimico}.
     *
     * @return Cadena representativa del objeto
     */
    @Override
    public String toString() {
        return "FertilizanteQuimico [porcentajequimico=" + porcentajequimico + super.toString() + "]";
    }

    /**
     * Obtiene el porcentaje de químico en el fertilizante.
     *
     * @return Porcentaje químico
     */
    public int getPorcentajequimico() {
        return porcentajequimico;
    }

    /**
     * Establece el porcentaje de químico en el fertilizante.
     *
     * @param porcentajequimico Porcentaje químico
     */
    public void setPorcentajequimico(int porcentajequimico) {
        this.porcentajequimico = porcentajequimico;
    }

	/**
     * Porcentaje del componente químico presente en el fertilizante.
     */
    private int porcentajequimico;
    /**
     * Muestra la información detallada del fertilizante químico.
     */
    public void mostrarInformacion() {
        return;
    }

}