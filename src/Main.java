import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        while (true) {
            System.out.println("원하는 수식 : 1.덧셈,  2.뺄셈,  3.곱셈,  4.나눗셈");
            int i = Integer.parseInt(br.readLine());

            System.out.println("두 수를 입력하세요 : ");
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            switch (i) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("입력 범위를 넘어갔습니다.");
                    break;
            }
        }

    }
}
