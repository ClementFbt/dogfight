package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.Observable;

import jpu2016.dogfight.gameframe.IGraphicsBuilder;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;

public class GraphicsBuilder implements IGraphicsBuilder {
	public GraphicsBuilder(IDogfightModel dogfightModel) {

	}

	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {

	}

	private void buildEmptySky() {

	}

	private void drawwMobile(IMobile mobile, Graphics graphics, ImageObserver observer) {

	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getGlobalWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getGlobalHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
}
