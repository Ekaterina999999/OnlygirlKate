package ru.mera.anisimova.person;

import java.util.*;

import java.util.ArrayList;
import java.util.Scanner;

import ru.mera.anisimova.person.Artist;
import ru.mera.anisimova.person.Musician;
import ru.mera.anisimova.person.Person;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<Person> empRecords = new ArrayList<Person>();
		
		for (int i = 0; i < 3; i++) {
			empRecords.add(i, new Artist(getNames(Name.class).toString(), getNames(Surname.class).toString(), getNames(Style.class).toString()));
        }
		for (int i = 3; i < 10; i++) {
            empRecords.add(i, new Musician(getNames(Name.class).toString(), getNames(Surname.class).toString(), getNames(Instruments.class).toString()));
        }
		for (int i = 0; i < empRecords.size(); i++) {
            if (empRecords.get(i) instanceof Artist) {
                System.out.println(empRecords.get(i) + " рисует в стиле " + ((Artist) empRecords.get(i)).getStyle());
            }
            else System.out.println(empRecords.get(i) + " играет на " + ((Musician)empRecords.get(i)).getInstrument());
        }
	}
	public static String[] getNames(Class<? extends Enum<?>> e) {
		 return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
	}
}
