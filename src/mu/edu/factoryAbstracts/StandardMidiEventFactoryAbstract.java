package mu.edu.factoryAbstracts;

import mu.edu.factories.*;

public class StandardMidiEventFactoryAbstract implements MidiEventFactoryAbstract{
	/**
     * Creates and returns a new StandardMidiEventFactory instance.
     * This factory produces MIDI events with standard articulation,
     * where notes are played connected to each other without gaps.
     *
     * @return A new StandardMidiEventFactory instance
     * @see StandardMidiEventFactory
     */
	@Override
	public MidiEventFactory createFactory() {
		// TODO Auto-generated method stub
		return new StandardMidiEventFactory();
	}

	
}
