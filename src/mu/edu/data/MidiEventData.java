package mu.edu.data;

public class MidiEventData {
    private int channel;
    private int note;
    private int startTick;
    private int noteOnOff;
    private int velocity;
    private int instrument;
    /**
     * Constructs a new MidiEventData with all parameters specified.
     * 
     * @param channel    The MIDI channel (0-15)
     * @param note       The MIDI note number (0-127)
     * @param startTick  The tick position when this event should occur
     * @param noteOnOff  The type of event (NOTE_ON or NOTE_OFF)
     * @param velocity   The velocity (volume) of the note (0-127)
     * @param instrument The instrument program to use for this event
     */
    public MidiEventData(int channel, int note, int startTick, int noteOnOff, int velocity, int instrument) {
        this.channel = channel;
        this.note = note;
        this.startTick = startTick;
        this.noteOnOff = noteOnOff;
        this.velocity = velocity;
        this.instrument = instrument;
    }
    
    public MidiEventData() {
        this.channel = 0;
        this.note = 0;
        this.startTick = 0;
        this.noteOnOff = 0;
        this.velocity = 0;
        this.instrument = 0;
    }

  //Getters
    /**
     * Gets the MIDI channel for this event.
     * 
     * @return The MIDI channel (0-15)
     */
    public int getChannel() {
        return channel;
    }

    public int getNote() {    
        return note;
    }    

    public int getStartEndTick() {
    	// Think I did this right
        return startTick;
    }            

    public int getNoteOnOff() {
        return noteOnOff;
    }            

    public int getVelocity() {
        return velocity;
    }

    public int getInstrument() {
        return instrument;
    }
    
  //Setters
    /**
     * Sets the MIDI channel for this event.
     * 
     * @param channel The MIDI channel (0-15)
     */
    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public void setStartTick(int startTick) {
        this.startTick = startTick;
    }

    public void setNoteOnOff(int noteOnOff) {
        this.noteOnOff = noteOnOff;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public void setInstrument(int instrument) {
        this.instrument = instrument;
    }
    /**
     * Returns a string representation of this MidiEventData.
     * 
     * @return A string containing all the values of this object
     */
    @Override
    public String toString() {
        return "MidiEventData{" +
                "channel=" + channel +
                ", note=" + note +
                ", startTick=" + startTick +
                ", noteOnOff=" + noteOnOff +
                ", velocity=" + velocity +
                ", instrument=" + instrument +
                '}';
    }
}