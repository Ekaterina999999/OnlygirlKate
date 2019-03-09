package ru.mera.anisimova.person;
import ru.mera.anisimova.person.*;

public class Artist extends Person{
	private final String style;

	public String getStyle() {
		return style;
	}



	 public Artist(String name, String surname, String style) {
	        super(name, surname);
	        this.style = style;
	    }

}
