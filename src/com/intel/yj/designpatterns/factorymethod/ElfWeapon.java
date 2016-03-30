package com.intel.yj.designpatterns.factorymethod;

/**
 * 
 * ElfWeapon
 *
 */
public class ElfWeapon implements Weapon {

	private WeaponType weaponType;

	public ElfWeapon(WeaponType weaponType) {
		this.weaponType = weaponType;
	}

	@Override
	public String toString() {
		return "Elven " + weaponType;
	}

}

