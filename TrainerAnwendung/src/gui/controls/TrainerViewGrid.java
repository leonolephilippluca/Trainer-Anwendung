package gui.controls;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class TrainerViewGrid extends GridPane {
	
	public TrainerViewGrid() {
		setBoundaries();
		initializeComponents();
				
	}

	private void setBoundaries() {
		
		
	}
	
	private void initializeComponents() {
		
		
		add(fatLabel("ID"), 0, 0);
		add(fatLabel("ID"), 0, 1);
		add(fatLabel("ID"), 0, 2);
		add(fatLabel("ID"), 0, 3);
		
				
		
	}
	
	private Label fatLabel(String text){
		Label label = new Label(text);
		label.setStyle("-fx-font-size: bold;");
		return label;
	}
}
