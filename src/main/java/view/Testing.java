package view;

import javafx.application.Application;
import javafx.stage.Stage;

public class Testing extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        InsertJobWindow window = new InsertJobWindow();
        window.show();
    }
}