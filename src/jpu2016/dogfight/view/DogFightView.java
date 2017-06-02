package jpu2016.dogfight.view;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;

public class DogFightView implements IViewSystem{
	public String Message;
	public DogFightView(IOrderPerformer orderPerformer,IDogfightModel dogfightModel,Observable observable){

	}
	@Override
	public void closeAll(){

	}
	public String displayMessage(){
		return this.Message;
	}
	private void run(){

	}
}
