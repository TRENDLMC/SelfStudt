package 참조타입;
public class Stning매게 {
    public static void main(String[] args) {
        //System.exit(0) <프로그램 종료 0은 정상종료
        //메인옆에있는 스트링 배열에 문자열을 입력하기위해서 테스트버튼오른쪽을누른뒤
        //configuration을 클릭한뒤 program agumant에 값을 띄워쓰기후 입력
        System.out.println(args[0]);
        System.out.println(args[1]);

        if (args.length !=2)
        {
            System.out.println("계산 값이틀립니다");
            System.exit(0);
        }else {
            String z1 = args[0];
            String z2 = args[1];

            int z3=Integer.parseInt(z1);
            int z4=Integer.parseInt(z2);

            System.out.println("계산의 합은"+(z3+z4)+"입니다");
            System.exit(0);

        }
    }
}
