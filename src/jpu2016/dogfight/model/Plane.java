package jpu2016.dogfight.model;

public class Plane extends Mobile{
	public static int SPEED = 2;
	public static int WIDTH = 100;
	public static int HEIGHT = 30;
	public Plane(final int player, final Direction direction, final Position position, final String image) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, image);
		// TODO Auto-generated constructor stub
	}
	public Plane(final Direction direction, final Position position, final Dimension dimension, final int speed, final String image) {
		super(direction, position, dimension, speed, image);

	}
	@Override
	public boolean isPlayer(final int player){
		return false;

	}
	@Override
	public boolean hit(){
		return false;
	}

}
