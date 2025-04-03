package mu.edu.factories;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public class StandardMidiEventFactory implements MidiEventFactory {
	/**
     * Creates a MIDI event for a note-on message.
     * This method generates a standard NOTE_ON MIDI message at the specified tick
     * with the given note, velocity, and channel parameters.
     *
     * @param tick     The tick at which the note-on event should occur
     * @param note     The MIDI note number (0-127)
     * @param velocity The velocity (volume) of the note (0-127)
     * @param channel  The MIDI channel (0-15)
     * @return A MidiEvent containing a note-on message
     * @throws InvalidMidiDataException If any of the parameters are invalid for MIDI specification
     */
	@Override
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
		ShortMessage mess = null;
		try {
			mess = new ShortMessage(ShortMessage.NOTE_ON, channel, note, velocity);
		} catch (javax.sound.midi.InvalidMidiDataException e) {
			// Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		MidiEvent midi = new MidiEvent(mess, tick);
		
		return midi;
	}
	/**
     * Creates a MIDI event for a note-off message.
     * This method generates a standard NOTE_OFF MIDI message occurring 120 ticks
     * after the specified tick position with the given note and channel parameters.
     *
     * @param tick    The base tick from which to calculate the note-off event position
     * @param note    The MIDI note number (0-127) to turn off
     * @param channel The MIDI channel (0-15)
     * @return A MidiEvent containing a note-off message scheduled 120 ticks after the specified tick
     * @throws InvalidMidiDataException If any of the parameters are invalid for MIDI specification
     */
	@Override
	public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
		ShortMessage mess = null;
		try {
			mess = new ShortMessage(ShortMessage.NOTE_OFF, channel, note);
		} catch (javax.sound.midi.InvalidMidiDataException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
		MidiEvent midi = new MidiEvent(mess, tick + 120);
		
		return midi;
	}
    
}
