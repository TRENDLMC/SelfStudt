package 참조타입;

public class 객체를참조하는배열 {
    public static void main(String[] args) {
        //참조타입배열
        // String[] z= new String[3];
        String [] z= new String[4];
        z[0]="java";
        z[1]="hello";
        z[2]="java";
        z[3]=new String("java");
        // String 의 배열의 경우 String과마찬가지로 같은문자는 같은번지에 저장되기떄문에
        // == 로 같은 단어를 비교햇을경우 같다라는 값을 얻을수있다
        //false을 얻을려면 new Stning("java");
        //문자열을 비교할시 equals를 사용
        System.out.println(z[0]==z[2]);
        System.out.println(z[0]==z[3]);
        System.out.println(z[0].equals(z[3]));

    }
}
