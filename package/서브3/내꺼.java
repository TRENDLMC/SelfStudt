package 패키지선언.서브3;

import org.w3c.dom.ls.LSOutput;
import 패키지선언.서브4.*;
import 패키지선언.서브1.*;
import 패키지선언.서브2.*;
//다른패키지에 있는 메소드 및 필드를 가져오기위한 import

public class 내꺼 {


    현대 engine = new 현대();
    한국 아타 =new 한국();
    금호 광폭=new 금호();

    public int b= 광폭.a;
    //안되는이유 public 을 잘보자..

    패키지선언.서브1.타이어 금타= new 패키지선언.서브1.타이어();

    패키지선언.서브2.타이어 한타= new 패키지선언.서브2.타이어();
    //다른패키지에 있는 같은이름의 클래스를 가져온다면 앞에 패키지의이름을 다붙여줘서 구분을시켜줘야함


    public static void main(String[] args) {
        내꺼 me= new 내꺼();
        //같은 클래스안에서라도 객체를 만들어줘야 필드의 데이터를 사용가능하다

        System.out.println(me.b);


    }





}
