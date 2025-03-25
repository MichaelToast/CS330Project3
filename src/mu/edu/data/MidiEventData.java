package mu.edu.data;

public class MidiEventData {
    private int channel;
    private int note;
    private int startTick;
    private int endTick;
    private int velocity;
    private int instrument;

    public MidiEventData(int channel, int note, int startTick, int endTick, int velocity, int instrument) {
        this.channel = channel;
        this.note = note;
        this.startTick = startTick;
        this.endTick = endTick;
        this.velocity = velocity;
        this.instrument = instrument;
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

    public int getEndTick() {
        return endTick;
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

    public void setEndTick(int endTick) {
        this.endTick = endTick;
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
                ", endTick=" + endTick +
                ", velocity=" + velocity +
                ", instrument=" + instrument +
                '}';
    }
}