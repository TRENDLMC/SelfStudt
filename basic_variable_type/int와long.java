package basic_variable_type;

public class int와long {
    public static void main(String[] args) {
        // 숫자를 표현하는방법에는 byte , int , long 등을 주로사용하며
        // byte 경우 -128~ 127까지의 숫자표현가능
        // int 경우 약 +- 21억의 숫자 표현가능
        // long 경우 약 19자리의 숫자 표현가능 개많이 표현가능
        // int와 long의경우 단어와 문자는 저장불가능
        //int p = "아"; 오류
        //long o = "아"; 오류
        int z = 0b1011101;
        // 이진수 = 0B
        int x = 013;
        //8진수의경우 0
        int c = 11;
        //10진수의경우 그냥 숫자입력
        int v = 0xb;
        //16진수의경우 0x로시작 하며 숫자와 abcde의 영어를 붙여서 입력한다
        long b = 11;
        long n = 2222222222222l;
        // 명령이 입력의경우 long를 입력하여도 21억이상의숫자는 int로 인식하기떄문에 마지막에 L를 붙여서 long값으로 인식하게해줘야함
        // long 입력시 21억이하의 숫자를 입력한다면 l를 붙이지않아도 가능하다
        System.out.println(z);
        System.out.println(x);
        System.out.println(c);
        System.out.println(v);
        System.out.println(b);
        System.out.println(n);
    }

}