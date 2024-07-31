package org.bike;

public class Ktm implements Bike{

	@Override
	public void cost() {
		System.out.println("Cost : 100000");
	}

	@Override
	public void speed() {
		System.out.println("Speed : 25km/hour");
	}
	public static void main(String []args) {
		Ktm k=new Ktm();
		k.cost();
		k.speed();
	}

}
