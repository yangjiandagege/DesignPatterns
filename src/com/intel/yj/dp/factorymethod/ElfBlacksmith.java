package com.intel.yj.dp.factorymethod;

/**
 * 
 * Concrete subclass for creating new objects.
 * 
 */
public class ElfBlacksmith implements Blacksmith {

	public Weapon manufactureWeapon(WeaponType weaponType) {
		return new ElfWeapon(weaponType);
	}

}


