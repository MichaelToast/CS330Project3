package mu.edu.pitchStrategies;

public class LowerPitchStrategy implements PitchStrategy{
	public int modifyPitch(int note) {
		return note - 2;
	}

}
