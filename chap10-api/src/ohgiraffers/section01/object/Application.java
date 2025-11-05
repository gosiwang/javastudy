package ohgiraffers.section01.object;

public class Application {
    public static void main(String[] args) {

        Book book1 = new Book(1,"홍길동전", "허균",40000);
        Book book2 = new Book(2,"목민심서", "정약용",30000);
        Book book3 = new Book(2,"목민심서", "정약용",30000);


        /*사람이 보기에는 의미없는 정보이다. 따라서 객체의 필드 값을 보여주도록 오버라이딩 하여 사용한다.*/
        System.out.println("book= "+ book1);

        System.out.println("동일성 비교(==) : " + (book2 == book3));
        System.out.println("동등성 비교(eaquals) : " + book2.equals(book3));

        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
    }
}
