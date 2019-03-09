package ru.mera.anisimova.person;

public class Musician extends Person {
	private final String instrument;

	public String getInstrument() {
		return instrument;
	}

	 public Musician(String name, String surname, String style) {
	        super(name, surname);
	        this.instrument = style;
	    }


	
}
