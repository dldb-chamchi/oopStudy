package abstractPakage;

public class Main {
    public static void main(String[] args) {
        MackBook mackBook = new MackBook();
        mackBook.information();
        mackBook.power();
        mackBook.shutDown();

        System.out.println();

        Gram gram = new Gram();
        gram.information();
        gram.power();
        gram.shutDown();
    }

}
