import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] history = new String[100]; // 최대 100개의 계산 기록 저장
        int historyCount = 0; // 저장된 기록 개수

        boolean isRun = true;
        while (isRun) {
            // 첫 번째 숫자 입력
            System.out.print("첫 번째 숫자: ");
            int firstNumber = scanner.nextInt();

            // 연산자 입력
            System.out.print("연산자(+ - * /): ");
            String operator = scanner.next().trim();

            // 두 번째 숫자 입력
            System.out.print("두 번째 숫자: ");
            int secondNumber = scanner.nextInt();

            // 0으로 나누기 예외 처리
            try {
                if (operator.equals("/") && secondNumber == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
                continue;
            }

            // switch문으로 계산 (잘못된 연산자는 default에서 처리)
            double result;
            switch (operator) {
                case "+" -> result = firstNumber + secondNumber;
                case "-" -> result = firstNumber - secondNumber;
                case "*" -> result = firstNumber * secondNumber;
                case "/" -> result = (double) firstNumber / secondNumber;
                default -> {
                    System.out.println("잘못된 연산자입니다.");
                    continue;
                }
            }

            System.out.println("결과: " + result);
            
            String record = firstNumber + " " + operator + " " + secondNumber + " = " + result;
            if (historyCount <history.length) {
                history[historyCount] = record;
                historyCount++;
            }

            // 계속 여부 입력
            System.out.print("계속하려면 c(continue) / 종료하려면 q(quit) 입력: ");
            String choice = scanner.next().trim().toLowerCase();

            if (choice.equals("q") || choice.equals("quit")) {
                isRun = false;
            }
        }

        // for-each로 기록 출력
        System.out.println("\n=== 계산 기록 ===");
        for (String rec : history) {
            if (rec == null) break; // 저장된 만큼만 출력
            System.out.println(rec);
        }
        



        
        scanner.close();
    }
}

/*
0으로 나눴을 때 예외처리 - try-catch문 사용
    cf. for calculator.java -> if문으로 조건 만족하면 문장 출력
try { if ( 만약 입력받은 연산자가 나눗셈이면서 두번째 숫자가 0 이면 ) {
    ArithmeticException("0으로 나눌 수 없습니다.") 예외 발생시키기 }

}
catch (ArithmeticException e) // 앞에서 ArithmeticException 예외 발생하면 이 블록이 잡아채서 e라는 변수에 담아 처리하겠다.
 {
    System.out.println(e.getMessage()); // 예외 객체 e에 담긴 에러 메시지를 화면에 출력
    e.printStackTrace(); // 에러가 어느 파일, 몇 번째 줄에서 발생했는지 추적한 빨간색 에러 상세 정보 stack trace를 출력
    continue; // 반복문 처음으로 돌아가기
}



*/