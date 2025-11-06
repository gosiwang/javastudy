package ohgiraffers.section03.interfaceimplements;

public interface IConectable {

    //모든 구현체가 공유해야 할 공통 규격 값(상수)을 정의할 수 있다.
    int MAX_CONNECTION_COUNT = 4;

    public abstract void connect();
    void disconnect();

    public default void showStatus(){
        System.out.println("장치가 대기 상태입니다.");

    }

}
