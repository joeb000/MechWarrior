package com.vlad.weapons;

public class MissilePod extends Weapon {
	
	private static int MISSILE_DAMAGE = 40;
	private static int MISSILE_ACCURACY = 50;

	@Override
	public void init() {
		setDamage(MISSILE_DAMAGE);
		setAccuracy(MISSILE_ACCURACY);
	}

}
