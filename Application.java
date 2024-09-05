class User {
    private String imie;
    private String nazwisko;
    private String plec;
    private int wiek;
    private String mail;

    public User(String imie, String nazwisko, String plec, int wiek, String mail) { // Konstruktor trż musi być
                                                                                    // publiczny
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.wiek = wiek;
        this.mail = mail;
    }

    public void login() {
    }

    public void logout() {
    }

    public String getImie() {
        return this.imie + this.nazwisko;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public String getPlec() {
        return this.plec;
    }

    public int getWiek() {
        return this.wiek;
    }

    public String getMail() {
        return this.mail;
    }
}

class ForumUser extends User {
    private String nazwaUzytkownika;
    private int liczbaPostow;
    private boolean zalogowany;

    ForumUser(String imie, String nazwisko, String plec, int wiek, String mail, String nazwaUzytkownika,
            int liczbaPostow, boolean zalogowany) {
        super(imie, nazwisko, plec, wiek, mail);
        this.nazwaUzytkownika = nazwaUzytkownika;
        this.liczbaPostow = liczbaPostow;
        this.zalogowany = zalogowany;
    }

    public void koment() {

    }

}

public class Application {
    public static void main(String[] args) {
        ForumUser uzytkownik = new ForumUser("Robert", "Wyszynski", "male", 32, "rob@rob.pl", "Robco", 30, true);

        String wart = uzytkownik.getImie();
        System.out.println(wart);
    }
}ttt