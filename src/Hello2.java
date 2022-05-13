import java.util.Scanner;

public class Hello2 {
    public void say(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Hi! What do you wanna see written on screen?");
        String message = in.nextLine();
        new Hello2().say(message);
    }
}
