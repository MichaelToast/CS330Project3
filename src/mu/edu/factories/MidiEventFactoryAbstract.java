package mu.edu.factories;

public interface MidiEventFactoryAbstract {
	/**
     * Creates and returns a concrete MidiEventFactory.
     * Implementations will return different types of MidiEventFactory objects
     * that create MIDI events with specific articulation characteristics.
     * 
     * @return A concrete implementation of MidiEventFactory
     */
	MidiEventFactory createFactory();
}
