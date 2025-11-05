package ohgiraffers.section03.interfaceimplements;

public class Keyboard implements IConectable{

    @Override
    public void connect() {
        System.out.println("키보드가 usb포트에 연결되었씁니다.");
    }

    @Override
    public void disconnect() {
        System.out.println("키보드 연결을 해제합니다.");
    }
}
