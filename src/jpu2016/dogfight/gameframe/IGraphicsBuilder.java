package jpu2016.dogfight.gameframe;

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.Observer;

public interface IGraphicsBuilder extends Observer {

	public void applyModelToGraphics(Graphics graphics, ImageObserver observer);

	public int getGlobalWidth();

	public int getGlobalHeight();
}
