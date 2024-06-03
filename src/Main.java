public class Main {
    public static void main(String[] args) {

        Film minFilm = new Film("My Awesome Movie");
        Film minFilm2 = new Film("My Totally legit movie",2001);

        System.out.println(minFilm.getTitel() + " " + minFilm.getUdgivelsesår());

        System.out.println(minFilm2.getTitel() + " " + minFilm2.getUdgivelsesår());


    }
}