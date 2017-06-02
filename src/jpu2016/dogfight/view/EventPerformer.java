package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;

public class EventPerformer implements IOrderPerformer {
	public IOrderPerformer	orderPerformer;
	public UserOrder		userOrder;

	public EventPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
		this.userOrder = new UserOrder(null, 0);
	}

	public void eventPerform(final KeyEvent keyCode) {
	}

	private int keyCodeToUserOrder(int keyCode) {
		return keyCode;
		// return UserOrder;
	}

	@Override
	public void orderPerform(UserOrder userOrder) {
		// TODO Auto-generated method stub

	}

}
