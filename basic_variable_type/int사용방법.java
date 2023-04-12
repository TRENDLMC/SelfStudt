package basic_variable_type;

public class int사용방법 {
    public static void main(String[] args) {
    // int는 정수지정하는 방법 소수(실수)는 표현이안됨
        // 표현방법의 경우 int z = 1; or
        //              int zxc;
        //              zxc = 1;
        //위와같은 두가지의 방식으로할수있음 첫번째 방법이 훨씬 편한듯

        int zxc = 30;
        int xcv;
        xcv = 13;


        int z = 10*10;
        int x = 10-10;
        int c = 10+10;
        int v = 10/10;
        //위와같이 계산식을 넣어서도 사용가능하다


        System.out.println("zxc+xcv="+(zxc+xcv));
        // sout 시스템아웃프린트ln를 입력시 "" 이후에 추가적인 내용을 입력하고싶으면 엔터 + 엔터 를입력후 내용추가
        System.out.println("zxc+xcv="+zxc+xcv);
        //() 괄호를 추가하지않을시 수가 합산되는것 아닌 숫자를 연속적으로 적을뿐
        System.out.println(z);
        System.out.println(x);
        System.out.println(c);
        System.out.println(v);
    }



}
