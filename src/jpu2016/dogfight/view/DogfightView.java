package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.gameframe.GameFrame;
import jpu2016.dogfight.gameframe.IEventPerformer;
import jpu2016.dogfight.model.IDogfightModel;

public class DogfightView implements IViewSystem, Runnable {
	private final EventPerformer	eventPerformer;
	private final GameFrame			gameFrame;
	private final GraphicsBuilder	graphicsBuilder;
	private final Observable		observable;

	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {

		this.observable = observable;
		this.graphicsBuilder = new GraphicsBuilder(dogfightModel);
		this.eventPerformer = new EventPerformer(orderPerformer);
		this.gameFrame = new GameFrame("Bonjour", this.getEventPerformer(), this.graphicsBuilder, observable);
	}

	private IEventPerformer getEventPerformer() {
		// TODO Auto-generated method stub
		return null;
	}

	public GameFrame getGameFrame() {
		return this.gameFrame;
	}

	public GraphicsBuilder getGraphicsBuilder() {
		return this.graphicsBuilder;
	}

	@Override
	public void closeAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	}

	@Override
	public String displayMessage(String message) {
		// TODO Auto-generated method stub
		return null;
	}
}
