package day06189;

// 문제 : `a무기.공격();` 가 실행되는 세부과정을 자세히 쓰세요.

class Main {
    public static void main(String[] args) {
        무기 a무기 = new 칼();

        // 칼객체인 a무기안에있는 공격메서드를 실행하면 무기타입으로 만들어져있기때문에 무기클래스안에있는 공격메서드가 실행
        a무기.공격();
    }
}

class 무기 {
    void 공격() {
    }
}

class 칼 extends 무기 {
}