package ohgiraffers.section02.superkeyword;

public class Application {
    public static void main(String[] args) {

        Product product = new Product();
        System.out.println(product.getInformation());

        Product product2 = new Product("S-0203","갤럭시",23000000);
        System.out.println(product2.getInformation());

        Computer computer = new Computer("s-0123","갤럭시",2300000,"513",12);;

        System.out.println(computer.getInformation());

        SmartPhone smartPhone = new SmartPhone("s-0123","갤럭시",2300000,"40000","nvidia");
        System.out.println(smartPhone.getInformation());

    }
}
