import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {
    public void say(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What do you want to see?");
        String message = in.readLine();
        new Hello().say(message);


    }
}
