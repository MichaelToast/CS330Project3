package mu.edu.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import mu.edu.data.MidiEventData;
import mu.edu.parser.MidiCsvParser;
import mu.edu.factories.*;
import mu.edu.factoryAbstracts.*;
import javax.sound.midi.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("HELLO THERE!");
		List<MidiEventData>midiEvents = MidiCsvParser.parseCsv("./files/songy.csv");
		
		MidiEventFactoryAbstract factoryAbstract = null;
		MidiEventFactoryAbstract factoryAbstractTwo = new StandardMidiEventFactoryAbstract();
		//MidiEventFactoryAbstrct factoryAbstract = null;
		
		
		for (MidiEventData data: midiEvents) {
			System.out.println(data);
		}
		
		System.out.println("THANK YOU!!!!!");
	}
}
