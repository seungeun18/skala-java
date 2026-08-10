public class FormatterExample {
    public static void main(String[] args) {
        String name = "스칼라";
        int age = 30;
        String formatted = String.format("이름: %s, 나이: %d", name, age);
        System.out.println(formatted);  // 이름: 스칼라, 나이: 30

        double pi = 3.141592;
        System.out.println(String.format("원주율: %.2f", pi));  // 원주율: 3.14
        System.out.printf("|%10s|\n", "Java");  // 오른쪽 정렬 (총 10자리)
        System.out.printf("|%-10s|\n", "Java"); // 왼쪽 정렬

    }
}

// 자바에서 문자열을 원하는 양식에 맞춰 예쁘게 조립하고 출력하는 방법을 익히는 실습
// 변수 값이나 숫자를 출력할 때 단순히 +기호로 이어 붙이면 코드가 지저분해진다.
// 그래서 이 때 서식지정자(format specifier)를 사용하면 깔끔하게 출력할 수 있다.
// 예) %s : 문자열, %d : 정수, %f : 실수, %.2f : 소수점 2자리까지 출력


// string.format() - 새로운 문자열을 생성해서 변수에 저장
// System.out.printf() - 콘솔에 바로 출력
