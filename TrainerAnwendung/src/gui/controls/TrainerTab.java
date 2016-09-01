package gui.controls;

import javafx.scene.control.TabPane;

public class TrainerTab extends TabPane {

	public TrainerTab() {
		
		setBoundaries();
		initializeComponents();
		
	}

	private void setBoundaries() {
	}

	private void initializeComponents() {
		
		TabPane tabPane = new TabPane();
		tabPane.setClip(new TrainerViewGrid());
	}
}