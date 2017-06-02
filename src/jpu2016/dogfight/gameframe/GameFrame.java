package jpu2016.dogfight.gameframe;

import java.awt.event.KeyEvent;
import java.util.Observable;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements IEventPerformer {

	/**
	 *
	 */
	private static final long		serialVersionUID	= -9003193788598716910L;
	private IGraphicsBuilder		graphicBuilder;
	private final IEventPerformer	eventPerformer;
	public static String			title				= " ";

	public GameFrame(String title, IEventPerformer eventPerformer, IGraphicsBuilder graphicBuilder,
			Observable observable) {
		this.eventPerformer = eventPerformer;
	}

	public void keyPressed(KeyEvent keyEvent) {

	}

	public void keyRelease(KeyEvent keyEvent) {

	}

	public void keyTyped(KeyEvent keyEvent) {

	}

	@Override
	public void eventPerform(KeyEvent keyCode) {
		// TODO Auto-generated method stub

	}

}
