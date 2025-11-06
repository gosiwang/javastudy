package ohgiraffers.section03.interfaceimplements;

public class Computer {

    public void connectDevice(IConectable device){
        System.out.println("컴퓨터의 usb포트에 장치를 연결합니다.");
        device.connect();

    }
}
