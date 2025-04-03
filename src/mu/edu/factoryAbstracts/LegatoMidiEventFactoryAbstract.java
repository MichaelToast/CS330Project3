package mu.edu.factoryAbstracts;

import mu.edu.factories.*;

public class LegatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract {
	/**
     * Creates and returns a new LegatoMidiEventFactory instance.
     * This factory produces MIDI events with legato articulation,
     * where notes are played connected to each other without gaps.
     *
     * @return A new LegatoMidiEventFactory instance
     * @see LegatoMidiEventFactory
     */
	@Override
	public MidiEventFactory createFactory() {
		return new LegatoMidiEventFactory();
	}

}
