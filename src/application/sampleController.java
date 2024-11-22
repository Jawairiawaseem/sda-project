package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Optional;

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
	private TextField email;
	@FXML 
	private TextField password;
	@FXML
	private Button confirmSignupBtn;
	@FXML
	private Button confirmLoginBtn;
	@FXML
	private Button browseServicesBtn;
	@FXML
	private Button getHelpBtn;
	@FXML
    private Button viewBookingHistoryBtn;
    @FXML
    private Button viewProfileBtn;
    @FXML
    private TableView<String[]> tableView;

    @FXML
    private TableColumn<String[], String> Category;

    @FXML
    private TableColumn<String[], String> Name;

    @FXML
    private TableColumn<String[], String> Rate;

	String userEmail;
	String userPass;
	
	 @FXML
	    public void initialize() {
	        // Set up columns to bind to array indices
	        Category.setCellValueFactory(cellData -> 
	            new javafx.beans.property.SimpleStringProperty(cellData.getValue()[0]));
	        Name.setCellValueFactory(cellData -> 
	            new javafx.beans.property.SimpleStringProperty(cellData.getValue()[1]));
	        Rate.setCellValueFactory(cellData -> 
	            new javafx.beans.property.SimpleStringProperty(cellData.getValue()[2]));

	        // Add junk data
	        ObservableList<String[]> data = FXCollections.observableArrayList(
	            new String[]{"Cleaning", "House Cleaning", "50"},
	            new String[]{"Babysitting", "Child Care", "20"},
	            new String[]{"Fitness", "Personal Trainer", "30"},
	            new String[]{"Errands", "Grocery Delivery", "15"},
	            new String[]{"Laundry", "Dry Cleaning", "10"}
	        );

	        // Set data in TableView
	        tableView.setItems(data);
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
		 userEmail = email.getText();
		 userPass = password.getText();
		 
		 //TEST IT AGAINST ALREADY STORED USERS
		 //APPLY INPUT VALIDATION
		
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
		userEmail = email.getText();
		userPass = password.getText();
		
		///APPLY INPUT VALIDATION
		 
	}
	@FXML
	public void signup() throws IOException
	{
		Stage stage = (Stage) signupButton.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("Signup.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("SIGNUP"); 
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		//APPLY INPUT VALIDATION NO NUMBER WAGHAIRA
		
		//PROCEED TO LOGIN PAGE
		userEmail = email.getText();
		userPass = password.getText();
		
		
	}
	@FXML
	public void confirmSignup() throws IOException
	{
		Stage stage = (Stage) confirmSignupBtn.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("LOGIN"); 
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		//APPLY INPUT VALIDATION NO NUMBER WAGHAIRA
		
		//PROCEED TO LOGIN PAGE
		userEmail = email.getText();
		userPass = password.getText();
		
		
	}
	
	@FXML
	public void confirmLogin() throws IOException
	{
		Stage stage = (Stage) confirmLoginBtn.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("LOGIN"); 
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		//APPLY INPUT VALIDATION NO NUMBER WAGHAIRA
		
		//PROCEED TO LOGIN PAGE
		userEmail = email.getText();
		userPass = password.getText();
		
		
	}
	@FXML
    void browseServices(ActionEvent event) throws IOException
	{
		Stage stage = (Stage) browseServicesBtn.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("SERVICES"); 
		primaryStage.setScene(scene);
		primaryStage.show();
    }
	@FXML
    void ViewDetails(ActionEvent event) {

    }

    @FXML
    void bookService(ActionEvent event) {

    }


    @FXML
    void getHelp(ActionEvent event) throws IOException{

    }

    @FXML
    void viewBookingHistory(ActionEvent event) throws IOException{

    }

    @FXML
    void viewProfile(ActionEvent event) throws IOException{

    }

	
}