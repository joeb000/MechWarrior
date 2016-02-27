package com.vlad.weapons;

public class Laser extends Weapon {
	
	private static int LASER_DAMAGE = 5;
	private static int LASER_ACCURACY = 95;


	@Override
	public void init() {
		setDamage(LASER_DAMAGE);
		setAccuracy(LASER_ACCURACY);
	}
	

}
