package extendsPakage;

public class Parents {
    private String name;
    private int age;
    public Parents(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printName(){
        System.out.println(name);
    }

    public void printAge(){
        System.out.println(age);
    }

}
