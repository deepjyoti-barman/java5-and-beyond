package features.java11;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {
        String text = "  Hello World  ";

        boolean empty = text.isBlank();
        System.out.println(empty);

        String stripped = text.strip();
        System.out.println(stripped);

        String leftStripped = text.stripLeading();
        System.out.println(leftStripped);

        String rightStripped = text.stripTrailing();
        System.out.println(rightStripped);

        String[] lines = "Line1\nLine2".lines().toArray(String[]::new);
        System.out.println(Arrays.toString(lines));

        String repeated = "Java".repeat(3);
        System.out.println(repeated);
    }
}
