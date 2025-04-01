package mu.edu.factories;

import javax.sound.midi.MidiEvent;

public interface MidiEventFactory {
	MidiEvent createNoteOn(int tick, int note,int velocity,int channel) throws InvalidMidiDataException;
	MidiEvent createNoteOff(int tick,int note,int channel) throws InvalidMidiDataException;
}
