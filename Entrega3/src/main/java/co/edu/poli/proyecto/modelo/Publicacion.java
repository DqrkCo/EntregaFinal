package co.edu.poli.proyecto.modelo;

import java.io.*;
import java.util.*;
/**
 * La clase {@code Publicacion} representa una entrada o contenido publicado por un usuario en el sistema.
 * 
 * <p>Contiene información como el identificador de la publicación, el contenido textual,
 * la fecha de publicación y el autor (de tipo {@link Usuario}).</p>
 * 
 * <p>Implementa {@link Serializable} para permitir la serialización del objeto, 
 * útil para almacenamiento o transmisión.</p>
 * 
 * @author Jerónimo Rojas
 */
public class Publicacion implements Serializable{

	/**
     * Constructor que inicializa todos los atributos de la clase {@code Publicacion}.
     *
     * @param idpublicacion     Identificador único de la publicación
     * @param contenido         Texto de la publicación
     * @param fechapublicacion  Año de publicación
     * @param autor             Usuario autor de la publicación
     */
    public Publicacion(String idpublicacion, String contenido, int fechapublicacion, Usuario autor) {
		super();
		this.idPublicacion = idpublicacion;
		this.contenido = contenido;
		this.fechaPublicacion = fechapublicacion;
		this.autor = autor;
	}
    

    /**
     * Devuelve una representación en forma de cadena de la publicación.
     *
     * @return Cadena representativa del objeto {@code Publicacion}
     */
    @Override
    public String toString() {
        return "Publicacion [idPublicacion=" + idPublicacion + ", contenido=" + contenido + 
               ", fechaPublicacion=" + fechaPublicacion + ", autor=" + autor + super.toString() + "]";
    }

    // Getters y Setters

    /**
     * Devuelve el identificador de la publicación.
     *
     * @return id de la publicación
     */
    public String getIdpublicacion() {
        return idPublicacion;
    }

    /**
     * Establece el identificador de la publicación.
     *
     * @param idpublicacion id de la publicación
     */
    public void setIdpublicacion(String idpublicacion) {
        this.idPublicacion = idpublicacion;
    }

    /**
     * Devuelve el contenido de la publicación.
     *
     * @return contenido de la publicación
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Establece el contenido de la publicación.
     *
     * @param contenido texto del contenido
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * Devuelve la fecha de publicación.
     *
     * @return año de publicación
     */
    public int getFechapublicacion() {
        return fechaPublicacion;
    }

    /**
     * Establece la fecha de publicación.
     *
     * @param fechapublicacion año de publicación
     */
    public void setFechapublicacion(int fechapublicacion) {
        this.fechaPublicacion = fechapublicacion;
    }

    /**
     * Devuelve el autor de la publicación.
     *
     * @return autor de tipo {@code Usuario}
     */
    public Usuario getAutor() {
        return autor;
    }

    /**
     * Establece el autor de la publicación.
     *
     * @param autor usuario que creó la publicación
     */
    public void setAutor(Usuario autor) {
        this.autor = autor;
    }


	/**
     * Identificador único de la publicación.
     */
    private String idPublicacion;

    /**
     * Contenido textual de la publicación.
     */
    private String contenido;

    /**
     * Año en el que se realizó la publicación.
     */
    private int fechaPublicacion;

    /**
     * Autor que creó la publicación.
     */
    private Usuario autor;


    /**
     * Realiza una acción simulada de publicación.
     *
     * @return mensaje de confirmación
     */
    public String publicar() {
        return "Publicación realizada";
    }

    /**
     * Realiza una acción simulada de comentar en la publicación.
     *
     * @return mensaje de confirmación
     */
    public String comentar() {
        return "Comentario enviado";
    }

}
