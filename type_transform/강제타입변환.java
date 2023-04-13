public class 강제타입변환 {
    public static void main(String[] args) {
        //강제타입변환 큰허용타입에서 작은타입으로 변환할떄 강제로 변환해주는것
        //작은타입범위 = (작은타입범위) 큰 허용 범위 타입

        int z = 126;
        byte x = (byte) z;
        // byte 같은경우 -128 ~127까지표현가능
        System.out.println(x);


        //숫자를 유니코드화 하여 char로 강제 변환

        long a = 65;
        char s = (char) a;
        a = 97;
        char d = (char) a;

        System.out.println(a);
        System.out.println(s);
        System.out.println(d);

        //실수를 정수로 강제변환 하는경우
        double q = 3.14;
        int w =(int) q;
        double e = 3.94;
        int r =(int) e;

        // 3.14> 3만 저장이됨 소수점은 탈락 반올림도 되지않음

        System.out.println(q);
        System.out.println(w);
        System.out.println(e);
        System.out.println(r);


    }
}
