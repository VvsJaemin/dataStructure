package chapter2.section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code02 {
    static Person1[] members = new Person1[100];
    static int n = 0;


    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(new File("input.txt"));
            while (in.hasNext()) {
                String nm = in.next();
                String nb = in.next();

                members[n] = new Person1(); // members는 객체 배열이기에 참조변수이므로 객체를 선언하여 name, number주소의 값을 가져온다.
                members[n].name = nm;
                members[n].number = nb;
                n++;
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("e = " + e);
        }

        for (int i = 0; i <n; i++) {
            System.out.println("members[i].name + members[i].number = " + members[i].name + members[i].number);

        }

    }
}
