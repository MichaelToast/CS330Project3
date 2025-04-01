package mu.edu.factories;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public class StandardMidiEventFactory implements MidiEventFactory {

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
