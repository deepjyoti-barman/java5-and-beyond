package features.java5.enums.basic;

import java.util.*;
import java.util.stream.Collectors;

public class SeasonsDemo {

    public static void main(String[] args) {
        System.out.println("=== Seasons Enum Use Cases ===\n");

        // Use Case 1: Basic enum usage
        basicEnumUsage();

        // Use Case 2: Switch statements with enums
        switchWithEnums();

        // Use Case 3: Enum comparison
        enumComparison();

        // Use Case 4: Enum in collections
        enumInCollections();

        // Use Case 5: Enum with custom methods
        enumWithCustomMethods();

        // Use Case 6: Enum ordinal and values
        enumOrdinalAndValues();

        // Use Case 7: Enum in conditional logic
        enumInConditionalLogic();

        // Use Case 8: Enum with streams
        enumWithStreams();

        // Use Case 9: Enum as Map keys
        enumAsMapKeys();

        // Use Case 10: Enum with business logic
        enumWithBusinessLogic();
    }

    // Use Case 1: Basic enum usage
    public static void basicEnumUsage() {
        System.out.println("1. Basic Enum Usage:");
        Seasons currentSeason = Seasons.SUMMER;
        System.out.println("Current season: " + currentSeason);
        System.out.println("Season name: " + currentSeason.getName());
        System.out.println();
    }

    // Use Case 2: Switch statements with enums
    public static void switchWithEnums() {
        System.out.println("2. Switch Statements with Enums:");
        for (Seasons season : Seasons.values()) {
            String activity = switch (season) {
                case SUMMER -> "Swimming and beach activities";
                case MONSOON -> "Indoor activities and reading";
                case AUTUMN -> "Hiking and nature walks";
                case WINTER -> "Skiing and hot chocolate";
                case SPRING -> "Gardening and outdoor sports";
            };
            System.out.println(season.getName() + " -> " + activity);
        }
        System.out.println();
    }

    // Use Case 3: Enum comparison
    public static void enumComparison() {
        System.out.println("3. Enum Comparison:");
        Seasons season1 = Seasons.WINTER;
        Seasons season2 = Seasons.SPRING;

        System.out.println("season1 == season2: " + (season1 == season2));
        System.out.println("season1.equals(season2): " + season1.equals(season2));
        System.out.println("season1.compareTo(season2): " + season1.compareTo(season2));
        System.out.println();
    }

    // Use Case 4: Enum in collections
    public static void enumInCollections() {
        System.out.println("4. Enum in Collections:");
        List<Seasons> favoriteSeasons = Arrays.asList(Seasons.SPRING, Seasons.AUTUMN);
        Set<Seasons> warmSeasons = EnumSet.of(Seasons.SUMMER, Seasons.SPRING);

        System.out.println("Favorite seasons: " + favoriteSeasons);
        System.out.println("Warm seasons: " + warmSeasons);
        System.out.println("Is SUMMER in warm seasons? " + warmSeasons.contains(Seasons.SUMMER));
        System.out.println();
    }

    // Use Case 5: Enum with custom methods
    public static void enumWithCustomMethods() {
        System.out.println("5. Enum with Custom Methods:");
        for (Seasons season : Seasons.values()) {
            System.out.println("Season: " + season + ", Name: " + season.getName());
        }
        System.out.println();
    }

    // Use Case 6: Enum ordinal and values
    public static void enumOrdinalAndValues() {
        System.out.println("6. Enum Ordinal and Values:");
        System.out.println("Total seasons: " + Seasons.values().length);

        for (Seasons season : Seasons.values()) {
            System.out.println(season + " ordinal: " + season.ordinal());
        }

        // Getting enum by name
        Seasons seasonByName = Seasons.valueOf("WINTER");
        System.out.println("Season by name 'WINTER': " + seasonByName);
        System.out.println();
    }

    // Use Case 7: Enum in conditional logic
    public static void enumInConditionalLogic() {
        System.out.println("7. Enum in Conditional Logic:");
        Seasons currentSeason = Seasons.WINTER;

        if (currentSeason == Seasons.WINTER || currentSeason == Seasons.AUTUMN) {
            System.out.println("Time to wear warm clothes!");
        } else if (currentSeason == Seasons.SUMMER) {
            System.out.println("Time for summer vacation!");
        } else {
            System.out.println("Perfect weather for outdoor activities!");
        }
        System.out.println();
    }

    // Use Case 8: Enum with streams
    public static void enumWithStreams() {
        System.out.println("8. Enum with Streams:");

        // Filter seasons containing 'S'
        List<String> seasonsWithS = Arrays.stream(Seasons.values())
                .map(Seasons::getName)
                .filter(name -> name.toLowerCase().contains("s"))
                .collect(Collectors.toList());

        System.out.println("Seasons with 'S': " + seasonsWithS);

        // Count seasons with more than 6 characters
        long longNameCount = Arrays.stream(Seasons.values())
                .map(Seasons::getName)
                .filter(name -> name.length() > 6)
                .count();

        System.out.println("Seasons with more than 6 characters: " + longNameCount);
        System.out.println();
    }

    // Use Case 9: Enum as Map keys
    public static void enumAsMapKeys() {
        System.out.println("9. Enum as Map Keys:");
        Map<Seasons, String> seasonColors = new EnumMap<>(Seasons.class);
        seasonColors.put(Seasons.SUMMER, "Yellow");
        seasonColors.put(Seasons.MONSOON, "Gray");
        seasonColors.put(Seasons.AUTUMN, "Orange");
        seasonColors.put(Seasons.WINTER, "White");
        seasonColors.put(Seasons.SPRING, "Green");

        seasonColors.forEach((season, color) -> System.out.println(season.getName() + " -> " + color));
        System.out.println();
    }

    // Use Case 10: Enum with business logic
    public static void enumWithBusinessLogic() {
        System.out.println("10. Enum with Business Logic:");

        // Calculate average temperature by season
        Map<Seasons, Integer> avgTemperature = Map.of(
                Seasons.SUMMER, 35,
                Seasons.MONSOON, 28,
                Seasons.AUTUMN, 22,
                Seasons.WINTER, 10,
                Seasons.SPRING, 25);

        Seasons hottestSeason = avgTemperature.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println("Hottest season: " + (hottestSeason != null ? hottestSeason.getName() : "Unknown"));

        // Check if season is suitable for outdoor activities
        checkOutdoorSuitability(Seasons.SPRING);
        checkOutdoorSuitability(Seasons.MONSOON);
        System.out.println();
    }

    private static void checkOutdoorSuitability(Seasons season) {
        boolean suitable = season != Seasons.MONSOON && season != Seasons.WINTER;
        System.out.println(
                season.getName() + " is " + (suitable ? "suitable" : "not suitable") + " for outdoor activities");
    }
}