package byt.money.mainstagemmi.internal;

import byt.money.common.service.IStartStop;
import byt.money.mainstagemmi.internal.controller.MainStageMmiController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 *
 * @author Lukasz
 */
public class MainStageMmi implements IStartStop {
    
    private static final Logger LOGGER = Logger.getLogger(MainStageMmi.class.getName());
    
    private final FXMLLoader fxmlLoader;
    private Scene scene;

    public MainStageMmi() {
        fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/MainStageMmi.fxml"));
        start();
    }

    @Override
    public void start() {
        try {
            Parent root = fxmlLoader.load();
            scene = new Scene(root);
            scene.getStylesheets().add("/styles/Styles.css");
            MainStageMmiController controller = fxmlLoader.getController();
            controller.start();
        } catch (IOException ex) {
            LOGGER.log(Level.INFO, "Exception during activate main stage mmi ", ex);
        }
    }

    public Scene getScene() {
        return scene;
    }

    @Override
    public void stop() {
    }
    
}
