package byt.money.mainstagemmi.internal.controller;

import byt.money.common.bar.IWorkingPanel;
import byt.money.componentbarmmi.internal.ComponentBarMmi;
import byt.money.componentbarmmi.internal.IComponentBarMmi;
import byt.money.loginmmi.LoginMmi;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class MainStageMmiController implements Initializable {

    @FXML
    private GridPane leftPanel;
    @FXML
    private GridPane centerPanel;
    private IComponentBarMmi componentBarMmi;
    private LoginMmi loginMmi;

    public void start() throws IOException {
        componentBarMmi = new ComponentBarMmi();
        leftPanel.add(componentBarMmi.getScene(), 0, 0);
        centerPanel.add(loginMmi.getLoginMmi(), 0, 0);
        for (Map.Entry<Button, IWorkingPanel> en : componentBarMmi.getFullPanels().entrySet()) {
            Button button = en.getKey();
            final IWorkingPanel panel = en.getValue();
            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    centerPanel.getChildren().clear();
                    GridPane scene = panel.getScene();
                    centerPanel.getChildren().add(scene);
                }
            });
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loginMmi = new LoginMmi();
    }
}
