package 열거타입;

public class 실행 extends 열거타입{
    public static void main(String[] args) {
        //name 메소드
        week today =week.SUNDAY;
        String name = today.name();
        System.out.println(name);
        // 열거 객체가 가지고있는 문자을 반환한다

        //ordinal 메소드
        int ordinal =today.ordinal();
        System.out.println(ordinal);
        //전체열거 객체중에서 몇번쨰 열거 객체인지 알려준다.
        //MONDAY(0), TUESDAY(1), WEDNESDAY(2),THURSDAY(3),FRIDAY(4), SATURDAY(5), SUNDAY(6)

        week day1=week.MONDAY;
        week day2=week.WEDNESDAY;
        int result1=day1.compareTo(day2);
        int result2=day2.compareTo(day1);
        System.out.println(result1);
        System.out.println(result2);
        //day1에저장된 변수 monday가 day2에저장된변수 wednesday변수 의 위치를 비교하여 출력
        //monday값0 wedsneday값2



        if(args.length == 1 ){
            String strDay= args[0];
           // week WeekDay=week.valueOf(strDay);
           week WeekDay=week.valueOf(strDay);
            if(WeekDay == week.SATURDAY || WeekDay == week.SUNDAY){
                System.out.println("주말이군요");
            }else{
                System.out.println("평일이군요");
            }

        }
        week[] days=week.values();
        // values days 에 week[]의 모든열거객체를 배열로만들어서 반환
        for(week day : days){
            //향상된 for문
            System.out.println(day);
        }


    }
}
