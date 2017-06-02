package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer {
	final private int				TIME_SLEEP	= 30;
	private int						dogfightModel;
	private int						player;
	private final IDogfightModel	idogfightModel;
	private IViewSystem				iViewSystem;

	public DogfightController(final IDogfightModel idogfightModel) {
		this.idogfightModel = idogfightModel;
	}

	public void orderPerform(UserOrder userOrder) {

	}

	public void play() {

	}

	public void setiViewSystem(IViewSystem iViewSystem) {
		this.iViewSystem = iViewSystem;
	}

	public void gameLoop() {

	}

	public void launchMissile(int player) {
		this.player = player;
	}
}
