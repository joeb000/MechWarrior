package com.vlad.weapons;

public class MissilePod extends Weapon {
	
	private static int MISSILE_DAMAGE = 40;
	private static int MISSILE_ACCURACY = 50;
	private static String MISSILE_NAME = "Missiles";


	@Override
	public void init() {
		setDamage(MISSILE_DAMAGE);
		setAccuracy(MISSILE_ACCURACY);
		setWeaponName(MISSILE_NAME);
	}

}
