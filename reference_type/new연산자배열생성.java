package 참조타입;

public class new연산자배열생성 {
    public static void main(String[] args) {
        // int[] x = new int[길이] 로생성할경우 모두 초기값 0으로 30개가 저장
        //String[] x = new Srning[길이] 로생성할경우 모두 초기값 null로 30개가저장
        //위배열에서 인덱스에 수를 저장하는법은 x[0]=30; 을할경우 x[0]을 출력할경우 30이 출력

        int[] x = new int[5];

        for (int x1 = 0; x1 < 5; x1++) {
            System.out.println("x[" + x1 + "]:" + x[x1]);

        }
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        x[3] = 4;
        x[4] = 5;
        for (int x1 = 0; x1 < 5; x1++) {
            System.out.println("x[" + x1 + "]:" + x[x1]);

        }
        double[] a = new double[5];
        for (int a1 = 0; a1 < 5; a1++) {
            System.out.println("a[" + a1 + "]:" + a[a1]);


        }
        a[0] = 0.1;
        a[1] = 0.2;
        a[2] = 0.3;
        a[3] = 0.4;
        a[4] = 0.5;
        for (int a1 = 0; a1 < 5; a1++) {
            System.out.println("a[" + a1 + "]:" + a[a1]);


        }
        String q[] = new String[5];
        for (int q1 = 0; q1 < 5; q1++) {
            System.out.println("q[" + q1 + "]:" + q[q1]);

        }
        q[0] = "A";
        q[1] = "B";
        q[2] = "C";
        q[3] = "D";
        q[4] = "E";
        for (int q1 = 0; q1 < 5; q1++) {
            System.out.println("q[" + q1 + "]:" + q[q1]);


        }
    }
}

