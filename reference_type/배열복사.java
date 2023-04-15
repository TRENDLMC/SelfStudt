package 참조타입;

public class 배열복사 {
    public static void main(String[] args) {
        //배열복사
        //System.arraycopy(원본배열,인덱스시작번호,대상배열.대상배열의인덱스시작번호.몇개를복사할것이냐)
        String[] z = {"0-0", "0-1", "0-2"};
        String[] z1 = new String[6];
        System.arraycopy(z, 0, z1, 0, z.length);

        for (int x = 0; x < z.length; x++) {
            System.out.println((z1[x]) + ",");

        }


    }
}
