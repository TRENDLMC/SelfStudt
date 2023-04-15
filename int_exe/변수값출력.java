package 출력방법;

public class 변수값출력 {
    public static void main(String[] args) {
        // printf 형식 문자열
        // d(정수) f(실수) s(문자열)
        // %? $ ?1 dsf
        //%? 몇번째자리의 값을 $?1 몇자리의 문자를표시할것이냐 d정수 s문자열 f실수
        //%2$10.3f 의경우 첫번쨰자리의 실수를 앞의자리 10개소수점아래 3개를 표시하는데 공백일경우 지운다 //참조 1
        System.out.printf("이름: %1$-6s, 나이: %2$03d\n", "임명철",26);
        //정수 %d %6d(123을 여섯자리로 표현 오른쪽으로 몰림) %-6d(123을 여섯자리로표현 앞으로 모음)
        //%06d(123을 여섯자리로표현 왼쪽 빈자리를 0으로 채움
        //\t,띄워쓰기 \n 줄바꿈 %% %<표시

        int q1 = 3000;
        System.out.printf("가격:%1$d\n",q1);
        System.out.printf("가격:%1$7d\n",q1);
        System.out.printf("가격:%1$07d\n",q1);
        System.out.printf("가격:%1$-7d\n",q1);

        System.out.printf("\n이름:\t%1$3s,\n나이:\t%2$03d\n생년월일:\t%3$6d","임명철",26,980811);

        String a = "임명철";
        int a1 = 26;
        int a2 = 980811;
        String a3 = "백수";


        System.out.printf("\n이름:\t%1$3s\n나이:\t%2$-3d\n생년월일:\t%3$6d\n직업:\t%4$s",a,a1,a2,a3);
        //실수 %10.2f 앞에 10은 소수점위의수 .2는 소수점이하 의수 2개f는 실수 오른쪽정렬
        //%-10.2f는 왼쪽으로 정렬
        //%010.2f는 빈자리를 0으로 설정

        double z = 3.14159 * 10*10;

        System.out.printf("\n반지름이 %1$2d인 원의 넓이: %2$10.2f",10,z);
        System.out.printf("\n반지름이 %1$2d인 원의 넓이: %2$-10.3f",10,z);    //참조 1

        System.out.printf("\n반지름이 %1$2d인 원의 넓이: %2$010.4f",10,z);








    }
}
