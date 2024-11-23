package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Optional;
//elasdasdjaskdjlkasjdlkasjd
public class sampleController
{
	@FXML
	private TextField tfTitle;
	@FXML
	private Button loginButton;
	@FXML
	private Button signupButton;
	@FXML
	private Button serviceProvider;
	@FXML
	private Button customer;
	@FXML
	private Button admin;


	@FXML
	public void buttonclicked(ActionEvent event) {
		Stage mainWindow = (Stage) tfTitle.getScene().getWindow();
		String title = tfTitle.getText();
		mainWindow.setTitle(title);
	}
	@FXML
	public void loginOrSignup() throws IOException
	{
		Stage stage = (Stage) serviceProvider.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("loginOrSignup.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Login or Signup"); 
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@FXML
	public void login() throws IOException
	{
		Stage stage = (Stage) loginButton.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("LOGIN"); 
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	@FXML
	public void loginAdmin() throws IOException
	{
		Stage stage = (Stage) admin.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("LOGIN"); 
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	@FXML
	public void signup() throws IOException
	{
		Stage stage = (Stage) signupButton.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("LOGIN"); 
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}