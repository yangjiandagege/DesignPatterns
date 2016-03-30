package com.intel.yj.designpatterns.factorymethod;

import com.intel.yj.designpatterns.Result;

public class FactoryMethodApp {
	public static void test(){
		Blacksmith blacksmith;
		Weapon weapon;

		blacksmith = new OrcBlacksmith();
		weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
		Result.append(weapon.toString());
		weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
		Result.append(weapon.toString());

		blacksmith = new ElfBlacksmith();
		weapon = blacksmith.manufactureWeapon(WeaponType.SHORT_SWORD);
		Result.append(weapon.toString());
		weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
		Result.append(weapon.toString());
	}
}
