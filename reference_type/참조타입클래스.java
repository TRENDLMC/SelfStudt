package 참조타입;

public class 참조타입클래스 {
    public static void main(String[] args) {
    //기본타입과 참초타입 변수 의차이점 메소드영역는 코드가 저장 힙영역에는 객체가 저장 스택영역에는
        // byte char short int long float double boolean 등이있다
        int a= 25;
        double a1 = 10.5;
        // 참초타입변수 배열 열거 클래스(String) 인터페이스
        //참조타입가 동일 객체를 참조하는지 알아볼떄사용
        // == !=
        String z = "사람";
        String z1= "사람";
       boolean z3 = z ==z1;
        System.out.println(z3);
        // 문자열 리터럴(저장된값이)이 동일한경우 String 객체를 공유한다
        System.out.println("-----------new String---------");
        String c= new String("사람");
        String c1= new String("사람");
        boolean c3 = c ==c1;
        System.out.println(c3);
        // new String 를 입력할 경우 새로운 string객체를 만들어냄 그렇기떄문에 동일객체가이나라 false 이 뜸
        System.out.println("-----------equals--------");
        boolean v1= c.equals(c1);
        boolean v2= c1.equals(z);
        System.out.println(v1);
        System.out.println(v2);
        // 문자열 비교시 equals()를사용한다
        System.out.println("-----------null---------");
        String x = "사람";
        String x1=null;
        // null 객체를 적지않을 떄사용
        boolean x3 = x == x1 ;
        System.out.println(x1);


        //eroor :하드웨어의 문제 os(운영체제의문제)
        //Exception : 실행 하는도중에 발생하는 오류





    }
}
