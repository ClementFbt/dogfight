package jpu2016.dogfight.gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

import javax.swing.JFrame;

import jpu2016.dogfight.view.GraphicsBuilder;

public class GameFrame extends JFrame implements KeyListener {

	/**
	 *
	 */
	private static final long		serialVersionUID	= -9003193788598716910L;
	private GraphicsBuilder			graphicBuilder;
	private final IEventPerformer	eventPerformer;
	public static String			title				= " ";
	private GamePanel				gamePanel;

	public GamePanel getGamePanel() {
		return this.gamePanel;
	}

	public void setGamePanel(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}

	public GameFrame(String title, IEventPerformer eventPerformer, GraphicsBuilder graphicBuilder,
			Observable observable) {
		this.eventPerformer = eventPerformer;
	}

	@Override
	public void keyPressed(KeyEvent keyEvent) {

	}

	public void keyRelease(KeyEvent keyEvent) {

	}

	@Override
	public void keyTyped(KeyEvent keyEvent) {

	}

	public void eventPerform(KeyEvent keyCode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
