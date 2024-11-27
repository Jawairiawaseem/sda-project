package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Optional;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.stream.IntStream;

public class sampleController {
	@FXML
	private TextField tfTitle;
	@FXML
	private Button loginButton;
	@FXML
	private Button SPviewProfileBtn;
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
	private Button goBackToServicesBtn;
	
	@FXML
	private TableView<String[]> tableView;

//	@FXML
//	private TableColumn<String[], String> Category;
//
//	@FXML
//	private TableColumn<String[], String> Name;
//
//	@FXML
//	private TableColumn<String[], String> Rate;
	@FXML
	private TextField searchbar;
	@FXML
	private Button goBack;

   @FXML
   private Button searchBtn;

	String userEmail;
	String userPass;
	@FXML
    private DatePicker datePicker;

    @FXML
    private ComboBox<String> timeComboBox;

    @FXML
    private Spinner<Integer> hoursSpinner;

//    @FXML
//    public void initialize() {
//        // Populate timeComboBox with times in 15-minute intervals
//        timeComboBox.getItems().addAll(
//            IntStream.range(0, 24)
//                .flatMap(hour -> IntStream.of(0, 15, 30, 45).map(minute -> hour * 100 + minute))
//                .mapToObj(time -> String.format("%02d:%02d", time / 100, time % 100))
//                .toList()
//        );
//
//        // Configure hoursSpinner to select hours between 1 and 24
//        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 24, 1);
//        hoursSpinner.setValueFactory(valueFactory);
//    }

    @FXML
    public void handleSubmit() {
        LocalDate selectedDate = datePicker.getValue();
        String selectedTime = timeComboBox.getValue();
        Integer selectedHours = hoursSpinner.getValue();

        if (selectedDate != null && selectedTime != null && selectedHours != null) {
            System.out.println("Selected Date: " + selectedDate);
            System.out.println("Selected Time: " + selectedTime);
            System.out.println("Selected Hours: " + selectedHours);
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Incomplete Selection");
            alert.setHeaderText(null);
            alert.setContentText("Please select a date, time, and number of hours.");
            alert.showAndWait();
        }
    }
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
    private Button acceptRequestBtn;

    @FXML
    private TableView<?> bookingRequests;

//    @FXML
//    private TableColumn<?, ?> date;
//
//    @FXML
//    private TableColumn<?, ?> duration;
//
//    @FXML
//    private TableColumn<?, ?> rate;
//
//    @FXML
//    private TableColumn<?, ?> service;

    @FXML
    private Button viewClientProfileBtn;
    
    @FXML
    private Button offerServicesBtn;
    
    
    
    
    @FXML
    void acceptRequest(ActionEvent event) {

    }

    @FXML
    void viewClientProfile(ActionEvent event) {

    }
	 @FXML
	    void searchByKeyword(ActionEvent event) {

	    }
	@FXML
	void bookService(ActionEvent event) {

	}
	@FXML
    private Button addOfferBtn;
	 @FXML
	 private TableView<BuiltInService> builtInServices;
    @FXML
    private TableColumn<BuiltInService, String> category;

    @FXML
    private TableColumn<BuiltInService, String> description;

    @FXML
    private TableColumn<BuiltInService, String> service;

   
    
    private ObservableList<BuiltInService> serviceList = FXCollections.observableArrayList();

//    public void initialize() {
//        // Check if service, description, and category are not null before setting
//        if (service != null && description != null && category != null) {
//            service.setCellValueFactory(new PropertyValueFactory<>("serviceName"));
//            description.setCellValueFactory(new PropertyValueFactory<>("description"));
//            category.setCellValueFactory(new PropertyValueFactory<>("category"));
//        }
//        loadDataFromDatabase();
//        
//    }
    @FXML
    void goBackToSPHomePage(ActionEvent event) throws IOException {
    	Stage stage = (Stage) goBack.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("SPHomePage.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Home Page");
		primaryStage.setScene(scene);
		primaryStage.show();

    }
    @FXML
    void goBackToServices() throws IOException{
    	Stage stage = (Stage) goBackToServicesBtn.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("Services.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Home Page");
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    private void loadDataFromDatabase() {
        String query = "SELECT * FROM BuiltInService";

        try (Connection connection = DatabaseUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int serviceId = resultSet.getInt("serviceId");
                String serviceName = resultSet.getString("serviceName");
                String description = resultSet.getString("description");
                String category = resultSet.getString("category");
                System.out.println(serviceName);

                BuiltInService service = new BuiltInService(serviceId, serviceName, description, category);
                serviceList.add(service);
            }
        } catch (SQLException e) {
            System.err.println("Error loading data: " + e.getMessage());
        }

        // Add data to TableView
        builtInServices.setItems(serviceList);
    }
	@FXML
    void offerServices()throws IOException
    {
		Stage stage = (Stage) offerServicesBtn.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("OfferServices.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Offer Services");
		primaryStage.setScene(scene);
		primaryStage.show();
		
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
		
		userEmail = email.getText();
		userPass = password.getText();
		Customer loggedInCustomer = null;
		loggedInCustomer = Customer.login(userEmail,userPass);
		if(loggedInCustomer!=null) {
			Stage stage = (Stage) confirmLoginBtn.getScene().getWindow();
			stage.close();
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("CustomerHomePage.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("HOME");
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		else
		{
			Alert alert = new Alert(Alert.AlertType.ERROR);
		    alert.setTitle("Invalid login details");
		    alert.setHeaderText(null); // You can leave the header text empty or provide a custom message
		    alert.setContentText("Please check your email and password and try again.");
		    alert.showAndWait();
		}
		
		// APPLY INPUT VALIDATION NO NUMBER WAGHAIRA

		// PROCEED TO LOGIN PAGE
		
		
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
	void SPviewProfile(ActionEvent event) throws IOException {
		Stage stage = (Stage) SPviewProfileBtn.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("SPViewProfile.fxml"));
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