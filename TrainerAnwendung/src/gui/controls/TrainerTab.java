package gui.controls;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class TrainerTab extends TabPane {

	public TrainerTab(Tab tab) {
		
		setBoundaries();
		initializeComponents(tab);
		
	}

	private void setBoundaries() {
	}

	private void initializeComponents(Tab tab) {
		
		TabPane tabPane = new TabPane();
		tabPane.getTabs().add(tab);
	}
}