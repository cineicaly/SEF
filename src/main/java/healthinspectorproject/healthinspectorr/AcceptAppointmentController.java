package healthinspectorproject.healthinspectorr;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class AcceptAppointmentController implements Initializable {


    @FXML
    private Button bt_back;
    @FXML
    private Button bt_accept;
    @FXML
    private TextField tf_accept;


    public void initialize(URL url, ResourceBundle resourceBundle) {

        bt_accept.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(!tf_accept.getText().trim().isEmpty()){
                    DBUtils.acceptAppointment(event,tf_accept.getText(),"Appointment accepted","Awaiting inspection");
                }else {
                    System.out.println("Please fill in all information");
                    Alert alert= new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Please fill in all information");
                    alert.show();

                }


            }
        });
        bt_back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBUtils.changeScene(event, "loggedinmanager.fxml","ManagerMain!",null,null);

            }
        });
    }



}
