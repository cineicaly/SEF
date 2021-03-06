package healthinspectorproject.healthinspectorr;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage primaryStage) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.getIcons().add(new Image(("/images/phlogo.jpg")));
        primaryStage.setTitle("Log in!");

        primaryStage.setScene(new Scene(root,800,400));
        primaryStage.show();
    }
    public static void main(String[] args){launch(args);}

}
