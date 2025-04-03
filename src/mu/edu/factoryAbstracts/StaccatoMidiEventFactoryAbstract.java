package mu.edu.factoryAbstracts;

import mu.edu.factories.*;

public class StaccatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract{
	@Override
	public MidiEventFactory createFactory() {
		// TODO Auto-generated method stub
		return new StaccatoMidiEventFactory();
	}

}
