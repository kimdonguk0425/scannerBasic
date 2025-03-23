package scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요:");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = scanner.nextInt();

            if(num1 != 0 && num2 != 0) {
                int sum = num1 + num2;
                System.out.println("두수의 합:" + sum);
                System.out.println("첫 번쨰 숫자와 두 번째 숫자가 0 이면 프로그램 종료");
            } else {
                System.out.println("프로그램 종료되었습니다.");
                break;
            }
        }

    }
}
