package jpu2016.dogfight.model;

import java.util.ArrayList;

public class DogfightModel implements IDogfightModel{
	public DogfightModel(){

	}
	@Override
	public IArea getArea(){
		return null;

	}

	@Override
	public void addMobile(final IMobile mobile){

	}
	@Override
	public void removeMobile(final IMobile mobile){

	}
	@Override
	public ArrayList<IMobile> getMobiles(){
		final ArrayList<IMobile> al = new ArrayList<IMobile>();
		return al;

	}
	@Override
	public IMobile getMobileByPlayer(final int player){
		return null;

	}
	public void setMobilesHavesMove(){

	}
	@Override
	public void buildArea(final Dimension dimension) {
		// TODO Auto-generated method stub

	}
	@Override
	public void setMobilesHavesMoved() {
		// TODO Auto-generated method stub

	}
	@Override
	public void buildArea(final java.awt.Dimension dimension) {
		// TODO Auto-generated method stub

	}

}

