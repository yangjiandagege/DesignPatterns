package com.intel.yj.dp.builder;
//使用多个简单的对象一步一步构建成一个复杂的对象
import com.intel.yj.dp.Result;
import com.intel.yj.dp.builder.Hero.HeroBuilder;
public class BuilderApp {

	public static void test() {
		Hero mage = new HeroBuilder(Profession.MAGE, "Riobard")
				.withHairColor(HairColor.BLACK).
				withWeapon(Weapon.DAGGER).build();
		Result.append(mage.toString());
		
		Hero warrior = new HeroBuilder(Profession.WARRIOR, "Amberjill")
				.withHairColor(HairColor.BLOND)
				.withHairType(HairType.LONG_CURLY)
				.withArmor(Armor.CHAIN_MAIL)
				.withWeapon(Weapon.SWORD).build();
		Result.append(warrior.toString());

		Hero thief = new HeroBuilder(Profession.THIEF, "Desmond")
				.withHairType(HairType.BALD)
				.withWeapon(Weapon.BOW).build();
		Result.append(thief.toString());
		
	}

}
