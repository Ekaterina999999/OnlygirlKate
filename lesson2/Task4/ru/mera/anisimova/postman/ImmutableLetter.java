package ru.mera.anisimova.postman;

import ru.mera.anisimova.postman.ImmutableEmail;
import ru.mera.anisimova.postman.ImmutableLetter;
import ru.mera.anisimova.postman.ImmutableMessage;
import ru.mera.anisimova.postman.ImmutablePerson;

public final class ImmutableLetter {
	
	private final String to;
	private final String message_body;
	private final String fromPostalIndex;
	private final String toPostalIndex;
	private final String from;
	
	public ImmutableLetter(String from, String to, String message_body, String fromPostalIndex, String toPostalIndex) {
		super();
		this.from = from;
		this.to = to;
		this.message_body = message_body;
		this.fromPostalIndex = fromPostalIndex;
		this.toPostalIndex = toPostalIndex;
	}

	@Override
	public String toString() {
		return "ImmutableLetter [to=" + to + ", message_body=" + message_body + ", fromPostalIndex=" + fromPostalIndex
				+ ", toPostalIndex=" + toPostalIndex + ", from=" + from + "]";
	}
	
	
	
}
