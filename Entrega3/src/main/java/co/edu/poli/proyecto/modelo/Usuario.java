package co.edu.poli.proyecto.modelo;

import java.io.*;
import java.util.*;

/**
 * La clase {@code Usuario} representa un usuario genérico del sistema, como un administrador o agricultor.
 * 
 * <p>Contiene información personal básica y métodos para simular el inicio y cierre de sesión.</p>
 * 
 * <p>Esta clase implementa la interfaz {@link Serializable}, lo que permite la serialización de los objetos
 * para almacenamiento o transmisión.</p>
 * 
 * <p>Es utilizada como clase base para otras clases como {@code Administrador} y {@code Agricultor}.</p>
 * 
 * @author Jeronimo Rojas
 */
public class Usuario implements Serializable{

	/**
     * Constructor que inicializa una nueva instancia de {@code Usuario}.
     *
     * @param idusuario    Identificador del usuario
     * @param nombre       Nombre del usuario
     * @param correo       Correo electrónico del usuario
     * @param contrasenia  Contraseña del usuario
     */
    public Usuario(int idusuario, String nombre, String correo, String contrasenia) {
		super();
		this.idUsuario = idusuario;
		this.nombre = nombre;
		this.correo = correo;
		this.contrasenia = contrasenia;
	}
    
    /**
     * Devuelve una representación en cadena del objeto {@code Usuario}.
     *
     * @return Cadena representativa del usuario
     */
    @Override
    public String toString() {
        return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", correo=" + correo 
             + ", contraseña=" + contrasenia + "]";
    }

    // Getters y Setters

    /**
     * Devuelve el identificador del usuario.
     *
     * @return id del usuario
     */
    public int getIdusuario() {
        return idUsuario;
    }

    /**
     * Establece el identificador del usuario.
     *
     * @param idusuario id del usuario
     */
    public void setIdusuario(int idusuario) {
        this.idUsuario = idusuario;
    }

    /**
     * Devuelve el nombre del usuario.
     *
     * @return nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param nombre nombre del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el correo electrónico del usuario.
     *
     * @return correo electrónico
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del usuario.
     *
     * @param correo correo electrónico
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Devuelve la contraseña del usuario.
     *
     * @return contraseña
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Establece la contraseña del usuario.
     *
     * @param contrasenia contraseña
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * Identificador único del usuario.
     */
    private int idUsuario;

    /**
     * Nombre del usuario.
     */
    private String nombre;

    /**
     * Dirección de correo electrónico del usuario.
     */
    private String correo;

    /**
     * Contraseña del usuario.
     */
    private String contrasenia;

    /**
     * Simula el inicio de sesión del usuario.
     */
    public void iniciarSesion() {
        return;
    }

    /**
     * Simula el cierre de sesión del usuario.
     */
    public void cerrarSesion() {
        return;
    }

}