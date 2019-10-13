package controllers;


import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import entities.models.Teacher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class RegistrationSuppliesController implements Initializable{
	
	@FXML
	private AnchorPane back;
	
	@FXML
	private Line layout;
	
	@FXML
	private Pane lateralBar;
	
	@FXML
	private Label texts;
	
	@FXML
	private Label supplie;
	
	@FXML
	private Label id;
	
	@FXML
	private Label duration;
	
	@FXML
	private Label init;
	
	@FXML
	private Label finish;
	
	@FXML
	private Label teacher;
	
	@FXML
	private Label aux;
	
	@FXML
	private Label info;
	
	@FXML
	private TextField fieldSupplie;
	
	@FXML
	private TextField fieldId;
	
	@FXML
	private TextField fieldDuration;
	
	@FXML
	private DatePicker fieldInit;	
	
	@FXML
	private DatePicker fieldFinish;
	
	@FXML
	private Button backButton;
	
	@FXML
	private Button cadastro;
	
	@FXML
	private ComboBox<Teacher> fieldTeacher;
	
	private ObservableList<Teacher> lists;
	
	public void TeacherList() {
		List<Teacher> t = Main.teacherUpdate();
		lists = FXCollections.observableArrayList(t);
		fieldTeacher.setItems(lists);
	}
	
	@FXML
	void backToModel() throws IOException {
		Parent root = (BorderPane) FXMLLoader.load(getClass().getResource("../view/CourseModel.fxml"));
		Stage sc = (Stage) backButton.getScene().getWindow();
		Scene scene = new Scene(root, sc.getWidth(), sc.getHeight());
		scene.getStylesheets().add(getClass().getResource("../view/application.css").toExternalForm());
		sc.setScene(scene);
		sc.show();

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		cadastro.setDisable(true);
		TeacherList();
	}
	
}
