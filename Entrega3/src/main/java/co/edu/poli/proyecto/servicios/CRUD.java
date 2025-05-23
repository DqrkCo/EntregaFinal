package co.edu.poli.proyecto.servicios;

import co.edu.poli.proyecto.modelo.Publicacion;
import co.edu.poli.proyecto.modelo.Usuario;

import java.io.*;
import java.util.*;

/**
 * La interfaz {@code CRUD} define el contrato para las operaciones básicas de
 * persistencia y gestión de objetos del tipo {@link Publicacion}.
 *
 * <p>Este contrato incluye métodos para crear, leer, actualizar y eliminar
 * publicaciones, así como para obtener todas las publicaciones existentes.</p>
 *
 * <p>Es implementada por clases que definen la lógica de almacenamiento, ya sea
 * en memoria, archivos o bases de datos.</p>
 * 
 * @author Jerónimo Rojas
 */
public interface CRUD {

	/**
     * Crea una nueva publicación en el sistema.
     *
     * @param pub1 La instancia de {@code Publicacion} que se desea agregar.
     * @return Un mensaje indicando el resultado de la operación.
     */
    public String create(Publicacion pub1);

    /**
     * Busca y devuelve una publicación por su identificador único.
     *
     * @param idPub El ID de la publicación a buscar.
     * @return La publicación encontrada, o {@code null} si no existe.
     */
    public Publicacion read(String idPub);

    /**
     * Devuelve todas las publicaciones registradas en el sistema.
     *
     * @return Un arreglo de objetos {@code Publicacion} con todas las publicaciones.
     */
    public Publicacion[] readAll();

    /**
     * Actualiza los datos de una publicación existente.
     *
     * @param idPub El ID de la publicación que se desea actualizar.
     * @param modificador La nueva información que reemplazará a la actual.
     * @return Un mensaje indicando el resultado de la operación.
     */
    public String update(String idPub, Publicacion modificador);

    /**
     * Elimina una publicación del sistema.
     *
     * @param idPub El ID de la publicación a eliminar.
     * @return La publicación eliminada, o {@code null} si no se encontró.
     */
    public Publicacion delete(String idPub);

}