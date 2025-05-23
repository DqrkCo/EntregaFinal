package co.edu.poli.proyecto.modelo;

import java.io.*;

import java.util.*;
/**
 * La clase {@code Agricultor} representa un tipo de usuario que interactúa con el sistema
 * para ver fertilizantes y comentar publicaciones. Hereda de la clase {@link Usuario}
 * e implementa la interfaz {@link Serializable}, permitiendo su serialización.
 * 
 * <p>Esta clase está diseñada para que los agricultores accedan a información sobre 
 * fertilizantes y participen en las publicaciones.</p>
 * 
 * @author Jerónimo Rojas
 */
public class Agricultor extends Usuario implements Serializable{

 
	/**
     * Constructor que inicializa una instancia de {@code Agricultor} con los atributos del usuario base.
     *
     * @param idusuario  ID único del usuario
     * @param nombre     Nombre del agricultor
     * @param correo     Correo electrónico del agricultor
     * @param contraseña Contraseña del agricultor
     */
    public Agricultor(int idusuario, String nombre, String correo, String contraseña) {
		super(idusuario, nombre, correo, contraseña);
	}
    

    /**
     * Permite al agricultor comentar en una publicación.
     * Método pendiente de implementación.
     */
	public void comentarPublicacion() {
        // TODO implement here
    }

	 /**
     * Permite al agricultor visualizar los fertilizantes disponibles en el sistema.
     * Método pendiente de implementación.
     */
    public void verFertilizantes() {
        // TODO implement here
    }

}