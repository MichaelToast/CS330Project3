package mu.edu.factoryAbstracts;

import mu.edu.factories.*;

public class StaccatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract{
	/**
     * Creates and returns a new StaccatoMidiEventFactory instance.
     * This factory produces MIDI events with staccato articulation,
     * where notes are played connected to each other without gaps.
     *
     * @return A new StaccatoMidiEventFactory instance
     * @see StaccatooMidiEventFactory
     */
	@Override
	public MidiEventFactory createFactory() {
		// TODO Auto-generated method stub
		return new StaccatoMidiEventFactory();
	}

}
