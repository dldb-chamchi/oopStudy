package extendsPakage;

public class Main {
    public static void main(String[] args) {
        Parents child = new Child("이름", 10, 1); //다향성
        child.printName();
        child.printAge();
        //child.printOldest 결정은 부모 메소드로 실제 실행은 자식 메소드로

        //child.name = "이름2" 캡슐화(밖에서 private 데이터를 수정 불가)
    }

}
