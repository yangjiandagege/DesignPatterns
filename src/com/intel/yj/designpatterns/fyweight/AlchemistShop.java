package com.intel.yj.designpatterns.fyweight;


import java.util.ArrayList;
import java.util.List;

import com.intel.yj.designpatterns.Result;

/**
 * 
 * AlchemistShop holds potions on its shelves.
 * It uses PotionFactory to provide the potions.
 * 
 */
public class AlchemistShop {

	private List<Potion> topShelf;
	private List<Potion> bottomShelf;

	public AlchemistShop() {
		topShelf = new ArrayList<Potion>();
		bottomShelf = new ArrayList<Potion>();
		fillShelves();
	}

	private void fillShelves() {

		PotionFactory factory = new PotionFactory();

		topShelf.add(factory.createPotion(PotionType.INVISIBILITY));
		topShelf.add(factory.createPotion(PotionType.INVISIBILITY));
		topShelf.add(factory.createPotion(PotionType.STRENGTH));
		topShelf.add(factory.createPotion(PotionType.HEALING));
		topShelf.add(factory.createPotion(PotionType.INVISIBILITY));
		topShelf.add(factory.createPotion(PotionType.STRENGTH));
		topShelf.add(factory.createPotion(PotionType.HEALING));
		topShelf.add(factory.createPotion(PotionType.HEALING));

		bottomShelf.add(factory.createPotion(PotionType.POISON));
		bottomShelf.add(factory.createPotion(PotionType.POISON));
		bottomShelf.add(factory.createPotion(PotionType.POISON));
		bottomShelf.add(factory.createPotion(PotionType.HOLY_WATER));
		bottomShelf.add(factory.createPotion(PotionType.HOLY_WATER));
	}

	public void enumerate() {

		Result.append("Enumerating top shelf potions\n");

		for (Potion p : topShelf) {
			p.drink();
		}

		Result.append("\nEnumerating bottom shelf potions\n");

		for (Potion p : bottomShelf) {
			p.drink();
		}
	}
}

