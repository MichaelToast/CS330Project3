package mu.edu.pitchStrategies;

public interface PitchStrategy {
	/**
     * Modifies the pitch value of a MIDI note according to the implemented strategy.
     * 
     * @param note The original MIDI note value (0-127)
     * @return The modified MIDI note value after applying the pitch strategy
     */
    int modifyPitch(int note);
}
