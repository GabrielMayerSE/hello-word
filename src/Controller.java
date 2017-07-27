import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by bielm on 27/07/2017.
 */
public class Controller implements Initializable {

    @FXML
    private Button btHello;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btHello.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    new HelloWordMSG().start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
