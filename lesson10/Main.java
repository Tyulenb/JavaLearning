package lesson10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyStack st = new MyStack();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter five strings, you will get them in the reverse order");
        for(int i = 0; i < 5; i++){
            System.out.println("Enter string ¹"+(i+1));
            st.push(in.nextLine());
        }

        MyStack cl = (MyStack) st.clone();

        System.out.println("The result is: ");
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

        System.out.println("One more time by clone: ");

        while(!cl.isEmpty()){
            System.out.println(cl.pop());
        }
    }
}
