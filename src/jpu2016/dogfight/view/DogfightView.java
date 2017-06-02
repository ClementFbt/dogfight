package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;

public class DogfightView implements IViewSystem {
	public String Message;

	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {

	}

	@Override
	public void closeAll() {

	}

	public String displayMessage() {
		return this.Message;
	}

	private void run() {

	}

	@Override
	public String displayMessage(String Message) {
		// TODO Auto-generated method stub
		return null;
	}
}
