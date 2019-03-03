package ru.mera.anisimova.person;
import ru.mera.anisimova.person.Artist;
import ru.mera.anisimova.person.Musician;
import java.util.Scanner;
//ÂÎÏĞÎÑ ÏÎ ÇÀÄÀÍÈŞ

public class Person {

	private String name;
	private String surname;
	private Artist style;
	private Musician instrument;
	
	
	
	public Person(String name, String surname, Artist style, Musician instrument) {
		super();
		this.name = name;
		this.surname = surname;
		this.style = style;
		this.instrument = instrument;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + "]";
	}
	
	public static void main(String[] args) {
		Person person[][] = new Person[256][3];
		Scanner input = new Scanner(System.in);
		for (int i=0;i<10;i++) {
			String tmp = input.next();
			
		}
		
 	}
	
}
