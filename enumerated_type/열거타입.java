package 열거타입;

public class 열거타입 {
    public enum week {MONDAY, TUESDAY, WEDNESDAY,THURSDAY, FRIDAY, SATURDAY, SUNDAY}
    {
        week x = week.SUNDAY;
        boolean z = (x == week.SUNDAY);
        System.out.println(z);
    }
}
