package basic_variable_type;

public class int응용 {
    public static void main(String[] args) {
        //two의 응용 방법
        int hour = 7;
        int minute = 5;
        System.out.println(hour + "시간" + minute + "분");
        int totalminute = (hour*60) + minute;
        System.out.println("총" + totalminute + "분");

        int x = 5;
        int y = 7;
        System.out.println("Y=" + y + ", x=" + x);

        // 위에 사용한 값을 변경하는방법 새로운 변수를 입력해준뒤 변경하려고하는 값을 먼저 다른 변수에 초기화후 변경

        int z = y;
        y = x;
        x = z;




        System.out.println("y=" + y + ", x=" + x);



    }
}
