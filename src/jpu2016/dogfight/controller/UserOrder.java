package jpu2016.dogfight.controller;

public class UserOrder implements IUserOrder {
	private int		player;
	private Order	order;

	public UserOrder(final Order order, final int player) {
		this.setOrder(order);
		this.setPlayer(player);
	}

	@Override
	public int getPlayer() {
		return this.player;
	}

	@Override
	public Order getOrder() {
		return this.order;
	}

	public void setPlayer(int player) {
		this.player = player;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}
