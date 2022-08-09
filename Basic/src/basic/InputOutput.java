package basic;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        System.out.print("Hello,Type your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Wallcome dear,your name is = " +  name);
    }
}
