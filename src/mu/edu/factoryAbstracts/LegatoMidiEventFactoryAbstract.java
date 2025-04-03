package mu.edu.factoryAbstracts;

import mu.edu.factories.*;

public class LegatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract {
	@Override
	public MidiEventFactory createFactory() {
		// TODO Auto-generated method stub
		return new LegatoMidiEventFactory();
	}

}
