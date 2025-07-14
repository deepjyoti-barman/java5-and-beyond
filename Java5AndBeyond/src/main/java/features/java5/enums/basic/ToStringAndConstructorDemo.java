package features.java5.enums.basic;

public class ToStringAndConstructorDemo {

    public static void main(String[] args) {
        System.out.println("=== toString() Method and Private Constructor Demo ===\n");

        demonstrateToStringMethod();
        demonstratePrivateConstructor();
        demonstrateToStringInCollections();
        demonstrateToStringInStringConcatenation();
    }

    // Demonstrate the toString() method
    private static void demonstrateToStringMethod() {
        System.out.println("1. toString() Method Demonstration:");

        Seasons summer = Seasons.SUMMER;
        Seasons winter = Seasons.WINTER;

        // Without custom toString(), it would print "SUMMER"
        // With custom toString(), it prints "Summer"
        System.out.println("Season: " + summer);
        System.out.println("Season: " + winter);

        // Explicit toString() call
        System.out.println("Explicit toString(): " + summer.toString());

        // Comparison with name() method (built-in enum method)
        System.out.println("name() method: " + summer.name()); // Returns "SUMMER"
        System.out.println("toString() method: " + summer.toString()); // Returns "Summer"
        System.out.println("getName() method: " + summer.getName()); // Returns "Summer"

        System.out.println();
    }

    // Demonstrate why private constructor is important
    private static void demonstratePrivateConstructor() {
        System.out.println("2. Private Constructor Demonstration:");

        // This shows that enums can ONLY be created through predefined constants
        Seasons spring = Seasons.SPRING; // ✓ Valid - using predefined constant

        // The following would NOT compile if you tried it:
        // Seasons custom = new Seasons("Custom"); // ✗ Error! Constructor is private

        System.out.println("✓ Can create enum using predefined constants: " + spring);
        System.out.println("✗ Cannot create new enum instances with 'new' keyword");
        System.out.println("   This ensures type safety and controlled instances");

        // Show that all instances are the same reference
        Seasons spring1 = Seasons.SPRING;
        Seasons spring2 = Seasons.SPRING;
        System.out.println("spring1 == spring2: " + (spring1 == spring2)); // true
        System.out.println("Same reference in memory: " + (spring1 == spring2));

        System.out.println();
    }

    // Demonstrate toString() in collections
    private static void demonstrateToStringInCollections() {
        System.out.println("3. toString() in Collections:");

        // Create an array of seasons
        Seasons[] seasons = { Seasons.SUMMER, Seasons.WINTER, Seasons.SPRING };

        System.out.println("Array contents:");
        for (Seasons season : seasons) {
            System.out.println("  " + season); // Uses custom toString()
        }

        // When printing collections, toString() is automatically called
        java.util.List<Seasons> seasonList = java.util.Arrays.asList(seasons);
        System.out.println("List: " + seasonList); // Uses toString() for each element

        System.out.println();
    }

    // Demonstrate toString() in string concatenation
    private static void demonstrateToStringInStringConcatenation() {
        System.out.println("4. toString() in String Operations:");

        Seasons currentSeason = Seasons.AUTUMN;

        // toString() is automatically called in string concatenation
        String message = "Current season is " + currentSeason;
        System.out.println(message);

        // Using in formatted strings
        String formatted = String.format("Welcome to %s season!", currentSeason);
        System.out.println(formatted);

        // Using in System.out.printf
        System.out.printf("Temperature in %s: %s%n", currentSeason, "22°C");

        // Building user-friendly messages
        System.out.println("Weather report: " + currentSeason + " brings cool weather.");

        System.out.println();

        // Show the difference between toString() and name()
        System.out.println("Comparison:");
        System.out.println("Using toString(): The season " + currentSeason.toString() + " is beautiful");
        System.out.println("Using name():     The season " + currentSeason.name() + " is beautiful");
        System.out.println("Using getName():  The season " + currentSeason.getName() + " is beautiful");
    }
}