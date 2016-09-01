package Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String... args) {

		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		stage.setScene(new Scene(new TabPane(), 300, 300));
		stage.show();

	}
}