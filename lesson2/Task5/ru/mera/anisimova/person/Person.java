package ru.mera.anisimova.person;
import ru.mera.anisimova.person.Artist;
import ru.mera.anisimova.person.Musician;
import java.util.Scanner;


public class Person {

	private String name;
	private String surname;
	
	public Person(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + "]";
	}
	
		
}
