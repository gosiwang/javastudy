package ohgiraffers.section02.abstractclass;

public class Application {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Wizard wizard = new Wizard();

        warrior.attack();
        wizard.attack();

        //Player player = new Player(); 추상클래스는 직접 객체 생성 불가
        //다형성을 적용하기 위한 완벽한 조건이다.
        Player[] players = new Player[2];
        players[0]=new Warrior();
        players[1]=new Wizard();

        for(Player player : players){
            player.attack();
            player.levelUp();
        }
    }
}
