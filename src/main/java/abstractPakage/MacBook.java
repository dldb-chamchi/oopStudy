package abstractPakage;

public class MacBook implements LabTop {

    @Override
    public void information() {
        System.out.println("MackBook");
    }

    @Override
    public void power() {
        System.out.println("MackBook On");
    }

    @Override
    public void shutDown() {
        System.out.println("MackBook Off");
    }
}
