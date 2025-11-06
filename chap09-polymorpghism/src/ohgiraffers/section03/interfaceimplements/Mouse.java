package ohgiraffers.section03.interfaceimplements;

import java.sql.SQLOutput;

public class Mouse implements IConectable{
    @Override
    public void connect() {
        System.out.println("마우스가 usb포트에 연결되었씁니다.");
    }

    @Override
    public void disconnect() {
        System.out.println("마우스 연결을 해제합니다.");
    }
}
