import java.time.LocalDate;

public class Film {

    private String titel;
    private int udgivelses�r;
    private Producer producer;

    public Film(String titel, int udgivelses�r) {
        this.titel = titel;
        this.udgivelses�r = udgivelses�r;
    }

    public Film(String titel) {
        this.titel = titel;
        this.udgivelses�r = LocalDate.now().getYear();
    }

    public void addProducer(Producer producer) {
        this.producer = producer;
    }

    public String getTitel() {
        return titel;
    }

    public int getUdgivelses�r() {
        return udgivelses�r;
    }



}
