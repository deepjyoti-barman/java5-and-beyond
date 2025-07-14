package features.java5;

import java.util.Arrays;
import java.util.List;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] names = { "John", "Jane", "Jim", "Jill" };
        for (String name : names) {
            System.out.println(name);
        }

        List<String> namesList = Arrays.asList("John", "Jane", "Jim", "Jill");
        for (String name : namesList) {
            System.out.println(name);
        }
    }
}