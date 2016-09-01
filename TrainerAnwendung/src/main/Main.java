package main;

import static util.ScreenSize.SCREEN_HEIGHT;
import static util.ScreenSize.SCREEN_WIDTH;
import gui.controls.TrainerBorderPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String... args) {

		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		stage.setScene(new Scene(new TrainerBorderPane(), SCREEN_WIDTH*0.85, SCREEN_HEIGHT*0.725	));
		stage.show();

	}
}