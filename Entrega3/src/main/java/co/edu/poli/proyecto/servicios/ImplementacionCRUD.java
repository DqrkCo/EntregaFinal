package co.edu.poli.proyecto.servicios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import co.edu.poli.proyecto.modelo.Publicacion;
import co.edu.poli.proyecto.modelo.Usuario;

/**
 * La clase {@code ImplementacionCRUD} implementa las interfaces {@link CRUD} y {@link OperacionArchivo}
 * para gestionar operaciones básicas de persistencia sobre objetos {@link Publicacion}.
 *
 * <p>Utiliza un arreglo dinámico para almacenar las publicaciones y soporta operaciones de serialización
 * y deserialización en archivos binarios.</p>
 * 
 * <p>Es utilizada en el controlador de la interfaz para manipular publicaciones en memoria.</p>
 * 
 * @author Jerónimo Rojas
 */
public class ImplementacionCRUD implements CRUD, OperacionArchivo {
	
	/**
     * Arreglo que almacena las publicaciones registradas.
     */
	private Publicacion[] publicaciones;

    /**
     * Contador de publicaciones registradas (no nulas).
     */
    private int size;
    
    /**
     * Constructor que inicializa el arreglo de publicaciones con tamaño inicial de 10 elementos.
     */
    public ImplementacionCRUD() {
        this.publicaciones = new Publicacion[10];
        this.size = 0;
    }
    
    /**
     * Asigna un nuevo arreglo de publicaciones.
     *
     * @param publicaciones Arreglo de publicaciones que se desea establecer.
     */
    public void setPublicacion(Publicacion[] publicaciones) {
		this.publicaciones = publicaciones;
	}
    
    /**
     * Método para crear una nueva publicacion.
     * 
     * @param pub1 Objeto Publicacion a crear.
     * @return Mensaje indicando el éxito de la operación.
     */
    @Override
    public String create(Publicacion pub1) {
    	for (int i=0; i<publicaciones.length; i++) {
			if (publicaciones[i] == null) {
				publicaciones[i] = pub1;
				size++;
				return "Se guardó con éxito " + pub1.getIdpublicacion();
			}
		}
		Publicacion[] nuevoArreglo = new Publicacion[publicaciones.length*2];
		System.arraycopy(publicaciones, 0, nuevoArreglo, 0, publicaciones.length);
		publicaciones = nuevoArreglo;
		publicaciones[size++] = pub1;
    	
        return "Se guardó con éxito el usuario " + pub1.getIdpublicacion();
    }
    
    /**
     * Método para leer una publicacion por su id.
     * 
     * @param idPub codigo de la publicación.
     * @return Objeto Publicacion encontrado, o null si no se encuentra.
     */
    @Override
    public Publicacion read(String idPub) {
    	for(Publicacion pub1 : publicaciones) {
			if (pub1 != null && pub1.getIdpublicacion().equals(idPub)){
				return pub1;
			}
		}
        return null;
    }

    /**
     * Método para leer todas las publicaciones.
     * 
     * @return Array de objetos Publicacion.
     */
    @Override
    public Publicacion[] readAll() {
        return publicaciones;
    }

    /**
     * Método para actualizar una publicacion por su ID.
     * 
     * @param idPub identificador de la publicacion a actualizar.
     * @param modificador Objeto Publicacion con los nuevos valores.
     * @return Mensaje indicando el éxito o fracaso de la operación.
     */
    @Override
    public String update(String idPub, Publicacion modificador) {
    	for(int i = 0; i<publicaciones.length; i++) {
			if (publicaciones[i].getIdpublicacion().equals(idPub)) {
				publicaciones[i] = modificador;
				return "Publicacion actualizada con éxito";
			}
		}
        return "Publicacion no encontrada";
    }
    
    
    /**
     * Método para eliminar una publicacion por su ID.
     * 
     * @param id Código la publicacion a eliminar.
     * @return Objeto Publicacion eliminado, o null si no se encuentra.
     */
    @Override
    public Publicacion delete(String id) {
    	Publicacion eliminado = null;
    	if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("El código de barras no puede ser nulo o vacío.");
        }
    	for(int i = 0; i<publicaciones.length;i++) {
			if ((publicaciones[i] != null) && id.equals(publicaciones[i].getIdpublicacion())) {
				eliminado = publicaciones[i];
				publicaciones[i] = null; 
				size--;
				return eliminado;
			}
		}
    	if (eliminado == null) {
            throw new IllegalArgumentException("No se encontró ninguna prenda con el código: " + id);
        }
        return null;
    }

    /**
     * Método para serializar el array de publicaciones en un archivo.
     * 
     * @param publicaciones Array de objetos Prenda a serializar.
     * @param path Ruta del archivo.
     * @param name Nombre del archivo.
     * @return Mensaje indicando el éxito o fracaso de la operación.
     */
    @Override
    public String serializar(Publicacion[] publicaciones, String path, String name) {
    	try {
			FileOutputStream fos = new FileOutputStream(path + name);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(publicaciones);
			oos.close();
			fos.close();
			return "Archivo creado.";
		} catch (IOException ioe) {
			return "Error file " + ioe.getMessage();
		}
	}	

    /**
     * Método para deserializar el array de prendas desde un archivo.
     * 
     * @param path Ruta del archivo.
     * @param name Nombre del archivo.
     * @return Array de objetos Publicacion deserializados.
     */
    @Override
    public Publicacion[] deserializar(String path, String name) {
    	Publicacion[] a = null;
		try {
		FileInputStream fis = new FileInputStream(path + name);
		ObjectInputStream ois = new ObjectInputStream(fis);
		a = (Publicacion[]) ois.readObject();
		ois.close();
		fis.close();
		} catch (IOException ioe) {
		ioe.printStackTrace();
		} catch (ClassNotFoundException c) {
		c.printStackTrace();
		}
		return a;
	}
}