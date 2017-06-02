package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer {
	final private int				TIME_SLEEP	= 30;
	private int						dogfightModel;
	private int						player;
	private final IDogfightModel	idogfightModel;
	private IViewSystem				iViewSystem;
	private Missile					missile;

	public void setMissile(Missile missile) {
		this.missile = missile;
	}

	public DogfightController(final IDogfightModel idogfightModel) {
		this.idogfightModel = idogfightModel;
		this.missile = new Missile;
	}

	public Missile getMissile() {
		return this.missile;
	}

	@Override
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
