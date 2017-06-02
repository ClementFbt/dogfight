package jpu2016.dogfight.gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer {

	private final IGraphicsBuilder graphicsBuilder;

	public GamePanel(IGraphicsBuilder graphicsBuilder) {
		this.graphicsBuilder = graphicsBuilder;
	}

	/**
	 *
	 */
	private static final long serialVersionUID = 1521514564856159726L;

	@Override
	protected void paintComponent(final Graphics graphics) {
		this.graphicsBuilder.applyModelToGraphics(graphics, this);
	}

	@Override
	public void update(Observable o, Object arg) {
		this.repaint();
	}

}
