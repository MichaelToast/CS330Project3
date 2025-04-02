package mu.edu.strategy;

import javax.sound.midi.Track;

public class ElectricBassGuitarStrategy implements InstrumentStrategy{
	private static final int ELECTRIC_BASS_FINGER = 33;
    
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
