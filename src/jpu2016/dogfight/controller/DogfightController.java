package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.dogfight.model.Missile;
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
		this.missile = new Missile(null, null);
	}

	public Missile getMissile() {
		return this.missile;
	}

	@Override
	public void orderPerform(UserOrder userOrder) {
		switch (userOrder.getOrder()) {
		case DOWN:

			break;
		case UP:
			break;
		case RIGHT:
			break;
		case LEFT:
			break;
		case SHOOT:
			break;
		case NOP:
			break;
		default:
			break;
		}
	}

	private boolean isWeaponOnMobile(final IMobile mobile, final IMobile weapon) {
		if (((weapon.getPosition().getX() / weapon.getWidth()) >= (mobile.getPosition().getX() / weapon.getWidth()))
				&& ((weapon.getPosition().getX()
						/ weapon.getWidth()) <= ((mobile.getPosition().getX() + mobile.getWidth())
								/ weapon.getWidth()))) {
			if (((weapon.getPosition().getY() / weapon.getHeight()) >= (mobile.getPosition().getY()
					/ weapon.getHeight()))
					&& ((weapon.getPosition().getY()
							/ weapon.getHeight()) <= ((mobile.getPosition().getY() + mobile.getHeight())
									/ weapon.getHeight()))) {
				return true;
			}
		}
		return false;
	}

	public void play() {

	}

	public void setViewSystem(IViewSystem iViewSystem) {
		this.iViewSystem = iViewSystem;
	}

	public void gameLoop() {

	}

	public void launchMissile(int player) {
		this.player = player;
	}
}
