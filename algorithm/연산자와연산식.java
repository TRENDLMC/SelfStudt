public class 연산자와연산식 {
    public static void main(String[] args) {
        // 단항연산자 = 정수와 실수를 표현할수있는것
        long a1 = 1 + 2 + 3 + 4;
        System.out.println(a1);
        boolean a2 = a1 < 9;
        System.out.println(a2);
        float a3 = 100 * 2 / 3 - 5f;
        System.out.println(a3);
        System.out.println("-------------------단항연산자-----------------");
        // 단항연산자 = 정수와 실수를 표현할수있는것
        //단항연감자의 부호연산자
        byte x = -100;
        int x1 = -x;
        int x2 = +x;
        // 단항의 계산의경우에도 변수값이 int 로변환되기 떄문에 byte 변수를 주면 오류가남
        System.out.println(x1);
        System.out.println(x2);
        //단항연산자의 증감연산자 기호 ++(1증가) --(1감소) 왼쪽부터실행이기떄문에 ++1 의경우 2로시작 1++의 경우 1로시작하고 계산후+1
        int z = 2;
        int z1 = 3;
        int z2 = ++z + 10;
        int z3 = z1--;
        //z3의 경우 연산자가 두개일경우 z1을 z3에저장후 감소가일어남
        int z4 = z++ + --z1;
        //z4의 경우 z1 3-1 이된뒤 +2 가되어 4 가된후 z+1이되어 z=3 이된다
        //z4의경우 가시성이좋지않기떄문에 계산할떄
        // --z1;
        //z4= z1+ z;
        //z++;
        // 으로 해주는게 좋음

        System.out.println(z2);
        System.out.println(z3);
        System.out.println(z1);
        System.out.println(z4);
        //단항연산자의 논리부정연산자 (!) true 와 false 를 반대로 바꾸어줌 (!)읽을떄는 not(낫)으로 읽음
        System.out.println("-------------------논리부정연산자-----------------");
        boolean c1 = true;
        System.out.println(c1);
        c1 = !c1;
        System.out.println(c1);
        c1 = !c1;
        System.out.println(c1);

        //이항연산자의 산술연산자 + - * / 가있음 순서대로 덧셈 뺼셈 곱셈 나눗셈
        // %<연산자는 왼쪽피연산자를 오른쪽 피연산자로 나눈 나머지를 구하는연산
        //이항연산자 산술연산에서 중요한것은 큰범위변수 와 작은범위 변수 계산에유의
        //낮은 범위의단위 byte char short 는 자동단위변환 되어 int 로 변환이 무조건 됨
        //위에없는 float 와 double 는 int 보다 크기떄문에 더큰 변수로변환된다
        char v1 = 'a' + 1;
        char v2 = 'a';
        int v3 = v2 + 1;
        // char v3 = v2+1; 의경우 정수연산은 int 로자동변환되기떄문에 char 변수에 담을수없어서 오류가남
        System.out.println(v1);
        System.out.println(v3);

        System.out.println("-------------------비교연산자-----------------");

        //이항연산자의 비교연산자
        // 두개의값을 비교하여 true 와 false 를 출력함
        // ==(두개의연산자의값이같은지검사) !=(두개의연산자값이다른지를검사)
        // >(두개의연산자중 피연산자1이큰지를검사) >=(두개의연산자중 피연산자1 이 크거나 같은지를검사)
        // <(두개의연산자중 피연산자2이큰지를검사) <=(두개의연산자중 피연산자2 이 크거나 같은지를검사)

        int s1 = 100;
        int s2 = 100;
        boolean s3 = s1 == s2;
        boolean s4 = s1 != s2;

        System.out.println("결과:" + s3);
        System.out.println("--------------------------------------");
        System.out.println("결과:" + s4);

        int s5 = 100;
        int s6 = 99;
        boolean s7 = s5 > s6;
        boolean s8 = s5 >= s6;
        boolean s9 = s5 < s6;
        boolean s0 = s5 <= s6;
        System.out.println("결과:" + s7);
        System.out.println("결과:" + s8);
        System.out.println("결과:" + s9);
        System.out.println("결과:" + s0);
        double d1 = 0.1;
        float d2 = 0.1f;
        System.out.println(d1 == d2);
        System.out.println((double) d2);
        System.out.println((float) d1 == d2);
        System.out.println((int) (d1 * 10) == (int) (d2 * 10));
        //같은 0.1이더라도 double 와 float 와같은 변수가 다르면 값이다를수도있다
        // float 의 0.1 은0.10000000149011612가 출력됨
        //정상적인 결과를얻기위해서는 double 타입을 float 타입으로 변환해야함

        System.out.println("------------------이항논리연산자------------------");
        // boolean 변수 타입에만 사용가능
        //and && or &(쉬프트7) 피연산자가 모두 true 일떄만 true
        //or || or | (쉬프트\) 피연산자가 하나만 true 여도 true
        //xor ^(쉬프트6) 피연산자중 하나가 true 하나가 false 일떄 true 출력 둘모두가 true 거나 false 일경우 false 출력
        //not !(쉬프트1) true 경우 false 로변경 false 일경우 true 로 변경
        int l1 = 'A';

        if ((l1 >= 65) & (l1 <= 90)) {
            System.out.println("대문자이군요?");
        }
        if ((l1 >= 97) && (l1 <= 122)) {
            System.out.println("소문자이군요?");
        }
        ;
        if ((l1 >= 48) && (l1 <= 57)) {
            System.out.println("숫자 0-9이군요?");
        }
        int l2 = 8;
        // 8%2==0 의경우 8을 2로나눌경우 남는값이 0이기에 true 가되고
        //만약 10%3==0 의경우 false 이뜬다
        float l3 = (10 % 3.3f);
        System.out.println(l3);
        if ((l2 % 2 == 0) || (l2 % 4 == 0)) {
            System.out.println("2또는4의 배수이군요");
        }
        System.out.println("------------------이항대입연산자------------------");
        // y = 10 =가 대입연산자
        // 복합대입연산자
        //(+=) int x=10경우  x+=2이다 요경우 계산하는법은 x=10+2 평범하게 쓸경우 x=2라는 경우가들어가지만x+=2의경우 x의값 10이추가됨
        //(-=)(*=)(/=)(%=)(&=)(|=)(^=)등이있음
        int j = 10;
        j += 10;
        System.out.println(j);
        j -= 10;
        System.out.println(j);
        j *= 10;
        System.out.println(j);
        j /= 10;
        System.out.println(j);
        j %= 10;
        System.out.println(j);
        j &= 10;
        System.out.println(j);
        j |= 10;
        System.out.println(j);
        j ^= 10;
        System.out.println(j);


        System.out.println("------------------삼항연산자------------------");
        //조건식 ? 값또는 연산식 :(쉬프트;) 값또는 연산식
        // ture 일경우 앞에 연산자가 출력 false 일 경우 뒤에 연산자가 출력
        int u = 75;

        String u2 = (u > 90) ? "합격입니다" : "불합격입니다";
        System.out.println("귀하의점수는:" + u2);
        char u1 = (u > 90) ? 'A' : ((u > 80) ? 'B' : 'C');
        System.out.println(u + "점은" + u1 + "등급입니다");


    }
    }
