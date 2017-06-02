package jpu2016.dogfight.model;

public class Missile extends Mobile {
	private static int		SPEED					= 4;
	private static int		WIDTH					= 30;
	private static int		HEIGHT					= 10;
	private static int		MAX_DISTANCE_TRAVELED	= 1400;
	private static String	IMAGE					= "missile";
	private final int		distanceTraveled		= 0;
	// test

	public Missile(final Direction direction, final Position position) {
		super(direction, position, new Dimension(Missile.WIDTH, Missile.HEIGHT), Missile.SPEED, Missile.IMAGE);
	}

	public int getWidthWithADirection(final Direction direction) {
		return this.distanceTraveled;

	}

	public int getHeightWithADirection(final Direction direction) {
		return this.distanceTraveled;

	}

	@Override
	public void move() {

	}

	@Override
	public boolean isWeapon() {
		return true;

	}
}
