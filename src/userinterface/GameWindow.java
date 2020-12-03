package userinterface;

import javax.swing.JFrame;

public class GameWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int SCREEN_WIDTH = 1650;
	private GameScreen gameScreen;
   
	public GameWindow() {
		super("Kirby Run");
		//setSize(SCREEN_WIDTH, 1080);
		setLocation(00, 00);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setUndecorated(true);
		setVisible(true);

		gameScreen = new GameScreen();
		addKeyListener(gameScreen);
		add(gameScreen);
	}

	public void startGame() {
		setVisible(true);   
		gameScreen.startGame();
	}

	public static void main(String args[]) {
		(new GameWindow()).startGame();
	}
}
