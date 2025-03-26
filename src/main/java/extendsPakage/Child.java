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
        super.printName();
        //System.out.println(age); 부모의 age를 불러옴
    }

    @Override
    public void printAge(){
        super.printAge();
    }

    public void printOldest(){
        System.out.println(oldest);
    }
}
