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
        HBox mainLayout = new HBox(20);
        mainLayout.setPadding(new Insets(15, 12, 15, 12));
        mainLayout.setAlignment(Pos.CENTER);

        // Login Pane
        VBox loginPane = new VBox(10);
        loginPane.setPadding(new Insets(20));
        loginPane.setStyle("-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");

        Text loginTitle = new Text("Log in");
        loginTitle.setFont(Font.font("Arial", 14));

        TextField loginUsername = new TextField();
        loginUsername.setPromptText("E-mail / username");

        PasswordField loginPassword = new PasswordField();
        loginPassword.setPromptText("password");

        Button loginButton = new Button("Log in");
        loginButton.setPrefWidth(100);

        loginPane.getChildren().addAll(loginTitle, loginUsername, loginPassword, loginButton);

        // Signup Pane
        VBox signupPane = new VBox(10);
        signupPane.setPadding(new Insets(20));
        signupPane.setStyle("-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");

        Text signupTitle = new Text("Sign up");
        signupTitle.setFont(Font.font("Arial", 14));

        TextField signupName = new TextField();
        signupName.setPromptText("Name");

        TextField signupUsername = new TextField();
        signupUsername.setPromptText("Username");

        TextField signupEmail = new TextField();
        signupEmail.setPromptText("E-mail");

        PasswordField signupPassword = new PasswordField();
        signupPassword.setPromptText("password");

        PasswordField signupPasswordConfirm = new PasswordField();
        signupPasswordConfirm.setPromptText("password (again)");

        Text passwordCriteria = new Text("*Use at least one upper case, lower case character and number");
        passwordCriteria.setFont(Font.font("Arial", 10));

        Button signupButton = new Button("Sign up");
        signupButton.setPrefWidth(100);

        signupPane.getChildren().addAll(signupTitle, signupName, signupUsername, signupEmail,
                signupPassword, signupPasswordConfirm, passwordCriteria, signupButton);

        // Adding both panes to main layout
        mainLayout.getChildren().addAll(loginPane, signupPane);

        // Setting up the primary stage
        primaryStage.setTitle("QuizHub");
        primaryStage.setScene(new Scene(mainLayout, 640, 480));
        primaryStage.show();
    }

}