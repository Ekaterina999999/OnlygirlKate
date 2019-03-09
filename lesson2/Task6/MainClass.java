package ru.mera.anisimova.ex6;

import ru.mera.anisimova.ex6.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CocktailMaker[] cocktailMaker = { new BananaMilkCocktailMaker(), new GrapesAppleJuiceVolMaker(), new RaspberriesTonicJuiceCocktailMaker() };
		for (CocktailMaker c : cocktailMaker) {
			c.mix();
		}
	}

}
