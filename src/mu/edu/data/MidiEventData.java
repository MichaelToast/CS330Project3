package mu.edu.data;

public class MidiEventData {
    private int channel;
    private int note;
    private int startTick;
    private int noteOnOff;
    private int velocity;
    private int instrument;

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

////Getters
    public int getChannel() {
        return channel;
    }

    public int getNote() {    
        return note;
    }    

    public int getStartTick() {
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
    
////Setters
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