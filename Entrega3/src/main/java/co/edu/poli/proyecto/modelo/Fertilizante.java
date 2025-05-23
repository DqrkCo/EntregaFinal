package co.edu.poli.proyecto.modelo;

import java.io.*;
import java.util.*;

/**
 * La clase {@code Fertilizante} representa un producto agrícola utilizado para mejorar
 * la fertilidad del suelo. Esta clase almacena información relevante sobre el fertilizante,
 * como su identificador, nombre, tipo, fecha de compra y proveedor.
 * 
 * <p>Implementa la interfaz {@link Serializable} para permitir la serialización
 * del objeto, lo cual es útil para almacenamiento persistente o transmisión.</p>
 * 
 * @author Jerónimo Rojas
 */
public class Fertilizante implements Serializable{
	
	/**
     * Constructor que inicializa un objeto {@code Fertilizante} con los datos proporcionados.
     *
     * @param idFertilizante     Identificador único del fertilizante
     * @param nombre             Nombre del fertilizante
     * @param tipofertIlizante   Tipo de fertilizante (orgánico, químico, etc.)
     * @param fechacompra        Año de compra del fertilizante
     * @param proveedor          Nombre del proveedor del fertilizante
     */

    public Fertilizante(int idFertilizante, String nombre, String tipofertIlizante, int fechacompra, String proveedor) {
		super();
		this.idFertilizante = idFertilizante;
		this.nombre = nombre;
		this.tipofertIlizante = tipofertIlizante;
		this.fechacompra = fechacompra;
		this.proveedor = proveedor;
	}
    
    /**
     * Identificador único del fertilizante.
     */
    private int idFertilizante;
    
    /**
     * Nombre del fertilizante.
     */
    private String nombre;

    /**
     * Tipo de fertilizante (orgánico, químico, etc.).
     */
    private String tipofertIlizante;

    /**
     * Año de compra del fertilizante.
     */
    private int fechacompra;

    /**
     * Proveedor del fertilizante.
     */
    private String proveedor;
    
    public int getIdFertilizante() {
        return idFertilizante;
    }

    public void setIdFertilizante(int idFertilizante) {
        this.idFertilizante = idFertilizante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipofertIlizante() {
        return tipofertIlizante;
    }

    public void setTipofertIlizante(String tipofertIlizante) {
        this.tipofertIlizante = tipofertIlizante;
    }

    public int getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(int fechacompra) {
        this.fechacompra = fechacompra;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    /**
     * Muestra por consola o interfaz la información del fertilizante.
     */
    public void mostrarInformacion() {
        // TODO implement here
        return;
    }

}