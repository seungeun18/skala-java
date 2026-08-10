package snippet;
public class NumberBox {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;

        Integer A = 200;
        Integer B = 200;

        // 기본형 비교 (값 비교)
        System.out.println("a == b: " + (a == b));

        // 래퍼 클래스 비교 (주소 비교)
        System.out.println("A == B: " + (A == B));

        // 래퍼 클래스 equals()로 비교 (값 비교)
        System.out.println("A.equals(B): " + A.equals(B));
    }
}

// 1. 기본 자료형과 래퍼클래스의 차이 2. ==연산자와 equals()메서드의 차이
// 기본 자료형 : 메모리에 숫자 값 자체를 직접지정
// 래퍼 클래스 : 기본형 int를 객체로 감싼 형태 -> heap 메모리에 새로운 integer 객체를 생성하고 그 주소를 변수에 저장
// A와 B는 각 객체의 메모리 주소를 참조
// 기본형 변수끼리 ==연산자로 비교 : 값 비교
// 참조형 변수끼리 ==연산자로 비교 : 주소비교
// equals() 메서드 : 객체의 값 비교. 
// 정리 : 값을 비교할 때 기본형일 때는 == 를 쓰고 참조형일 때는 equals를 쓴다.
// 참조형일 때 ==를 쓰면 주소값을 비교하기 때문에  false가 나온다 