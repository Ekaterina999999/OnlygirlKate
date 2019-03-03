package ru.mera.anisimova.postman;

import ru.mera.anisimova.postman.ImmutableEmail;
import ru.mera.anisimova.postman.ImmutableLetter;
import ru.mera.anisimova.postman.ImmutableMessage;
import ru.mera.anisimova.postman.ImmutablePerson;

public final class ImmutableEmail {
	private final String from;
	private final String to;
	private final String message_body;
	private final String receive_date;
	
	public ImmutableEmail(String from, String to, String message_body, String receive_date) {
		super();
		this.from = from;
		this.to = to;
		this.message_body = message_body;
		this.receive_date = receive_date;
	}

	@Override
	public String toString() {
		return "ImmutableEmail [from=" + from + ", to=" + to + ", message_body=" + message_body + ", receive_date="
				+ receive_date + "]";
	}
	
	
}
