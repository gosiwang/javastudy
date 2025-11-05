package ohgiraffers.section01.polymorphism;

public class Cat extends Animal {


    @Override
    public void eat() {
        System.out.println("고양이가 생선을 먹고있어");
    }

    @Override
    public void run() {
        System.out.println("고양이가 달려간다");
    }

    @Override
    public void cry() {
        System.out.println("고양이가 울음소리를 냅니다.");
    }
    public void jump(){
        System.out.println("고양이가 점프합니다. 점프~~");
    }
}
