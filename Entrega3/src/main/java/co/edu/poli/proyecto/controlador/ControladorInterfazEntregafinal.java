package co.edu.poli.proyecto.controlador;

import co.edu.poli.proyecto.modelo.Publicacion;
import co.edu.poli.proyecto.modelo.Usuario;
import co.edu.poli.proyecto.servicios.ImplementacionCRUD;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

/**
 * La clase {@code ControladorInterfazEntregafinal} gestiona la lógica de interacción
 * entre la interfaz gráfica JavaFX y el modelo de datos {@code Publicacion}.
 *
 * <p>Permite realizar operaciones CRUD (crear, leer, actualizar, eliminar) y
 * operaciones de serialización/deserialización sobre publicaciones.</p>
 *
 * <p>Es parte del patrón MVC (Modelo-Vista-Controlador), actuando como controlador
 * de eventos asociados a la vista definida en FXML.</p>
 * 
 * @author Jeronimo Rojas
 */
public class ControladorInterfazEntregafinal {

	 /** Área de texto para mostrar todas las publicaciones existentes. */
    @FXML private TextArea AreaTodos;

    /** Botón para crear una nueva publicación. */
    @FXML private Button BttCrear;

    /** Botón para eliminar una publicación existente. */
    @FXML private Button BttDelete;

    /** Botón para cargar datos desde archivo binario. */
    @FXML private Button BttDeserializar;

    /** Botón para guardar datos a archivo binario. */
    @FXML private Button BttSerializar;

    /** Botón para actualizar una publicación existente. */
    @FXML private Button BttUpdate;

    /** Botón para ver una publicación específica. */
    @FXML private Button BttVer;

    /** Botón para ver todas las publicaciones. */
    @FXML private Button BttVerTodos;

    /** Campo de texto para ingresar el año de publicación. */
    @FXML private TextField TxtAnioPub;

    /** Campo de texto para ingresar el contenido de la publicación. */
    @FXML private TextField TxtContenidoPub;

    /** Campo de texto para ingresar la contraseña del autor. */
    @FXML private TextField TxtContrasenia;

    /** Campo de texto para ingresar el correo del autor. */
    @FXML private TextField TxtCorreo;

    /** Campo de texto para ingresar el ID de la publicación. */
    @FXML private TextField TxtIdPub;

    /** Campo de texto para ingresar el ID del usuario autor. */
    @FXML private TextField TxtIdUsuarioInf;

    /** Campo de texto para ingresar el nombre del usuario autor. */
    @FXML private TextField TxtNomUsuario;

    /** Servicio CRUD para gestionar publicaciones. */
    private ImplementacionCRUD op;

    /** Lista observable que almacena las publicaciones en memoria. */
    private ObservableList<Publicacion> pubs;
    
    /**
     * Inicializa la lista observable y la implementación del CRUD.
     * Este método se ejecuta automáticamente al cargar el controlador.
     */
    public void initialize() {
        
		pubs = FXCollections.observableArrayList();
		
		op = new ImplementacionCRUD();
		
    }
    
    /**
     * Crea una nueva publicación con los datos introducidos en los campos de texto.
     * Muestra una alerta de confirmación o advertencia según el resultado.
     * 
     * @param event Evento de acción generado por el botón "Crear".
     */
    @FXML
    void Crear(ActionEvent event) {
    	
    	Alert pC = new Alert(AlertType.CONFIRMATION);
    	try {
    		int anio = Integer.parseInt(TxtAnioPub.getText());
    	    int idusr = Integer.parseInt(TxtIdUsuarioInf.getText());
            Usuario usr = new Usuario(idusr, TxtNomUsuario.getText(), TxtCorreo.getText(), TxtContrasenia.getText());
            Publicacion p1 = new Publicacion(TxtIdPub.getText(), TxtContenidoPub.getText(), anio, usr);
            pubs.add(p1);
            pC.setContentText(op.create(p1));
            pC.show();
            TxtAnioPub.clear();
            TxtContenidoPub.clear();
            TxtContrasenia.clear();
            TxtCorreo.clear();
            TxtIdPub.clear();
            TxtIdUsuarioInf.clear();
            TxtNomUsuario.clear();
            
        } catch (Exception e) {
            pC.setAlertType(AlertType.WARNING);
            pC.setContentText("Error al crear el fertilizante: verifica los datos ingresados.");
            pC.show();
            System.out.println(e);
    	}
    }
    
