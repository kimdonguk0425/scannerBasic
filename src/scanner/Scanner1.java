package scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine();  //입력을  String으로 가져온다. nextLine 을 만나면 위에꺼 프린트 이후 기다림, scanner.nextLine()에는 hello java가 들어감
        System.out.println("입력한 물자열: " + str);

        System.out.print("정수를 입력하세요:");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수를 입력하세요");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수: " + doubleValue);
    }
}
