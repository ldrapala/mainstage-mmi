package byt.money.mainstagemmi.internal.demo;

import byt.money.mainstagemmi.internal.MainStageMmi;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Lukasz
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        MainStageMmi stage = new MainStageMmi();
//        primaryStage.setTitle(addingMmi.getName());
        primaryStage.setScene(stage.getScene());
        primaryStage.setMaxHeight(400);
        primaryStage.setMinHeight(400);
        primaryStage.setMaxWidth(650);
        primaryStage.setMinWidth(650);
//        primaryStage.setFullScreen(true);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
