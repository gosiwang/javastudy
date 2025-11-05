package ohgiraffers.section01.extend;

public class FireCar extends Car {

    public FireCar() {
        super(); //부모클래스의 생성자를 호출하는 구문(컴파일러가자동으로 추가)
        System.out.println("firecar의 기본 생성자 호출...");
    }
    /*
    * override 어노테인션
    *  부모 클래스로부터 물려받은*/

    @Override
    public void soundHorn(){
        if(isRunning()){
            System.out.println("빠아아아ㅏ아앙!!!!!!!");
        } else {
            System.out.println("소방차가 앞으로 갈수 없습니다. 비키세요 비키세요");
        }
    }

    public void sprayWater(){
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다.===============");
    }
}
