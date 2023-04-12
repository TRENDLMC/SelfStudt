package basic_variable_type;

public class float과double실수사용법 {
    public static void main(String[] args) {
        // 플룻과 더블 둘다 마지막 소수점 자리는 반올림되기떄문에 마지막자리의 유효성은 낮음
        float z = 314e-2f;
        //중요 float같은경우 f를 붙여주지않으면 실수(소수 표현 오류가남)
        //e=10 e-2= 10의마이너스2승 즉 314x10의마이너스 2승이다
        float x = 30/30;
        double c = 3.14;
        // double같은경우는 f를 안붙여줘도 가능 플룻타입은 소수 7자리 더블은 약 15자리 까지출력가능
        int v =(int) 10e3;
        int b =(int) 3e7;
        // int 의경우 e를 사용할수없음 하지만 int = (int)사용시 사용가능해짐

        System.out.println(z);
        System.out.println(x);
        System.out.println(c);
        System.out.println(v);
        System.out.println(b);
    }
}
