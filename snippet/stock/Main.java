package skala;

import skala.domain.Stock;
public class Main {
    static void printStockInfo(Stock stock) {
        stock.printInfo();
    }

    public static void main(String[] args) {
        // 객체 생성 (인스턴스화)
        Stock scalaEdu = new Stock("스칼라 에듀", 15000);
        Stock scalaAI = new Stock("스칼라 AI", 17500);

        // 객체 상태 변경
        scalaEdu.updatePrice(15800);
        scalaEdu.printInfo();

    }
}

/*
자바는 폴더 구조로 코드를 정리하는데, 개발자가 만든 파일들을 자바가 어떻게 폴더별로 포장하고 실행하는지
직접 눈으로 확인해보는 실습

자바의 폴더 = 패키지

1. main.java : 실행을 담당하는 파일로 skala라는 폴더에 넣고 싶다.
    package skala; // 이 파일 main.java는 skala폴더 바로 아래에 배치해라
    import skala.domain.Stock; // skala.domain 폴더 안에 있는 stock 클래스를 이 파일로 가져와서 쓰겠다.
    public class Main {
    static void printStockInfo(Stock stock) {
        stock.printInfo();
    } // main클래스 안에 주식 정보를 출력하는 printstockinfo 메서드를 작성한 부분.
    //  import로 가져온 stock 타입의 객체를 매개변수로 받아서 내부 기능 printinfo()를 호출 중 
stock.java : 주식 정보를 담는 파일 skala/doamain이라는 폴더에 넣고 싶다.



*/