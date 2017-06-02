package jpu2016.dogfight.model;

public class Position {
	double x;
	double y;
	double maxX;
	double maxY;

	public Position(final double x, final double y, final double maxX, final double maxY){

	}

	public Position(final Position position){

	}

	public double getX() {
		return this.x;
	}

	public void setX(final double x) {
		this.x = x;
	}

	public double getY() {
		return this.y;
	}

	public void setY(final double y) {
		this.y = y;
	}

	protected void setMaxX(final double maxX) {
		this.maxX = maxX;
	}

	protected void setMaxY(final double maxY) {
		this.maxY = maxY;
	}

}
