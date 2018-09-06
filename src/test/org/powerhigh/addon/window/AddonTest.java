package test.org.powerhigh.addon.window;

import org.powerhigh.addon.window.WindowUtils;

import java.awt.Color;

import org.lggl.game.SimpleGame;
import org.lggl.graphics.Window;

public class AddonTest extends SimpleGame {

	public static void main(String[] args) {
		new AddonTest().start();
	}

	@Override
	public void init(Window win) {
		WindowUtils.createWindow(win, Color.BLUE, true, true, true, 800, 600, "Addon Test");
	}

	@Override
	public void update(Window win, double delta) {
		WindowUtils.updateWindow(win, true, false, 800, 600);
	}

}
