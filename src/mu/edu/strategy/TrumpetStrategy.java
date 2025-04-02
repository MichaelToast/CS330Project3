package mu.edu.strategy;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class TrumpetStrategy implements InstrumentStrategy{
	private static final int TRUMPET = 56;
    
    @Override
    public void applyInstrument(Track track, int channel) {
        try {

            ShortMessage instrumentChange = new ShortMessage();
            instrumentChange.setMessage(ShortMessage.PROGRAM_CHANGE, channel, TRUMPET, 0);
            

            track.add(new MidiEvent(instrumentChange, 0));
            
            System.out.println("Applied Trumpet to channel " + channel);
        } catch (InvalidMidiDataException e) {
            System.err.println("Error applying Trumpet: " + e.getMessage());
        }
    }
}
