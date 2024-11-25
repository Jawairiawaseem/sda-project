package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Optional;

public class sampleController {
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
	private Button bookServiceBtn;
	@FXML
	private Button viewDetailsBtn;
	@FXML
    private Button rebookServiceBtn;
	@FXML
	private TableView<String[]> tableView;

	@FXML
	private TableColumn<String[], String> Category;

	@FXML
	private TableColumn<String[], String> Name;

	@FXML
	private TableColumn<String[], String> Rate;
	@FXML
	private TextField searchbar;
	@FXML
	private Button goBack;

   @FXML
   private Button searchBtn;

	String userEmail;
	String userPass;

//	@FXML
//	public void initialize() {
//	    // Set up columns to bind to array indices
//	    Category.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue()[0]));
//	    Name.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue()[1]));
//	    Rate.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue()[2]));
//
//	    // Add junk data
//	    ObservableList<String[]> data = FXCollections.observableArrayList(
//	        new String[]{"Cleaning", "House Cleaning", "50", "We provide professional house cleaning services."},
//	        new String[]{"Babysitting", "Child Care", "20", "Reliable babysitters for your children."},
//	        new String[]{"Fitness", "Personal Trainer", "30", "Get fit with our certified personal trainers."},
//	        new String[]{"Errands", "Grocery Delivery", "15", "We deliver groceries to your doorstep."},
//	        new String[]{"Laundry", "Dry Cleaning", "10", "Affordable dry cleaning services."}
//	    );
//
//	    // Set data in TableView
//	    tableView.setItems(data);
//	}
	 @FXML
	    void searchByKeyword(ActionEvent event) {

	    }
	@FXML
	void bookService(ActionEvent event) {

	}

	@FXML
	public void loginOrSignup() throws IOException {
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
	public void login() throws IOException {
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

		// TEST IT AGAINST ALREADY STORED USERS
		// APPLY INPUT VALIDATION

	}

	@FXML
	public void loginAdmin() throws IOException {
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

		/// APPLY INPUT VALIDATION

	}

	@FXML
	public void signup() throws IOException {
		Stage stage = (Stage) signupButton.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("Signup.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("SIGNUP");
		primaryStage.setScene(scene);
		primaryStage.show();

		// APPLY INPUT VALIDATION NO NUMBER WAGHAIRA

		// PROCEED TO LOGIN PAGE
		userEmail = email.getText();
		userPass = password.getText();

	}

	@FXML
	public void confirmSignup() throws IOException {
		Stage stage = (Stage) confirmSignupBtn.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("LOGIN");
		primaryStage.setScene(scene);
		primaryStage.show();

		// APPLY INPUT VALIDATION NO NUMBER WAGHAIRA

		// PROCEED TO LOGIN PAGE
		userEmail = email.getText();
		userPass = password.getText();

	}

	@FXML
	public void confirmLogin() throws IOException {
		Stage stage = (Stage) confirmLoginBtn.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("LOGIN");
		primaryStage.setScene(scene);
		primaryStage.show();

		// APPLY INPUT VALIDATION NO NUMBER WAGHAIRA

		// PROCEED TO LOGIN PAGE
		userEmail = email.getText();
		userPass = password.getText();

	}

	@FXML
	void browseServices(ActionEvent event) throws IOException {
		Stage stage = (Stage) browseServicesBtn.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("Services.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("SERVICES");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@FXML
	void viewDetails() {
		// Get the selected row
		String[] selectedRow = tableView.getSelectionModel().getSelectedItem();

		if (selectedRow != null) {
			// Create a popup window to display the description
			Stage popupStage = new Stage();
			popupStage.setTitle("Service Description");

			// Create a TextArea to show the description
			TextArea descriptionArea = new TextArea(selectedRow[3]);
			descriptionArea.setWrapText(true);
			descriptionArea.setEditable(false);

			// Layout for the popup window
			VBox layout = new VBox(10);
			layout.getChildren().add(descriptionArea);
			layout.setPrefSize(400, 200);

			// Set the scene and show the popup
			Scene scene = new Scene(layout);
			popupStage.setScene(scene);
			popupStage.show();
		} else {
			// Show an alert if no row is selected
			Alert alert = new Alert(Alert.AlertType.WARNING);
			alert.setTitle("No Selection");
			alert.setHeaderText("No Service Selected");
			alert.setContentText("Please select a service to view its description.");
			alert.showAndWait();
		}
	}

	@FXML
	void getHelp(ActionEvent event) throws IOException {

	}

	@FXML
	void viewBookingHistory(ActionEvent event) throws IOException {
		Stage stage = (Stage) viewBookingHistoryBtn.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("BookingHistory.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("BOOKING HISTORY");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@FXML
	void viewProfile(ActionEvent event) throws IOException {
		Stage stage = (Stage) viewProfileBtn.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("ViewProfile.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("PROFIL");
		primaryStage.setScene(scene);
		primaryStage.show();
		System.out.println("Hello, World!");

	}


	@FXML
	void rebookService(ActionEvent event) {

    }
}