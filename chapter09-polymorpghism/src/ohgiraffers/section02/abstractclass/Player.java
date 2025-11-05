package ohgiraffers.section02.abstractclass;


//abstract : 이 클래스는 미완성 설걔또입니다. 직접 객체를 만들 수 없습니다.
public abstract class Player {
//    public void attack(){
//        System.out.println("플레이어가 공격합니다.");
    //}
    public abstract void attack();

    public void levelUp(){
        System.out.println("레벨업!!");
    }
}
