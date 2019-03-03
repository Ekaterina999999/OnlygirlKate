package ru.mera.anisimova.postman;

import ru.mera.anisimova.postman.ImmutableEmail;
import ru.mera.anisimova.postman.ImmutableLetter;
import ru.mera.anisimova.postman.ImmutableMessage;
import ru.mera.anisimova.postman.ImmutablePerson;

public final class ImmutableMessage {
	private final String from;
	private final String to;
	private final String message_body;
	private final ImmutableEmail email;
	private final ImmutableLetter letter;
	
	public ImmutableMessage(String from, String to, String message_body, ImmutableEmail email, ImmutableLetter letter) {
		super();
		this.from = from;
		this.to = to;
		this.message_body = message_body;
		this.email = email;
		this.letter = letter;
	}
	
	
	
	
}
