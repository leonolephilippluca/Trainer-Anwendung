package gui.controls;

import javafx.scene.layout.BorderPane;

public class TrainerBorderPane extends BorderPane {

	public TrainerBorderPane() {
		setBoundaries();
		initializeComponents();
	}
	
	private void setBoundaries() {}
	
	private void initializeComponents() {
			
			setLeft(new VBoxLeft());
			setCenter(new NewTrainerGrid());
			
			
		
	}
}
