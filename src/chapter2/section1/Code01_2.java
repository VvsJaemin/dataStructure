package chapter2.section1;

public class Code01_2 {

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

        Person1 second = first;
        second.name = "Tom";
        System.out.println("second.name = " + first.name);
        System.out.println("second.number = " + first.number);
        
        
        Person1[] members = new Person1[100];

        members[0] = first;
        members[1] = second;
        System.out.println("members[0].name + members[0].number = " + members[0].name + members[0].number);
        System.out.println("members[1].name + members[1].number = " + members[1].name + members[1].number);

        members[2] = new Person1();
        members[2].name = "david";
        members[2].number = "021012";

        System.out.println("members[2].name + members[2].number = " + members[2].name + members[2].number);

    }
}
