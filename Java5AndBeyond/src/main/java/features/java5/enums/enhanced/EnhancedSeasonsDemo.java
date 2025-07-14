package features.java5.enums.enhanced;

import java.util.List;

public class EnhancedSeasonsDemo {

    public static void main(String[] args) {
        System.out.println("=== Enhanced Seasons Enum Demonstration ===\n");

        // Demonstrate all enhanced features
        demonstrateBasicInfo();
        demonstrateTemperatureCategories();
        demonstrateSeasonNavigation();
        demonstrateActivityMapping();
        demonstrateStaticMethods();
        demonstrateDetailedInfo();
    }

    private static void demonstrateBasicInfo() {
        System.out.println("1. Basic Information:");
        for (EnhancedSeasons season : EnhancedSeasons.values()) {
            System.out.println(season);
        }
        System.out.println();
    }

    private static void demonstrateTemperatureCategories() {
        System.out.println("2. Temperature Categories:");
        for (EnhancedSeasons season : EnhancedSeasons.values()) {
            System.out.printf("%s: %s (Hot: %s, Cold: %s, Warm: %s)%n",
                    season.getName(),
                    season.getTemperatureCategory(),
                    season.isHot(),
                    season.isCold(),
                    season.isWarm());
        }
        System.out.println();
    }

    private static void demonstrateSeasonNavigation() {
        System.out.println("3. Season Navigation:");
        EnhancedSeasons currentSeason = EnhancedSeasons.SUMMER;

        System.out.println("Current season: " + currentSeason.getName());
        System.out.println("Next season: " + currentSeason.getNextSeason().getName());
        System.out.println("Previous season: " + currentSeason.getPreviousSeason().getName());

        // Demonstrate isBetween method
        System.out.println("\nSeason relationships:");
        System.out.println("Is AUTUMN between SUMMER and WINTER? " +
                EnhancedSeasons.AUTUMN.isBetween(EnhancedSeasons.SUMMER, EnhancedSeasons.WINTER));
        System.out.println("Is SPRING between AUTUMN and SUMMER? " +
                EnhancedSeasons.SPRING.isBetween(EnhancedSeasons.AUTUMN, EnhancedSeasons.SUMMER));
        System.out.println();
    }

    private static void demonstrateActivityMapping() {
        System.out.println("4. Activity Mapping:");

        // Show activities for each season
        for (EnhancedSeasons season : EnhancedSeasons.values()) {
            System.out.println(season.getName() + " activities: " +
                    String.join(", ", season.getActivities()));
        }

        // Find seasons good for outdoor activities
        System.out.println("\nSeasons good for outdoor activities:");
        for (EnhancedSeasons season : EnhancedSeasons.values()) {
            if (season.isGoodForOutdoorActivities()) {
                System.out.println("- " + season.getName());
            }
        }
        System.out.println();
    }

    private static void demonstrateStaticMethods() {
        System.out.println("5. Static Methods:");

        // Temperature preferences
        System.out.println("Season for 'hot' preference: " +
                EnhancedSeasons.getSeasonByTemperaturePreference("hot").getName());
        System.out.println("Season for 'cold' preference: " +
                EnhancedSeasons.getSeasonByTemperaturePreference("cold").getName());
        System.out.println("Season for 'mild' preference: " +
                EnhancedSeasons.getSeasonByTemperaturePreference("mild").getName());

        // Activity-based season finding
        System.out.println("\nSeasons suitable for 'outdoor' activities:");
        List<EnhancedSeasons> outdoorSeasons = EnhancedSeasons.getSeasonsForActivity("outdoor");
        outdoorSeasons.forEach(season -> System.out.println("- " + season.getName()));

        System.out.println("\nSeasons suitable for 'games' activities:");
        List<EnhancedSeasons> gameSeasons = EnhancedSeasons.getSeasonsForActivity("games");
        gameSeasons.forEach(season -> System.out.println("- " + season.getName()));

        // Temperature extremes
        System.out.println("\nTemperature extremes:");
        System.out.println("Hottest season: " + EnhancedSeasons.getHottestSeason().getName());
        System.out.println("Coldest season: " + EnhancedSeasons.getColdestSeason().getName());
        System.out.println();
    }

    private static void demonstrateDetailedInfo() {
        System.out.println("6. Detailed Information Example:");
        System.out.println("=".repeat(50));
        System.out.println(EnhancedSeasons.SPRING.getDetailedInfo());
        System.out.println("=".repeat(50));
        System.out.println();

        System.out.println("7. Practical Usage Example:");
        demonstratePracticalUsage();
    }

    private static void demonstratePracticalUsage() {
        // Simulate a travel planning application
        System.out.println("Travel Planning Application:");

        String userPreference = "mild";
        String desiredActivity = "outdoor";

        EnhancedSeasons recommendedSeason = EnhancedSeasons.getSeasonByTemperaturePreference(userPreference);
        List<EnhancedSeasons> activitySeasons = EnhancedSeasons.getSeasonsForActivity(desiredActivity);

        System.out.println("User prefers: " + userPreference + " weather");
        System.out.println("User wants: " + desiredActivity + " activities");
        System.out.println("Recommended season: " + recommendedSeason.getName());
        System.out.println("All seasons with outdoor activities: " +
                activitySeasons.stream()
                        .map(EnhancedSeasons::getName)
                        .reduce((a, b) -> a + ", " + b)
                        .orElse("None"));

        // Check if recommended season is good for outdoor activities
        if (recommendedSeason.isGoodForOutdoorActivities()) {
            System.out.println("✓ Perfect! " + recommendedSeason.getName() + " is great for outdoor activities!");
        } else {
            System.out
                    .println("⚠ Note: " + recommendedSeason.getName() + " might not be ideal for outdoor activities.");
            System.out.println("  Consider " + activitySeasons.get(0).getName() + " instead.");
        }

        System.out.println("\nWeather forecast for " + recommendedSeason.getName() + ":");
        System.out.println("Temperature: " + recommendedSeason.getAvgTemperature() + "°C");
        System.out.println("Description: " + recommendedSeason.getDescription());
        System.out.println("Suggested activities: " + String.join(", ", recommendedSeason.getActivities()));
    }
}