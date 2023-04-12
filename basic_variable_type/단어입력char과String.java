package basic_variable_type;

public class 단어입력char과String {
    public static void main(String[] args) {
        // char 한글자를 표현할떄 사용 한다 영어와 한글표현이가능하며
        //유니코드도 사용이 가능하며 한글이나 영어를 입력시 작은따움표 ''로 표시해야한다
        char z = 44444;
        char x = 'a';
        char c = '한';
        //String 단어를 표현할때 사용 String의경우 문장이 표현이가능하다
        //스트롱 명령어입력시 앞에s는 대문자로 입력해주어야하며 "" 큰따움표를 붙여야 오류가안남
        String v = "hello java";
        //또한 문장을 표현시 역슬레쉬 / <x \<o 를 사용하여
        // \t 탭만큼 공간띄우기 \n 행변경 코드사용으로인해 사용불가능한 " ' * 와같은 기호사용 \" \' \*
        String b = "이름\n나이\n성별";
        String n = "이름\t나이\t성별\t";
        String m = "\"이름\"\\나이\\\'성별\'";
        String a = "123";
        String a1 = "1.23";
        //스트링의경우 정수와 실수 입력이가능하다!이경우 숫자로입려되는것이아닌 문자로 인식함
        //a+a1 = 1231.23이됨
        System.out.println(z);
        System.out.println(x);
        System.out.println(c);
        System.out.println(v);

        System.out.println(b);
        System.out.println(n);
        System.out.println(m);
        System.out.println(a);
        System.out.println(a1);
        System.out.println("우리는 \"개발자\"입니다");
        System.out.println("봄\\여름\\가을\\겨울");
        //위의 \는 sout에서도 사용이 가능하다
    }}
