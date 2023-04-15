package 참조타입;

public interface 참조타입배열 {
    public static void main(String[] args) {
        // 배열변수선언하는 방법
        // int[] z; or int z[];
        // double[] x; double x[];
        // String [] c; String c[];
        // 배열 등록하는방법
        //첫번쨰방법
        // int[] z = {1,2,3,4,5,6,7....30};
        // 위 방법의경우 변수 등록하자마자 값목록을 줘야함
        // 만약 생성후 값을 주는경우 z = int[]{1,2,3,4,...30};
        //두번쨰방법
        // int[] z = new int[30];
        //  두가지방법이있음
        System.out.println("_______________________________________");
        int[] z = {46, 53, 26, 23};
        System.out.println("z의1인덱스" + z[0]);
        System.out.println("z의1인덱스" + z[1]);
        System.out.println("z의2인덱스" + z[2]);
        System.out.println("z의3인덱스" + z[3]);
        int 평균값 = 0;
        int 인원수 = 4;
        for (int c = 0; c < 인원수; c++) {
            평균값 += z[c];
        }
        System.out.println(평균값);
        System.out.println("4명의평균점수는" + (double) 평균값 / 인원수 + "입니다");
        System.out.println("_______________________________________");
        int[] p = {46123, 512543, 21236, 21243};
        System.out.println("p의1인덱스" + p[0]);
        System.out.println("p의1인덱스" + p[1]);
        System.out.println("p의2인덱스" + p[2]);
        System.out.println("p의3인덱스" + p[3]);
        int 평균값66 = 0;
        for (int c = 0; c < p.length; c++) {
            평균값66 += p[c];
        }
        System.out.println(평균값66);
        System.out.println("4명의평균점수는" + (double) 평균값66 / p.length + "입니다");
        //length는 숫자나 문자열의경우 문자의수를 세지만 인덱스의경우 인덱스의 수를 센다!

        System.out.println("_______________________________________");
        int[] x;
        x = new int[]{46, 53, 26, 23};
        System.out.println("z의1인덱스" + x[0]);
        System.out.println("z의1인덱스" + x[1]);
        System.out.println("z의2인덱스" + x[2]);
        System.out.println("z의3인덱스" + x[3]);
        int 평균값1 = 0;
        int 인원수1 = 4;
        for (int c = 0; c < 인원수1; c++) {
            평균값1 += x[c];
        }
        int a1= q(new int[]{123, 421,4231,4124,12421});
        System.out.println("5명의점수는입니다");
        System.out.println("총점"+a1);
        int 메소드=5;
        System.out.println("4명의평균점수는" + (double) a1 /메소드 + "입니다");

    }
        public static int q( int[] w){
            int r = 0;
            for (int e = 0; e <5; e++) {
                r += w[e];
            }
            return r;
        }

}