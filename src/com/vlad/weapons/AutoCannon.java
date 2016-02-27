package com.vlad.weapons;

public class AutoCannon extends Weapon {
	
	private static int CANNON_DAMAGE = 12;
	private static int CANNON_ACCURACY = 75;

	@Override
	public void init() {
		setDamage(CANNON_DAMAGE);
		setAccuracy(CANNON_ACCURACY);
	}

}
