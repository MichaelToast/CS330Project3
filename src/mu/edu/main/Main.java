package mu.edu.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import mu.edu.data.MidiEventData;
import mu.edu.parser.MidiCsvParser;

public class Main {

	public static void main(String[] args) {
		System.out.println("HELLO THERE!");
		List<MidiEventData>midiEvents = MidiCsvParser.parseCsv("./files/songy.csv");
		
		
		for (MidiEventData data: midiEvents) {
			System.out.println(data);
		}
		
		System.out.println("THANK YOU!!!!!");
	}
}
