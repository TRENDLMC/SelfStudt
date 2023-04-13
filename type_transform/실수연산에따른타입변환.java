public class 실수연산에따른타입변환 {
    public static void main(String[] args) {

        int z = 10;
        double x = 1.2;

        double c = z+x;
        System.out.println(c);
        int v = z+(int)x;
        System.out.println(v);
        // double를 int로 강제변환 시켜 연산할경우 소수점이 마찬가지로 떨어져나감
        //실수의 경우 double 1 = 1.5+2.3 가능
        // float 1 = 1.5+2.3; 경우 에러 float변수사용을 위해선float 1 = 1.5f+2.3f; f를 붙여주어야함


        //정수 계산결과가 실수인경우
        // int a= 1;
        // int s= 2;
        //double d= a/b; 의결과값은 0.5에서 0만 출력이됨 정수와 정수를 계산시 정수만 출력!
        // 정수계산으로 실수를 표현하는방법
        // double d =(double)a/s; 의경우 0.5로 출력 정수를 실수로 타입변환을 시켜계산시 실수가나옴
        int a= 10;
        int s= 4;
        int d= a/s;
        double f =(double)a/s;
        System.out.println(d);  //이경우 정수 정수의 계산이기에 2.5표시가아닌 2가표시됨
        System.out.println(f); //이경우 실수 정수 이기에 2.5표현
        double g = a/4;
        System.out.println(g); // 이경우도 앞의 범위를 실수로 바꿔도 정수 정수 계산이기떄문에 2까지표현
        double j =a/4.0;
        System.out.println(j);// 요렇게 변경할경우 실수 정수의 계산 이기에 2.5가표시
    }
}
