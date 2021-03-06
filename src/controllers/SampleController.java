package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * @author alvaro Basilio
 * Classe de controller , utilizando padroes mvc
 * @version 1.0
 * @see javafx.fxml.Initializable
 */
public class SampleController implements Initializable{


	@FXML
	private AnchorPane back;

	@FXML
	private Button btn;

	@FXML
	private Button classmate;
	
	@FXML
	private Button course;

	@FXML
	private Button close;

    @FXML
    private ContextMenu context;
    
    @FXML
    private Button teacher;
    
    @FXML 
    private Tooltip infoClassmate = new Tooltip(); 
    
    @FXML 
    private Tooltip infoTeacher = new Tooltip();

	public SampleController() {
	}

	/**
	 * Encerra a aplicação
	 */
	@FXML
	void closeApplication() {
		Stage stage = (Stage) close.getScene().getWindow();
		stage.close();
	}

	/**
	 * Vai para o modulo de alunos
	 * @throws IOException
	 */
	@FXML
	void moduloAluno() throws IOException {
		Parent root = (BorderPane) FXMLLoader.load(getClass().getResource("../view/ClassmateModel.fxml"));
		AssistentScene.getScene(classmate,root);
	}

	/**
	 * Vai para o modulo de professores
	 * @throws IOException
	 */
	@FXML
	void moduloProfessor() throws IOException {
		Parent root = (BorderPane) FXMLLoader.load(getClass().getResource("../view/TeacherModel.fxml"));
		AssistentScene.getScene(teacher,root);

	}

	/**
	 * Vai para o modulo colegiado
	 * @throws IOException
	 */
	@FXML
	void moduloColegiado() throws IOException {
		Parent root = (BorderPane) FXMLLoader.load(getClass().getResource("../view/College.fxml"));
		AssistentScene.getScene(teacher,root);

	}

	/**
	 * Vai para o modulo de cursos
	 * @throws IOException
	 */
	@FXML
	void moduloCursos() throws IOException {
		Stage sc = (Stage) teacher.getScene().getWindow();
		Parent root = (BorderPane) FXMLLoader.load(getClass().getResource("../view/CourseModel.fxml"));
		Scene scene = new Scene(root, sc.getWidth(), sc.getHeight());
		scene.getStylesheets().add(getClass().getResource("../view/application.css").toExternalForm());
		sc.setScene(scene);
		sc.show();
	}

	/**
	 * Método que sobreescreve da interface Initialize, ela é executada quando a cena é carregada
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		infoTeacher.setShowDelay(new Duration(500));
		infoClassmate.setShowDelay(new Duration(500));
		classmate.setTooltip(infoClassmate);
		teacher.setTooltip(infoTeacher);
		
	}
	
}
