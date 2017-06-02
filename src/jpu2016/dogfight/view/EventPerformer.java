package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.dogfight.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer {
	public IOrderPerformer	orderPerformer;
	public UserOrder		userOrder;

	public EventPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
		this.userOrder = new UserOrder(null, 0);
	}

	@Override
	public void eventPerform(final KeyEvent keyCode) {
	}

	private int keyCodeToUserOrder(int keyCode) {
		return keyCode;
		// return UserOrder;
	}

	public void orderPerform(UserOrder userOrder) {
		// TODO Auto-generated method stub

	}

}
