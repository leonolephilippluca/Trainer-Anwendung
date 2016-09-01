package util;

import java.awt.Dimension;
import java.awt.Toolkit;


public class ScreenSize {
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public static double SCREEN_WIDTH = screenSize.getWidth();
	public static double SCREEN_HEIGHT = screenSize.getHeight();
}
