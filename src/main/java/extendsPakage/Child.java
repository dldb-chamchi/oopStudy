package extendsPakage;

public class Child extends Parents {
    private String name;
    private int age;
    private int oldest;
    public Child(String name, int age, int oldest) {
        super(name, age);
        this.oldest = oldest;
    }

    @Override
    public void printName(){
        System.out.println(name);
    }

    @Override
    public void printAge(){
        System.out.println(age);
    }

    public void printOldest(){
        System.out.println(oldest);
    }
}
