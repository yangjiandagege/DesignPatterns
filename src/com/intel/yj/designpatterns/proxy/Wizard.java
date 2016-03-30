package com.intel.yj.designpatterns.proxy;

/**
 * 
 * Wizard
 *
 */
public class Wizard {

	private String name;

	public Wizard(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}

