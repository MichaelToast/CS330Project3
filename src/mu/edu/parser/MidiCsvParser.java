package mu.edu.parser;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import mu.edu.data.MidiEventData;

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
				 MidiEventData(int channel, int note, int startTick, int endTick, int velocity, int instrument)
				 StartEndTick, Note on off, channel, note, instrument
					0			1			2		3		4 
				 */
				if (vals[1].replace(" ", "").equals("Note_on_c")) {
					// We have been given the opening duration of this note. 
					midiEvents.add(new MidiEventData(
							Integer.parseInt(vals[2]), 
							Integer.parseInt(vals[3]), 
							Integer.parseInt(vals[0]), 
							0, 0, 
							Integer.parseInt(vals[4]) ) );
				}
				else {
					// We have been given the closing duration of this note. 
					midiEvents.get(midiEvents.size() - 1).setEndTick(Integer.parseInt(vals[0]));
					
				}
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
