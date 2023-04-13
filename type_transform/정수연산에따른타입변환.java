package 타입변환;

public class 정수연산에따른타입변환 {
    public static void main(String[] args) {
        //낮은 범위의단위 byte char short 는 자동단위변환 되어 int 로 변환이 무조건 됨
        // byte b= 10;
        // byte c= 20;
        // byte a = b+c; <에러
        // int  a = b+c; 통과
        //하지만 bye t의 범위값인 byte a = 10+20; 의경우는 연산이 정상적으로됨
        byte a= 10;
        byte s= 20;
        int d= s+a;
        System.out.println(d);
        // char의경우
        char q = 'A';
        char w = 1;
        int e = q+w;
        char r = (char)e;
        System.out.println("유니코드=" + e);
        System.out.println("문자=" + r);
        // 위 이유로인하여 거의 대부분 int 타입으로 선언하는 경우가많다


        // byte a = 10;
        // long b = 20;
        // long c = a+b; 통과
        // int c = a+b; 에러
        // 큰단위의 피연산자 섞여있을경우 뒤에 피연산자가 큰타입(long, double)의 피연산자로 자동타입변환이됨
        // 큰단위를 작은 피연산자로 변환하고싶을 경우 int c = a + (int) b;



    }
}
