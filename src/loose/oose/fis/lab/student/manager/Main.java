package sample;
package loose.oose.fis.lab.stundet.manager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;

public class Main extends Controller {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/view-students.fxml"));
        primaryStage.setTitle("Student Manager");
        primaryStage.setScene(new Scene(root, 600, 400));
        Parent root = FXMLLoader.load(getClass().getResource("fxml/login.fxml"));
        primaryStage.setTitle("Student Manager");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
}



    public static void main(String[] args) {
        launch(args);
    }
}
