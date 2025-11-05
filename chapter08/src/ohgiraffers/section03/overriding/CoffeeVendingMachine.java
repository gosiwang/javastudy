package ohgiraffers.section03.overriding;

public class CoffeeVendingMachine extends VendingMachine {

    /*오버라이딩 성공 조건 :
    * 메소드 이름,반환타입, 매개변수 목록이 모든 부모와 동일해야 하나.
    * 접근제한자는 부모와 같거나 더 넓어야 한다.
    * (private < defalut < protected < public)
    * */

    // 모든 규칙(이름, 반환타입, 파라미터)을 지켜서 오버라딩
    // @Override : 컴파일 단계에서 정확히 오버라이딩 되었는지 체크해

    public String vend(){
    return "따듯한 아메리카노";
    }

//    public String vendMachine(){
//        return "음료수";
    //}

//    @Override
//    public int vend(){
//        return 100;
//    }

//    //위반3 : 매개변수(파라미터)가 다르면 오버라이딩이 아니다.
//    public String vend(String type){
//        return type;
//    }

    //위반 4: private 메소드는 오버라이딩이 아니다.
    //@Override

    //위반5: final메소드는 '절대 변경 불가'를 의미하므로 오버라이딩 불가
    //@Override
   // public final void powerOn(){}

    //위반 6:접근제한자는 부모보다 좁은 범위로 변경할 수 없다.
    //defalut접근 제한자가 protected보다 좁은 범위이므로 에러 발생

    @Override
    public void clean(){
        System.out.println("내부를 스팀으로 청소합니다.");

    }
}
