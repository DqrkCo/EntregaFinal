package co.edu.poli.proyecto.vista;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal del cliente JavaFX que lanza la interfaz gráfica del sistema.
 * 
 * <p>Esta clase extiende {@link javafx.application.Application} y sirve como punto de
 * entrada de la aplicación JavaFX. Carga la vista FXML principal y configura la escena
 * inicial para mostrarse en la ventana principal ({@link Stage}).</p>
 * 
 * <p>El archivo FXML a cargar debe estar en el paquete correspondiente y tener el
 * mismo nombre que se le pase como parámetro a los métodos de carga.</p>
 * 
 * @author Jeronimo Rojas
 */
public class App extends Application {

	/**
     * Escena principal que contiene la interfaz gráfica.
     */
    private static Scene scene;

    /**
     * Método invocado automáticamente al iniciar la aplicación JavaFX.
     * Configura y muestra la ventana principal del sistema.
     *
     * @param stage Escenario principal proporcionado por la plataforma JavaFX.
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("InterfazEntregafinal"), 600, 534);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Permite cambiar dinámicamente la raíz de la escena principal,
     * útil para cambiar de pantalla sin crear una nueva ventana.
     *
     * @param fxml Nombre del archivo FXML (sin extensión) que se desea cargar como nueva raíz.
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }


    /**
     * Carga un archivo FXML del paquete actual y lo convierte en un objeto {@link Parent}
     * que representa la raíz de una escena JavaFX.
     *
     * @param fxml Nombre del archivo FXML (sin la extensión ".fxml").
     * @return El nodo raíz cargado desde el archivo FXML.
     * @throws IOException Si ocurre un error de lectura del archivo.
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /**
     * Método principal que lanza la aplicación JavaFX.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        launch();
    }

}