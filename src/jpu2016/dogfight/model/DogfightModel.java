package jpu2016.dogfight.model;

import java.util.ArrayList;

public class DogfightModel {
	public DogfightModel(){

	}
	public IArea getArea(){
		return new IArea();
	}
	public void buildArea(final Dimension dimension){

	}
	public void addMobile(final IMobile mobile){

	}
	public void removeMobile(final IMobile mobile){

	}
	public ArrayList<IMobile> getMobiles(){
		final ArrayList<IMobile> al = new ArrayList<IMobile>();
		return al;

	}
	public IMobile getMobileByPlayer(final int player){

	}
	public void setMobilesHavesMove(){

	}

}

