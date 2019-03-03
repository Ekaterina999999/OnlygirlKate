package ru.mera.anisimova.postman;

import ru.mera.anisimova.postman.ImmutableEmail;
import ru.mera.anisimova.postman.ImmutableLetter;
import ru.mera.anisimova.postman.ImmutableMessage;
import ru.mera.anisimova.postman.ImmutablePerson;

public final class ImmutablePerson {
	private final String name;
	private final String surname;
	
	public ImmutablePerson(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + "]";
	}
	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	
	
}