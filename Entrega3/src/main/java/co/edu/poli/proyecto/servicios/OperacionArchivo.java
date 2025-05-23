package co.edu.poli.proyecto.servicios;

import java.io.*;
import java.util.*;

import co.edu.poli.proyecto.modelo.Publicacion;
import co.edu.poli.proyecto.modelo.Usuario;

/**
 * La interfaz {@code OperacionArchivo} define los métodos para manejar la
 * persistencia de datos mediante serialización y deserialización de objetos de tipo
 * {@link Publicacion} en archivos binarios.
 * 
 * <p>Esta interfaz puede ser implementada por clases que necesiten guardar
 * y recuperar colecciones de publicaciones desde el sistema de archivos.</p>
 * 
 * @author Jeronimo Rojas
 */
public interface OperacionArchivo {

	/**
     * Serializa un arreglo de publicaciones a un archivo binario en el disco.
     *
     * @param publicaciones Arreglo de objetos {@link Publicacion} a serializar.
     * @param path Ruta del directorio donde se almacenará el archivo (puede estar vacío).
     * @param name Nombre del archivo (por ejemplo, "archivo.bin").
     * @return Mensaje indicando el resultado de la operación (éxito o error).
     */
    public String serializar(Publicacion[] publicaciones, String path, String name);

    /**
     * Deserializa un archivo binario que contiene un arreglo de publicaciones.
     *
     * @param path Ruta del directorio donde se encuentra el archivo (puede estar vacío).
     * @param name Nombre del archivo (por ejemplo, "archivo.bin").
     * @return Arreglo de objetos {@link Publicacion} recuperados del archivo. Puede retornar {@code null}
     *         si ocurre un error durante el proceso.
     */
    public Publicacion[] deserializar(String path, String name);

}