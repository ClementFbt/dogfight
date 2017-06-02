package jpu2016.dogfight.controller;

;
public class DogfightController {
	final private int				TIMESLEEP	= 30;
	private int						dogfightModel;
	private int						player;
	private final IDogfightModel	idogfightModel;

	public DogfightController(IDogfightModel idogfightModel) {

	}

	public void launchMissile(int player) {
		this.player = player;
		;
	}
}
