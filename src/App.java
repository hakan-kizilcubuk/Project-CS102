import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Main layout
        HBox layoutMain = new HBox(20);
        layoutMain.setPadding(new Insets(15, 12, 15, 12));
        layoutMain.setAlignment(Pos.CENTER);

        // Login Pane
        VBox loginScreenPanel = new VBox(10);
        loginScreenPanel.setPadding(new Insets(20));
        loginScreenPanel.setStyle("-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");

        Text loginLabel = new Text("Log in");
        loginLabel.setFont(Font.font("Arial", 14));

        TextField loginUsernameTextField = new TextField();
        loginUsernameTextField.setPromptText("E-mail / username");

        PasswordField loginPasswordTextField = new PasswordField();
        loginPasswordTextField.setPromptText("Password");

        Button loginButton = new Button("Log in");
        loginButton.setPrefWidth(100);

        loginScreenPanel.getChildren().addAll(loginLabel, loginUsernameTextField, loginPasswordTextField, loginButton);

        // Signup Pane
        VBox signupScreenPanel = new VBox(10);
        signupScreenPanel.setPadding(new Insets(20));
        signupScreenPanel.setStyle("-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");

        Text signupLabel = new Text("Sign up");
        signupLabel.setFont(Font.font("Arial", 14));

        TextField signupNameTextField = new TextField();
        signupNameTextField.setPromptText("Name");

        TextField signupUsernameTextField = new TextField();
        signupUsernameTextField.setPromptText("Username");

        TextField signupEmailTextField = new TextField();
        signupEmailTextField.setPromptText("E-mail");

        PasswordField signupPassword = new PasswordField();
        signupPassword.setPromptText("Password");

        PasswordField signupPasswordConfirm = new PasswordField();
        signupPasswordConfirm.setPromptText("password (again)");

        Text passwordCriteriaInfo = new Text("*Use at least one upper case, lower case character and number");
        passwordCriteriaInfo.setFont(Font.font("Arial", 10));

        Button signupButton = new Button("Sign up");
        signupButton.setPrefWidth(100);

        signupScreenPanel.getChildren().addAll(signupLabel, signupNameTextField, signupUsernameTextField, signupEmailTextField,
                signupPassword, signupPasswordConfirm, passwordCriteriaInfo, signupButton);

        // Adding both panes to main layout
        layoutMain.getChildren().addAll(loginScreenPanel, signupScreenPanel);

        // Setting up the primary stage
        primaryStage.setTitle("QuizHub");
        primaryStage.setScene(new Scene(layoutMain, 640, 480));
        primaryStage.show();
    }

}