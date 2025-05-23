package co.edu.poli.proyecto.modelo;

import java.io.*;
import java.util.*;

/**
 * La clase {@code Administrador} representa un tipo específico de {@link Usuario} 
 * que tiene la capacidad de gestionar fertilizantes y publicaciones dentro del sistema.
 * Implementa la interfaz {@link Serializable} para permitir la serialización de objetos.
 * 
 * <p>Contiene un arreglo de {@link Fertilizante} que representa los fertilizantes a su cargo.</p>
 * 
 * @author Jerónimo Rojas
 */
public class Administrador extends Usuario implements Serializable {

	/**
     * Arreglo de fertilizantes asociados al administrador.
     */
	private Fertilizante[ ] fertilizante;
 

    /**
     * Crea una nueva instancia de {@code Administrador} con los datos proporcionados.
     *
     * @param idusuario    ID único del usuario
     * @param nombre       Nombre del administrador
     * @param correo       Correo electrónico del administrador
     * @param contraseña   Contraseña del administrador
     * @param fertilizante Arreglo de fertilizantes asociados
     */
	public Administrador(int idusuario, String nombre, String correo, String contraseña, Fertilizante[] fertilizante) {
		super(idusuario, nombre, correo, contraseña);
		this.fertilizante = fertilizante;
	}


	 /**
     * Devuelve una representación en cadena del objeto {@code Administrador},
     * incluyendo los fertilizantes y la información del usuario base.
     *
     * @return Cadena representativa del objeto
     */
	@Override
	public String toString() {
		return "Administrador [fertilizante=" + Arrays.toString(fertilizante) + ", toString()=" + super.toString();
	}

	
	  /**
     * Obtiene el arreglo de fertilizantes asociados al administrador.
     *
     * @return Arreglo de objetos {@code Fertilizante}
     */
	public Fertilizante[] getFertilizante() {
		return fertilizante;
	}

	

    /**
     * Establece el arreglo de fertilizantes del administrador.
     *
     * @param fertilizante Arreglo de objetos {@code Fertilizante}
     */
	public void setFertilizante(Fertilizante[] fertilizante) {
		this.fertilizante = fertilizante;
	}
	
	 /**
     * Método destinado a gestionar publicaciones dentro del sistema.
     */
    public void gestionarPublicaciones() {
    }
    
    /**
     * Método destinado a gestionar fertilizantes en el sistema.
     */
    public void gestionarFertilizante() {
    }

}