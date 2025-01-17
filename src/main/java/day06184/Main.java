// 문제 : `무기 a무기 = new 칼();` 가 실행되는 세부과정을 자세히 쓰세요.

class Main {
    public static void main(String[] args) {
        // * double d = 5.5; 의 처리과정
        // 1 : 실수 5.5가 생긴다.
        // 2 : 오직 실수만 담을 수 있는 변수 d가 생성된다.
        // 3 : d는 5.5가 자신안에 들어 올 수 있는지 판단한다.(가능)
        // 4 : d변수에 실수 5.5가 들어간다.
        double d = 5.5;

        // * double dd = 5; 의 처리과정
        // 1 : 정수 5가 생긴다.
        // 2 : 오직 실수만 담을 수 있는 변수 dd가 생성된다.
        // 3 : dd는 5가 자신안에 들어 올 수 있는지 판단한다.
        // 4 : 5는 정수이기 때문에 들어 올 수 없다고 판단한다.(불가능)
        // 5 : dd가 아쉬워하는 5에게 이렇게 이야기 합니다. `니가 실수로 변환될 수 있다면 들어올 수 있다.`
        // 6 : 5는 자신의 형태를 버리고 실수화 한다. 즉 5.0으로 변신하다.(캐스팅, 또는 형변환)
        // 7 : dd로 5.0이 들어간다.
        double dd = 5;

        // * int i = 5.5; 의 처리과정
        // 1 : 실수 5.5가 생긴다.
        // 2 : 오직 정수만 담을 수 있는 변수 i가 생성된다.
        // 3 : i는 5.5가 자신에게 담길 수 있는지 체크한다.(불가능)
        // 4 : i는 아쉬워하는 5.5에게 이렇게 이야기 합니다. `니가 정수가 된다면 들어올 수 있다.`
        // 5 : 5.5는 도저히 불가능 요구를 받고 치명적인 에러를 발생시킨다.(캐스팅 불가능 으로 인한 에러)
        //int i = 5.5;


        무기 a무기 = new 칼();
        // 무기 타입의 a무기를 만들고 칼리모컨을 넣는다 칼리모컨은 무기 클래스를 상속받아 무기클래스가 사용할 수 있는
        // 메서드를 사용할수 있으므로 타입이 맞아 생성이가능하다
    }
}

class 무기 {
}

class 칼 extends 무기{
}