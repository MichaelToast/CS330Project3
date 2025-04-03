package mu.edu.factories;

import javax.sound.midi.MidiEvent;

public interface MidiEventFactory {
	/**
     * Creates a MIDI event for a note-on message.
     * 
     * @param tick     The tick at which the note-on event should occur
     * @param note     The MIDI note number (0-127)
     * @param velocity The velocity (volume) of the note (0-127)
     * @param channel  The MIDI channel (0-15)
     * @return A MidiEvent containing a note-on message
     * @throws InvalidMidiDataException If any of the parameters are invalid for MIDI specification
     */
	MidiEvent createNoteOn(int tick, int note,int velocity,int channel) throws InvalidMidiDataException;
	/**
     * Creates a MIDI event for a note-off message.
     * The exact timing of the note-off event may vary depending on the implementation
     * to achieve different articulation effects.
     * 
     * @param tick    The base tick from which to calculate the note-off event position
     * @param note    The MIDI note number (0-127) to turn off
     * @param channel The MIDI channel (0-15)
     * @return A MidiEvent containing a note-off message
     * @throws InvalidMidiDataException If any of the parameters are invalid for MIDI specification
     */
	MidiEvent createNoteOff(int tick,int note,int channel) throws InvalidMidiDataException;
}
