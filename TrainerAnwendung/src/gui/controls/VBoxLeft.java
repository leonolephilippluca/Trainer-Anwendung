package gui.controls;

import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import static util.ScreenSize.SCREEN_WIDTH;

public class VBoxLeft extends ScrollPane{
	
	public VBoxLeft() {
		
		setBoundaries();
		initializeComponents();
	}
	private void setBoundaries() {
		
	}
	
	
	private void initializeComponents() {
		setContent(cachedVBox());
		
	}
	
	private VBox cachedVBox() {
		VBox vbox = new VBox();
		vbox.setPrefWidth(SCREEN_WIDTH*0.25);
		return vbox;
	}
}
