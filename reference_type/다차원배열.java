package 참조타입;

import javax.crypto.spec.PSource;

public class 다차원배열 {
    public static void main(String[] args) {
        // 행렬의 구조 int[][] z= new int[?][?];

        int[][] z= new int[5][3];

        System.out.println("입력값"+z.length);
        System.out.println("입력값"+z[1].length);
        // z.length 는 행의 배열수 5
        //z[1].length 는 1행의 열수 3이 나옴

        System.out.println("++++++++++++++++++++++++++++++++++++");
        //다차원배열 계단식
        // int[][] z= new int[?][null]; null은 공란을 의미
        // z[0]= new int[4]
        // z[1]= new int[5]
        //위와같이 입력할시 1행에 4개의 배열 2행에 5개의배열이만들어짐 그래서 계단식이라함

        int[][] z1= new int[2][];

        z1[0]=new int[3];
        z1[1]=new int[5];
        System.out.println(z1.length);
        System.out.println(z1[0].length);
        System.out.println(z1[1].length);


        //값목록을 이용한 2차배열생선
        int[][] z3 = {{12,123,234},{98,987,234,420912}};// {{0.0,0.1,0.3}{1.0,1.1,1.2}}
        System.out.println(z3[0][0]);
        System.out.println(z3[0][1]);
        System.out.println(z3[1][0]);
        System.out.println(z3[1][1]);

        for(int x=0; x<2; x++){
            for(int x1=0; x1<z3[x].length; x1++){
                //앞에 행의값은 변하지않지만 행의 배열의수는 변화하기떄문에
                //다차원 계단식배열의 경우 for값으로 구할시 몇까지 구해라 라는값을 length를 써야함
                System.out.println("배열"+x+"의"+x1+"항의값은"+z3[x][x1]+"다");


            }
        }







    }
}
