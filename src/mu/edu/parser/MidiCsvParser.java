package mu.edu.parser;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import mu.edu.data.MidiEventData;
import javax.sound.midi.ShortMessage;

public class MidiCsvParser {
	/* May need to be abstract */
	private FileReader filereader;
	private BufferedReader br;
	private List<MidiEventData> midiEvents; 
	
	public MidiCsvParser () {
		//
	}
	
	public static List<MidiEventData> parseCsv(String csvFile) {
		FileReader filereader = null;
		BufferedReader br = null;
		List<MidiEventData> midiEvents = new ArrayList<>(); 
		
		try {
			filereader = new FileReader(csvFile);
			br = new BufferedReader(filereader);
			String line;
			
			while ((line = br.readLine()) != null) {
				String[] vals = line.split(",");
				/*
				 MidiEventData(int channel, int note, int startTick, int noteOnOff, int velocity, int instrument)
				 StartEndTick, Note on off, channel, note, velocity, instrument
					0			1			2		  3		4			5
				 */

				midiEvents.add(new MidiEventData(
						Integer.parseInt(vals[2]), 
						Integer.parseInt(vals[3]), 
						Integer.parseInt(vals[0]), 
						( (vals[1].replace(" ", "").equals("Note_on_c")) ?  ShortMessage.NOTE_ON : ShortMessage.NOTE_OFF), 
						Integer.parseInt(vals[4]),
						Integer.parseInt(vals[5]) ) );
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return midiEvents;
	}
    
}
