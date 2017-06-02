package jpu2016.dogfight.Model;

public interface IMobile {
	public Direction getDirection();
	public void setDirection(Direction direction);
	public Point getPosition();
	public int getWidth();
	public int getHeight();
	public int getSpeed();
	public Image getImage();
	public void move();
	public void placeInArea(IArea area);
	public boolean isPlayer(int player);
	public void setDogfightModel(DogfifghtModel dogfifghtModel);
	public boolean hit();
	public boolean isWeapon();
}
