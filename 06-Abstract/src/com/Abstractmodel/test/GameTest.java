package com.Abstractmodel.test;

import com.Abstractmodel.model.Archer;
import com.Abstractmodel.model.Gamecharacter;
import com.Abstractmodel.model.Warrior;

public class GameTest {
	public static void main(String[] args) {
		Gamecharacter[] characters = new Gamecharacter[2];

		characters[0] = new Warrior("Thor", 100);
		characters[1] = new Archer("Legolas", 80);

		for (int round = 1; round <= 2; round++) {
			System.out.println("Round " + round + " attacks:");
			for (Gamecharacter character : characters) {
				character.attack();
				System.out.println(character.getName() + " - Power Level: " + character.getPowerLevel());
			}
			System.out.println("-----------------------");
		}
	}
}
