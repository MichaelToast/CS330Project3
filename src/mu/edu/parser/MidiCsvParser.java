package mu.edu.parser;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
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
		List<MidiEventData> midiEvents = null; 
		
		try {
			filereader = new FileReader(csvFile);
			br = new BufferedReader(filereader);
			String line;
			
			while ((line = br.readLine()) != null) {
				String[] vals = line.split(",");
				for (String item: vals) {
					System.out.print(item.replace(" ", "") + ", ");
				}
				System.out.print("\n");
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


/*
 Usage: List <MidiEventData> midiEvents=MidiCsvParser.parseCsv(”./files/mysterysong.csv”);
 
 The CSV parser (MidiCsvParser ) should read each line, split the values by commas,
and create MidiEventData objects.
 
 
 */