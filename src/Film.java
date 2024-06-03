import java.time.LocalDate;

public class Film {

    private String titel;
    private int udgivelsesår;
    private Producer producer;

    public Film(String titel, int udgivelsesår) {
        this.titel = titel;
        this.udgivelsesår = udgivelsesår;
    }

    public Film(String titel) {
        this.titel = titel;
        this.udgivelsesår = LocalDate.now().getYear();
    }

    public void addProducer(Producer producer) {
        this.producer = producer;
    }

    public String getTitel() {
        return titel;
    }

    public int getUdgivelsesår() {
        return udgivelsesår;
    }



}
