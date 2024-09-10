public class Application {
    public static void main(String[] args) {
        ATM client = new ATM();
        // client.request();
        // client.checkAcc();
        // client.accept();
        client.withdraw();
        client.thanks();
        client.passCard();
        client.passPin(1234);
        client.quantity(400);
        client.run();
    }
}

abstract class Bank {
    abstract protected void passCard();

    abstract protected int passPin(int pin);

    abstract protected int quantity(int qua);

    abstract protected void withdraw();

    abstract protected void thanks();

    private void request() {
        System.out.println("Przyjęcie prośby do banku");
    }

    private void checkAcc() {
        System.out.println("Podaj stan konta");
    }

    private void accept() {
        System.out.println("Potwierdzenie możliwości wypłaty");
    }

    public void run() {
        this.request();
        this.checkAcc();
        this.accept();
    }
}

class ATM extends Bank {
    protected void withdraw() {
        System.out.println("Wypłata gotówki");
    }

    protected void thanks() {
        System.out.println("Dziękujemy za skorzystanie z bankomatu");
    }

    protected void passCard() {
        System.out.println("Włóż kartę");
    }

    protected int passPin(int pin) {
        return pin;
    }

    protected int quantity(int quo) {
        return quo;
    }

}
