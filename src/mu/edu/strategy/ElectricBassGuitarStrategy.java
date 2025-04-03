package mu.edu.strategy;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class ElectricBassGuitarStrategy implements InstrumentStrategy{
	private static final int ELECTRIC_BASS_FINGER = 33;
    
    /**
     * Applies the Electric Bass Guitar instrument sound to the specified MIDI track.
     * This method creates a PROGRAM_CHANGE MIDI message and adds it to the track.
     * 
     * @param track   The MIDI track to which the instrument sound will be applied
     * @param channel The MIDI channel on which to apply the instrument sound (0-15)
     * @see javax.sound.midi.ShortMessage#PROGRAM_CHANGE
     */
    @Override
    public void applyInstrument(Track track, int channel) {
        try {

            ShortMessage instrumentChange = new ShortMessage();
            instrumentChange.setMessage(ShortMessage.PROGRAM_CHANGE, channel, ELECTRIC_BASS_FINGER, 0);
            

            track.add(new MidiEvent(instrumentChange, 0));
            
            System.out.println("Applied Electric Bass Guitar (finger) to channel " + channel);
        } catch (InvalidMidiDataException e) {
            System.err.println("Error applying Electric Bass Guitar: " + e.getMessage());
        }
    }
}
