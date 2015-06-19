import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class Instrumentalist implements Performer {

    private Instrument instrument;
    private String song;

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void perform() throws PerformanceException {

        if(song.equals("Song")) throw new PerformanceException();

        System.out.print("Playing " + song+" - ");
        instrument.play();

    }
}
