package ohgiraffers.section02.superkeyword;

public class SmartPhone extends Product {
    private String battery;
    private String gpu;

    public SmartPhone() {
        super();
        System.out.println("SmartPhone 기본 생성자 호출");
    }

    public SmartPhone(String code, String name, int price, String battery, String gpu) {
        super(code,name,price);
        this.battery = battery;
        this.gpu = gpu;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getInformation(){

        String prentInfo = super.getInformation();

        String SmartPhoneInfo = ", SmartPhone [battery=" +battery + ", gpu=" +gpu+ "]";

        return prentInfo +SmartPhoneInfo;
    }
}

