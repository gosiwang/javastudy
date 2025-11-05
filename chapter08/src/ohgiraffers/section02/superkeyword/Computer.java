package ohgiraffers.section02.superkeyword;

public class Computer extends Product {

    private String cpu;
    private int ram;

    public Computer(){
        super();
        System.out.println("Computer 기본 생성자 호출");
    }

    public Computer(String code, String name, int price, String cpu, int ram){
        super(code,name,price);
        this.cpu =cpu;
        this.ram = ram;
        System.out.println("Computer 클래스의 부모필드도 초기화하는 생성자 호출함");
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    public String getInformation(){

        String prentInfo = super.getInformation();

        String computerInfo = ", Computer [cpu=" +cpu + ", ram=" +ram + "]";

        return prentInfo +computerInfo;
    }
    }
    // super.getInformation() 부모가 만들어주는 문자열을 먼저 가져온다.

