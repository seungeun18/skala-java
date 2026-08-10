
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] history = new String[100];
        int count = 0;

        while (true) {
            // 1. 첫 번째 숫자 입력
            System.out.print("첫 번째 숫자: ");
            int firstNumber = Integer.parseInt(scanner.nextLine().trim());
            
            // 2. 연산자 입력
            System.out.print("연산자(+ - * /): ");
            String operator = scanner.nextLine().trim();
            
            // 3. 두 번째 숫자 입력
            System.out.print("두 번째 숫자: ");
            int secondNumber = Integer.parseInt(scanner.nextLine().trim());
            
            // 4. 연산 및 결과 저장
            if (operator.equals("/") && secondNumber == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
            } else {
                double result;
                switch (operator) {
                    case "+": result = (double) firstNumber + secondNumber; break;
                    case "-": result = (double) firstNumber - secondNumber; break;
                    case "*": result = (double) firstNumber * secondNumber; break;
                    case "/": result = (double) firstNumber / secondNumber; break;
                    default:  result = Double.NaN; break;
                }
                
                if (!Double.isNaN(result)) {
                    System.out.println("결과: " + result);

                    // history 배열에 기록 저장
                    String record = firstNumber + " " + operator + " " + secondNumber + " = " + result;
                    history[count] = record;
                    count++;
                } else {
                    System.out.println("잘못된 연산자입니다.");
                }
            }

            // 5. 계속 진행 여부 물어보기
            System.out.print("계속하려면 c(continue) / 종료하려면 q(quit) 입력: ");
            String command = scanner.nextLine().trim();

            // 'q'나 'Q'를 누르면 반복 종료
            if (command.equalsIgnoreCase("q")) {
                break;
            }
        }

        // 6. while문 탈출 후 for-each로 저장된 기록 전체 출력
        System.out.println("\n=== 계산 기록 ===");
        for (String record : history) {
            if (record != null) {
                System.out.println(record);
            }
        }

        scanner.close();
    }
}



/*
실습 주제 : 계산기 - for-each 적용하기
한번만 계산하고 끝나는 프로그램이 아니라 사용자가 멈출 때까지 계산을 계속 반복하면서 모든 계산 기록을 배열에 모아두었다가 
종료할 때 for-each문으로 기록을 한눈에 출력하는 실습

for-each문 문법 : for(타입 변수명 : 배열명) { ... }
배열 안에 있는 계산 기록들을 처음부터 하나씩 거내와 화면에 출력

1. string[] history = new string[100]; 계산 기록을 최대 100개까지 담을 수 있는 문자열 배열을 만든다.
2. while문으로 반복적으로 계산한 결과를 history 배열에 저장한다.
--> 사용자가 종료 q를 입력할 때까지 무한 반복


*/
