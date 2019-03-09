package ru.mera.anisimova.ex6;

public abstract class CocktailMaker {
	public void mix() {
		liquid();
		mainIngredient();
		toping();
		System.out.println("Mix " + liquid() + " with " + mainIngredient() + " add on top " + toping());
	}

	public abstract String liquid();

	public abstract String mainIngredient();

	public abstract String toping();
}
