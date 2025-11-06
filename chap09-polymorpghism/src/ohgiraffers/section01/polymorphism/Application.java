package ohgiraffers.section01.polymorphism;

public class Application {
    public static void main(String[] args) {
        Zookeeper badZookeeper = new Zookeeper();
        badZookeeper.feed(new Cat());
        badZookeeper.feed(new Tiger());


        Animal a1 = new Cat();
        Animal a2 = new Tiger();



        a1.cry();
        a2.cry();

        ((Cat)a1).jump();

        a2.cry();
        System.out.println("a1은 Tiger타입인가?" + (a1 instanceof Tiger));
        if(a1 instanceof Tiger){
            System.out.println("a1은 고양이가 맞다 점프");
            ((Cat)a1).jump();
        }
        /*다형성을 활용한 객체 배열*/
        Animal [] animals = new Animal[5];
        animals[0]=new Cat();
        animals[1]=new Tiger();
        animals[2]=new Tiger();
        animals[3]=new Cat();
        animals[4]=new Tiger();


        for(Animal animal: animals){
            animal.cry();

        }

        for(Animal animal: animals){
            if (animal instanceof Cat){
                ((Cat)animal).jump();
            } else if (animal instanceof Tiger) {
                ((Tiger)animal).bite();
            }

        }


    }
}
