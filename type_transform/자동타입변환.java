public class 자동타입변환 {
    public static void main(String[] args) {
        //타입변환이란
        //byte -> int
        //int ->bite
        //double-> int


        //자동 타입변환 작은범위가 큰범위로 변할때 사용
        // byte<short<int<long<float<double

        byte q = 11;
        int w = q;

        long a = 5000000000l;
        float s = a;
        double d = s;

        char z= 'A';
        int x= z;
        //위상황의경우 대문자 A의 유니코드 65가 저장이됨 소문자 a의 경우 97의값
        // 음수를 가질수있는 타입은 char으로 변환시 에러가발생한다.

        System.out.println(z);
        System.out.println(x);
        System.out.println(q);
        System.out.println(w);
        System.out.println(a);
        System.out.println(s);
        System.out.println(d);

    }
}
