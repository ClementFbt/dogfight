package jpu2016.dogfight.model;

import java.awt.Image;
import java.awt.Point;

public class Mobile implements IMobile {
	public int			speed;
	private Direction	direction;

	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return this.direction;
	}

	@Override
	public void setDirection(final Direction direction) {
		// TODO Auto-generated method stub
		this.direction = direction;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void placeInArea(final IArea area) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isPlayer(final int player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setDogfightModel(final DogfightModel dogfifghtModel) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}

	public Mobile(final Direction direction, final Position position, final Dimension dimension, final int speed,
			final String image) {
		this.setSpeed(speed);

	}

	public Dimension getDimension() {
		return null;

	}

	public void moveUp() {

	}

	public void moveDown() {

	}

	public void moveRight() {

	}

	public void moveLeft() {

	}

	public java.awt.Color getColor() {
		return null;

	}

	public IDogfightModel getDogfightModel() {
		return null;

	}
}