    /**
     * Muestra una alerta con la información de una publicación específica.
     * 
     * @param event Evento de acción generado por el botón "Ver".
     */
    @FXML
    void Ver(ActionEvent event) {
    	Alert a = new Alert(AlertType.INFORMATION);
    	
    	if (TxtIdPub.getText().equals("")) {
    		a.setContentText("Ingrese un id valido.");
    		a.show();
    	}
    		else {
    			Publicacion p1 = op.read(TxtIdPub.getText());
    	
    			if (p1 != null ) {
    		
		    		a.setContentText("El fertilizante es de: " + op.read(TxtIdPub.getText()));
		    		a.show();
	    	} else if (p1== null){
	    		a.setContentText("No es posible encontrar el fertilizante.");
	    		a.show();
	    		System.out.println(p1);
	    	}
    	}
    }
    
    /**
     * Muestra todas las publicaciones en el área de texto.
     * 
     * @param event Evento de acción generado por el botón "Ver Todos".
     */
    @FXML
    void VerTodos(ActionEvent event) {
    	AreaTodos.clear();
    	Publicacion[] pubs = op.readAll();
    	
    	for (Publicacion p : pubs ) {
    		if (p != null ) {
    			AreaTodos.appendText(p.toString() + "\n");
    		}
    	}
    }
    
    /**
     * Actualiza una publicación existente con nuevos datos.
     * 
     * @param event Evento de acción generado por el botón "Actualizar".
     */
    @FXML
    void Actualizar(ActionEvent event) {
    	Alert alert = new Alert(Alert.AlertType.INFORMATION);
        try {
            int anio = Integer.parseInt(TxtAnioPub.getText());
            int idusr = Integer.parseInt(TxtIdUsuarioInf.getText());

            Usuario usr = new Usuario(idusr, TxtNomUsuario.getText(), TxtCorreo.getText(), TxtContrasenia.getText());
            Publicacion p = new Publicacion(TxtIdPub.getText(), TxtContenidoPub.getText(), anio, usr);

            String result = op.update(TxtIdPub.getText(), p);
            alert.setContentText(result);
        } catch (Exception e) {
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setContentText("Error al actualizar la publicación: " + e.getMessage());
        }
        alert.show();
    }
    
    /**
     * Elimina una publicación usando su ID.
     * 
     * @param event Evento de acción generado por el botón "Eliminar".
     */
    @FXML
    void Eliminar(ActionEvent event) {
        String idPub = TxtIdPub.getText();
    	
    	Alert pE = new Alert(AlertType.INFORMATION);
        
        try {
	        if (idPub == null || idPub.trim().isEmpty()) {
	        	
	        	pE.setContentText("Por favor, ingresa un ID válido.");
		        pE.show();
		        return;
	        }
            String resultado = "Eliminada: " + op.delete(idPub);

            if (resultado == null || resultado.trim().isEmpty()) {
                pE.setContentText("No se encontró ningun fertilizante con el ID: " + idPub);
            } else {
                pE.setContentText("Se eliminó el fertilizante: " + resultado);
            }
            pE.show();
        } catch (Exception e) {
            pE.setAlertType(AlertType.ERROR);
            pE.setContentText("Error al eliminar el fertilizante: " + e.getMessage());
            pE.show();
            e.printStackTrace();
        }

    }

    /**
     * Deserializa un archivo binario y carga las publicaciones al sistema.
     * 
     * @param event Evento de acción generado por el botón "Deserializar".
     */
    @FXML
    void Deserializar(ActionEvent event) {
    	Alert a = new Alert(AlertType.WARNING);
		try {
			op.setPublicacion(op.deserializar("", "binaryfile.bin"));
			pubs.clear();

			for (Publicacion pub : op.readAll()) {
				if (pub != null)
					pubs.add(pub);
			} a.setContentText("Se ha cargado el archivo.");
			a.show();

		} catch (Exception e) {
			a.setContentText("Error open file "+e.getMessage());
			a.show();
		}
    }

    /**
     * Serializa las publicaciones actuales a un archivo binario.
     * 
     * @param event Evento de acción generado por el botón "Serializar".
     */
    @FXML
    void Serializar(ActionEvent event) {
    	Alert a = new Alert(AlertType.INFORMATION);
		a.setContentText(op.serializar(op.readAll(), "", "binaryfile.bin"));
		a.show();
    }
    
}
