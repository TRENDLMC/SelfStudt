package 필드;

public class 객체1 {
    public static void main(String[] args) {
        //필드의경우 같은 클래스는 변수를 지정해주면 바로바로 사용이가능하지만
        //다른 클래스에서 사용할경우
        // 객체 변수 = new 객체(); 으로객체를생성한후
        // 변수.x=20
        //다른클래스에서 사용하기위해선 객체2를 저장한 변수 값을 앞에입력후 변수를 입력해야
        //자료값이 넘어옴



        객체2 내객체 = new 객체2();
        내객체.speed=20;
        System.out.println(내객체.company) ;
        System.out.println(내객체.mpdel);

        System.out.println("byte:"+내객체.q1);
        System.out.println("char:"+내객체.q2);
        System.out.println("short:"+내객체.q3);
        System.out.println("int:"+내객체.q4);
        System.out.println("long:"+내객체.q5);
        System.out.println("float:"+내객체.q6);
        System.out.println("double:"+내객체.q7);
        System.out.println("boolean:"+내객체.q8);
        System.out.println("String:"+내객체.q9);
        System.out.println("int[]:"+내객체.q10);
        System.out.println("String[]:"+내객체.q11);
       //3,5
        for(int w=0; w<3; w++){
            for(int w1=0; w1<내객체.q12[w].length; w1++ )
            {
                System.out.println("q12항목["+w+"]["+w1+"]의값은"+내객체.q12[w][w1]+"입니다");
            }
        }


    }
}
