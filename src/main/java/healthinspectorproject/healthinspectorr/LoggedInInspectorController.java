package healthinspectorproject.healthinspectorr;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoggedInInspectorController implements Initializable {
    @FXML
    private Button b_logout;
    @FXML
    private Button bt_companies;

    @FXML
    private Label label_welcome;

    @FXML
    private Label label_role;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        b_logout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBUtils.changeScene(event, "main.fxml","Log in!",null,null);

            }
        });
        bt_companies.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBUtils.changeScene(event, "propertyfinder.fxml","Companies Page",null,null);

            }
        });
    }


    public void set_user_information (String username, String role){
        label_welcome.setText("This is the main page,"+username+"!");
        label_role.setText("Log out when you finish your work!");
    }

}