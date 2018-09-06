package org.powerhigh.addon.window;

import java.awt.Color;
import java.awt.Image;
import org.lggl.SizedViewport;
import org.lggl.game.SimpleGame;
import org.lggl.graphics.Window;
import org.lggl.utils.debug.DebugLogger;

public class WindowUtils {

	public static void launchDebug(SimpleGame game, boolean isLaunchDebugEnabled) {
		game.enableLaunchDebug = isLaunchDebugEnabled;
	}
	
	public static void setWindowIcon(Window win, Image icon) {
		win.setIcon(icon);
	}
	
	public static void createWindow(Window win, Color bgc, boolean isWindowVisible, boolean isViewportManagerEnabled, boolean isWindowResizable, int WIDTH, int HEIGHT, String TITLE) {
		win.setVisible(isWindowVisible);
		win.setSize(WIDTH, HEIGHT);
		win.setBackground(bgc);
		win.setResizable(isWindowResizable);
		win.setTitle(TITLE);
		if (isViewportManagerEnabled == true) {
			win.setViewportManager(new SizedViewport(WIDTH, HEIGHT));
		}
	}
	
	public static void updateWindow(Window win, boolean debugCountedFPS, boolean isViewportEnabled, int WIDTH, int HEIGHT) {
		if (win.isClosed()) {
			System.exit(0);
		}
		if (debugCountedFPS == true) {
			System.out.println("FPS: " + win.getFPS());
		}
		if (isViewportEnabled == true) {
			win.setViewport(0, 0, WIDTH, HEIGHT);
		}
	}
	
}