package controllers;



import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 * @author alvaro Basilio
 * Classe de controller , utilizando padroes mvc
 * @version 1.0
 * @see javafx.fxml.Initializable
 */
public class CourseModelController {
	
	@FXML
	private AnchorPane back;
	
	@FXML
	private Pane lateralBar;
	
	@FXML
	private Button newCourse;
	
	@FXML
	private Button deleteAndChangeCourse;
	
	@FXML
	private Button newSupplie;
	
	@FXML
	private Button deleteAndChangeSupplie;

	@FXML
	private Button deleteAndChangeClassroom;

	@FXML
	private Button newClassroom;
	
	@FXML
	private Button backButton;

	/**
	 * Retorna ao menu
	 * @throws IOException
	 */
	@FXML
	void backToMenu() throws IOException {
		Parent root = (BorderPane)FXMLLoader.load(getClass().getResource("../view/Sample.fxml"));
		AssistentScene.getScene(backButton,root);
	}

	/**
	 * Carrega a cena de registro de materias
	 * @throws IOException
	 */
	@FXML
	void addSupplie() throws IOException {
		Parent root = (BorderPane)FXMLLoader.load(getClass().getResource("../view/RegistrationSupplies.fxml"));
        AssistentScene.getScene(newSupplie,root);
	}

	/**
	 * Carrega a cena de registro de salas
	 * @throws IOException
	 */
	@FXML
	void addClassroom() throws IOException {
		Parent root = (BorderPane)FXMLLoader.load(getClass().getResource("../view/RegistrationClassroom.fxml"));
		AssistentScene.getScene(newCourse, root);
	}

	/**
	 * Carrega a cena de registro de curso
	 * @throws IOException
	 */
	@FXML
	void addCourse() throws IOException{
		Parent root = (BorderPane)FXMLLoader.load(getClass().getResource("../view/RegistrationCourse.fxml"));
		AssistentScene.getScene(newCourse, root);
	}

	/**
	 * alterações e exclusao de salas
	 * @throws IOException
	 */
	@FXML
	void changeClassroom() throws IOException{
		Parent root = (BorderPane)FXMLLoader.load(getClass().getResource("../view/AltClassroom.fxml"));
		AssistentScene.getScene(newCourse, root);
	}
	
}
