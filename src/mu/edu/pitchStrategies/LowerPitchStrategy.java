package mu.edu.pitchStrategies;

public class LowerPitchStrategy implements PitchStrategy{
	/**
     * Decreases the pitch of a MIDI note by 2 semitones.
     * 
     * @param note The original MIDI note value (0-127)
     * @return The modified MIDI note value, decreased by 2 semitones
     */
	public int modifyPitch(int note) {
		return note - 2;
	}

}
