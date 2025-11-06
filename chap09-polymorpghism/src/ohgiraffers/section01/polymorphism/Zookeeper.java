package ohgiraffers.section01.polymorphism;

public class Zookeeper {

    public void feed(Cat cat){
        System.out.println("고양이에게");
        cat.eat();
    }
    public void feed(Tiger tiger){
        System.out.println("[호랑이에게]");
        tiger.eat();
        //
    }

}
