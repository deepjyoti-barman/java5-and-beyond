package features.java5;

import java.util.ArrayList;
import java.util.List;

/**
 * AutoBoxing and Unboxing examples introduced in Java 5
 * 
 * AutoBoxing: Automatic conversion from primitive to wrapper object
 * Unboxing: Automatic conversion from wrapper object to primitive
 */
public class AutoBoxing {

    public static void main(String[] args) {
        System.out.println("=== AutoBoxing and Unboxing Examples ===\n");

        basicAutoBoxingExamples();
        basicUnboxingExamples();
        collectionsExample();
        methodParameterExample();
        arithmeticOperationsExample();
        comparisonExample();
        nullPointerExample();
    }

    /**
     * Basic AutoBoxing examples - primitive to wrapper conversion
     */
    private static void basicAutoBoxingExamples() {
        System.out.println("1. Basic AutoBoxing Examples:");

        // AutoBoxing: int to Integer
        int primitiveInt = 42;
        Integer wrapperInt = primitiveInt; // Automatic boxing
        System.out.println("int " + primitiveInt + " -> Integer " + wrapperInt);

        // Direct assignment with literal values
        Integer directBoxing = 100; // int literal automatically boxed to Integer
        Double directBoxingDouble = 2.5; // double literal automatically boxed to Double

        System.out.println("Direct boxing: " + directBoxing + ", " + directBoxingDouble);
        System.out.println();
    }

    /**
     * Basic Unboxing examples - wrapper to primitive conversion
     */
    private static void basicUnboxingExamples() {
        System.out.println("2. Basic Unboxing Examples:");

        // Unboxing: Boolean to boolean
        Boolean wrapperBool = true;
        boolean primitiveBool = wrapperBool; // Automatic unboxing
        System.out.println("Boolean " + wrapperBool + " -> boolean " + primitiveBool);

        // Unboxing in expressions
        Integer num1 = 10;
        Integer num2 = 20;
        int result = num1 + num2; // Both Integer objects are unboxed for arithmetic
        System.out.println("Integer " + num1 + " + Integer " + num2 + " = int " + result);
        System.out.println();
    }

    /**
     * AutoBoxing in Collections - very common use case
     */
    private static void collectionsExample() {
        System.out.println("3. AutoBoxing in Collections:");

        // Before Java 5, you had to manually box primitives
        // List<Integer> numbers = new ArrayList<>();
        // numbers.add(new Integer(1)); // Manual boxing (old way)

        // With AutoBoxing, primitives are automatically boxed
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1); // int automatically boxed to Integer
        numbers.add(2); // int automatically boxed to Integer
        numbers.add(3); // int automatically boxed to Integer

        System.out.println("List with autoboxed integers: " + numbers);

        // Unboxing when retrieving from collections
        int firstNumber = numbers.get(0); // Integer automatically unboxed to int
        System.out.println("First number (unboxed): " + firstNumber);

        // Enhanced for loop with unboxing
        System.out.print("Iterating with unboxing: ");
        for (int num : numbers) { // Each Integer is unboxed to int
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * AutoBoxing with method parameters
     */
    private static void methodParameterExample() {
        System.out.println("4. AutoBoxing with Method Parameters:");

        // Method that takes wrapper objects
        printBoolean(true); // boolean automatically boxed to Boolean

        // Method that takes primitives
        Double wrapperDecimal = 2.5;
        processPrimitive(wrapperDecimal); // Double automatically unboxed to double

        System.out.println();
    }

    // Helper methods for method parameter example
    private static void printBoolean(Boolean flag) {
        System.out.println("Received Boolean: " + flag);
    }

    private static void processPrimitive(double num) {
        System.out.println("Processing double: " + num);
    }

    /**
     * AutoBoxing in arithmetic operations
     */
    private static void arithmeticOperationsExample() {
        System.out.println("5. AutoBoxing in Arithmetic Operations:");

        // Mixed arithmetic with primitives and wrappers
        Integer wrapperA = 10;
        int primitiveB = 5;

        // Wrapper is unboxed for arithmetic, result is primitive
        int result1 = wrapperA + primitiveB; // wrapperA unboxed to int
        System.out.println("Integer " + wrapperA + " + int " + primitiveB + " = " + result1);

        // Result can be autoboxed back to wrapper
        Integer result2 = wrapperA * primitiveB; // wrapperA unboxed, then result boxed
        System.out.println("Integer " + wrapperA + " * int " + primitiveB + " = Integer " + result2);

        // Both operands are wrappers
        Integer num1 = 20;
        Integer num2 = 3;
        int division = num1 / num2; // Both unboxed for arithmetic
        System.out.println("Integer " + num1 + " / Integer " + num2 + " = int " + division);

        // Increment/decrement operations
        Integer counter = 5;
        counter++; // Unboxed to int, incremented, then boxed back to Integer
        System.out.println("After increment: " + counter);

        System.out.println();
    }

    /**
     * AutoBoxing in comparison operations
     */
    private static void comparisonExample() {
        System.out.println("6. AutoBoxing in Comparisons:");

        Integer wrapperNum = 100;
        int primitiveNum = 100;

        // Comparison with unboxing
        boolean isEqual = (wrapperNum == primitiveNum); // wrapperNum unboxed for comparison
        System.out.println("Integer " + wrapperNum + " == int " + primitiveNum + ": " + isEqual);

        // Comparison between wrapper objects (be careful!)
        Integer a = 127; // Cached
        Integer b = 127; // Same cached object
        Integer c = 128; // New object
        Integer d = 128; // Different new object

        System.out.println("Integer 127 == Integer 127: " + (a == b)); // true (cached)
        System.out.println("Integer 128 == Integer 128: " + (c == d)); // false (different objects)

        // Use .equals() for wrapper comparison
        System.out.println("Integer 128 .equals() Integer 128: " + c.equals(d)); // true

        // Comparison with relational operators (unboxing happens)
        Integer x = 50;
        Integer y = 30;
        boolean isGreater = x > y; // Both unboxed for comparison
        System.out.println("Integer " + x + " > Integer " + y + ": " + isGreater);

        System.out.println();
    }

    /**
     * Important warning about NullPointerException
     */
    private static void nullPointerExample() {
        System.out.println("7. NullPointerException Warning:");

        // This can cause NullPointerException
        Integer nullWrapper = null;

        System.out.println("Wrapper is null: " + nullWrapper);

        // Uncommenting the following line will cause NullPointerException
        // int primitive = nullWrapper; // Trying to unbox null!

        System.out.println("⚠️  WARNING: Unboxing null wrapper objects causes NullPointerException!");
        System.out.println("   Always check for null before unboxing:");
        System.out.println("   if (nullWrapper != null) { int value = nullWrapper; }");

        // Safe unboxing
        if (nullWrapper != null) {
            int safeValue = nullWrapper;
            System.out.println("Safe unboxing: " + safeValue);
        } else {
            System.out.println("Wrapper is null, cannot unbox safely");
        }

        System.out.println();
    }
}
