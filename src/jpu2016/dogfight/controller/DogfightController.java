package jpu2016.dogfight.controller;

import com.sun.javafx.scene.traversal.Direction;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.dogfight.model.Missile;
import jpu2016.dogfight.model.Mobile;
import jpu2016.dogfight.model.Plane;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer {
	final private int				TIME_SLEEP	= 30;
	private int						player;
	private final IDogfightModel	dogfightModel;
	private IViewSystem				iViewSystem;
	private Missile					missile;
	private Mobile					mobile;
	private Plane					plane;

	public void setMissile(Missile missile) {
		this.missile = missile;
	}

	public DogfightController(final IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
		this.missile = new Missile(null, null);
	}

	public Missile getMissile() {
		return this.missile;
	}

	@Override
	public void orderPerform(UserOrder userOrder) {
		if (userOrder != null) {
			final IMobile plane = this.dogfightModel.getMobileByPlayer(userOrder.getPlayer());
			if (plane != null) {
				final Direction direction;
				switch (userOrder.getOrder()) {
				case DOWN:
					// plane.setDi);
					;
					break;
				case UP:
					break;
				case RIGHT:
					break;
				case LEFT:
					break;
				case SHOOT:
					this.launchMissile(userOrder.getPlayer());
					break;
				case NOP:
					break;
				default:
					break;
				}
			}
		}
	}

	public IDogfightModel getDogfightModel() {
		return this.dogfightModel;
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
