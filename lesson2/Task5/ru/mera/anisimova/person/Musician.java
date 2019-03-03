package ru.mera.anisimova.person;

import javax.sound.midi.Instrument;

public class Musician {
	public Instrument instrument;

	public Musician(Instrument instrument) {
		super();
		this.instrument = instrument;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
	
}
