package mu.edu.factories;

import javax.sound.midi.MidiEvent;

public class LegatoMidiEventFactory implements MidiEventFactory{

	@Override
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
		// TODO Auto-generated method stub 
		/* Called with: track.add(factory.createNoteOn())
		 * track is a sequence
		 * */
		
		
		return null;
	}

	@Override
	public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
		// TODO Auto-generated method stub
		return null;
	}
    
}
