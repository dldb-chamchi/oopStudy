package abstractPakage;

public class Gram implements LabTop {

    @Override
    public void information() {
        System.out.println("Gram");
    }

    @Override
    public void power() {
        System.out.println("Gram On");
    }

    @Override
    public void shutDown() {
        System.out.println("Gram Off");
    }
}
