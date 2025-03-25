package abstractPakage;

public class Main {
    public static void main(String[] args) {
        MacBook macBook = new MacBook();
        macBook.information();
        macBook.power();
        macBook.shutDown();

        System.out.println();

        Gram gram = new Gram();
        gram.information();
        gram.power();
        gram.shutDown();
    }

}
