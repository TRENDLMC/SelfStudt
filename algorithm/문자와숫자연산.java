public class 문자와숫자연산 {
    public static void main(String[] args) {
        // +의경우    String a = "1"+3;  "1"이란 문자가 입력시 뒤에있는 3도 문자 취급되어 4의값이아닌 13의값이 출력됨
        // 또한 위의경우 int 의 저장시 int 는 문자열을 저장할수없기떄문에 오류가발생
        // String a = "1"+2+3; 의경우 String a ="12"+3; 으로 선계산후 계산되어 123이 출력
        // String a = 1+2+"3"의경우 String a = 3+"3"; 으로 선계산후 계산되어 33으로 출력
        // int a = 1+2+3; 의경우 int a = 3+3으로 앞 부터 계산되어 6으로 출력

        String a = 1+2+"3";
        String s = "1"+2+3;
        System.out.println(a);
        System.out.println(s);

        String d = "3"+(1+2);
        System.out.println(d);
        //이경우 괄호먼저계산됨

        //스트링의 문자열을 정수와 실수로변활떄
        //int ? = Inteher.parseInt(스트링변수값);
        //long ? = Long.parseLong(스트링변수값);
        //double ? = Double.parseDouble(스트링변수값);

        String z = "100000003";
        int b =Integer.parseInt(z);
        System.out.println(b);

        String x = "1.323124";
        double c = Double.parseDouble(x);
        System.out.println(c);


        //반대의경우
        //1 String a= String.valueOf()
        //2 String a = ""이 훨씬편함
        int q = 3;
        String w =String.valueOf(q);
        String j =String.valueOf(3);
        System.out.println(w);
        System.out.println(j);
        String p = "3";
        System.out.println(p);


    }
}
