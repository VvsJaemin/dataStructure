package chapter2.section1;

public class Code01 {

    public static void main(String[] args) {
        // 클래스는 하나의 타입 int, double
        // 다만, 자바가 미리 정한 타입이 아닌 사용자 정의 타입
        // person1 타입의 변수를 선언하고 사용

        Person1 first;

        first = new Person1(); // object 

        first.name = "s";
        first.number = "001";

        System.out.println("first.name = " + first.name);
        System.out.println("first.number = " + first.number);

        Person1[] members = new Person1[100];

        members[0] = first;
        members[1] = new Person1();
        members[1].name = "s";
        members[1].number = "10120";

        System.out.println("members[1].name = " + members[1].name);
        System.out.println("members[1].number = " + members[1].number);
    }
}
