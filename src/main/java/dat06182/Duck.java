package dat06182;

// 문제 : 고무오리, 고무2오리, 흰오리, 청둥오리 객체를 만들고 날게 해주세요. 단 고무오리 계열은 날 수 없습니다.
// 조건 : 메서드는 중복될 수 없습니다.

class Duck {
    public static void main(String[] args) {

     흰오리 a흰오리 = new 흰오리();
     a흰오리.날다();

     청둥오리 a청둥오리 = new 청둥오리();
     a청둥오리.날다();

     고무오리 a고무오리 = new 고무오리();
     a고무오리.날다();

     고무2오리 a고무2오리 = new 고무2오리();
     a고무2오리.날다();

    }
}

class 오리 {
    void 날다() {
        System.out.println("난다!");
    }
}

class 흰오리 extends 오리 {

}

class 청둥오리 extends 오리 {

}

class 고무오리 extends 오리 {
    void 날다() {
        System.out.println("못난다!");
    }
}

class 고무2오리 extends 고무오리 {

}

// 복잡한 상속을하면 나중에 코드가 꼬일때 확인하기가 어렵다.
//