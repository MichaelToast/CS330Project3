package mu.edu.factoryAbstracts;

import mu.edu.factories.*;

public class StandardMidiEventFactoryAbstract implements MidiEventFactoryAbstract{
	@Override
	public MidiEventFactory createFactory() {
		// TODO Auto-generated method stub
		return new StandardMidiEventFactory();
	}

	
}
