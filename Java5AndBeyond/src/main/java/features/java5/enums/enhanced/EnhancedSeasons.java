package features.java5.enums.enhanced;

import java.util.Arrays;
import java.util.List;

public enum EnhancedSeasons {
    SUMMER("Summer", 35, "Hot and sunny", Arrays.asList("Swimming", "Beach volleyball", "Picnics")),
    MONSOON("Monsoon", 28, "Rainy and humid", Arrays.asList("Indoor reading", "Board games", "Cooking")),
    AUTUMN("Autumn", 22, "Cool and crisp", Arrays.asList("Hiking", "Apple picking", "Photography")),
    WINTER("Winter", 10, "Cold and snowy", Arrays.asList("Skiing", "Hot chocolate", "Fireplaces")),
    SPRING("Spring", 25, "Mild and fresh", Arrays.asList("Gardening", "Outdoor sports", "Flower viewing"));

    private final String name;
    private final int avgTemperature;
    private final String description;
    private final List<String> activities;

    EnhancedSeasons(String name, int avgTemperature, String description, List<String> activities) {
        this.name = name;
        this.avgTemperature = avgTemperature;
        this.description = description;
        this.activities = activities;
    }

    // Basic getters
    public String getName() {
        return name;
    }

    public int getAvgTemperature() {
        return avgTemperature;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getActivities() {
        return activities;
    }

    // Enhanced methods
    public boolean isHot() {
        return avgTemperature > 30;
    }

    public boolean isCold() {
        return avgTemperature < 15;
    }

    public boolean isWarm() {
        return avgTemperature >= 20 && avgTemperature <= 30;
    }

    public String getTemperatureCategory() {
        if (isHot())
            return "Hot";
        if (isCold())
            return "Cold";
        if (isWarm())
            return "Warm";
        return "Moderate";
    }

    public boolean isGoodForOutdoorActivities() {
        return this != MONSOON && this != WINTER;
    }

    // Get next season
    public EnhancedSeasons getNextSeason() {
        EnhancedSeasons[] seasons = values();
        int nextIndex = (this.ordinal() + 1) % seasons.length;
        return seasons[nextIndex];
    }

    // Get previous season
    public EnhancedSeasons getPreviousSeason() {
        EnhancedSeasons[] seasons = values();
        int prevIndex = (this.ordinal() - 1 + seasons.length) % seasons.length;
        return seasons[prevIndex];
    }

    // Check if season is between two other seasons
    public boolean isBetween(EnhancedSeasons start, EnhancedSeasons end) {
        int currentOrdinal = this.ordinal();
        int startOrdinal = start.ordinal();
        int endOrdinal = end.ordinal();

        if (startOrdinal <= endOrdinal) {
            return currentOrdinal >= startOrdinal && currentOrdinal <= endOrdinal;
        } else {
            return currentOrdinal >= startOrdinal || currentOrdinal <= endOrdinal;
        }
    }

    // Get season by temperature preference
    public static EnhancedSeasons getSeasonByTemperaturePreference(String preference) {
        return switch (preference.toLowerCase()) {
            case "hot" -> SUMMER;
            case "cold" -> WINTER;
            case "mild", "moderate" -> SPRING;
            case "cool" -> AUTUMN;
            case "humid" -> MONSOON;
            default -> SPRING; // Default to spring
        };
    }

    // Get seasons suitable for specific activity
    public static List<EnhancedSeasons> getSeasonsForActivity(String activity) {
        return Arrays.stream(values())
                .filter(season -> season.getActivities().stream()
                        .anyMatch(act -> act.toLowerCase().contains(activity.toLowerCase())))
                .toList();
    }

    // Get hottest season
    public static EnhancedSeasons getHottestSeason() {
        return Arrays.stream(values())
                .max((s1, s2) -> Integer.compare(s1.getAvgTemperature(), s2.getAvgTemperature()))
                .orElse(SUMMER);
    }

    // Get coldest season
    public static EnhancedSeasons getColdestSeason() {
        return Arrays.stream(values())
                .min((s1, s2) -> Integer.compare(s1.getAvgTemperature(), s2.getAvgTemperature()))
                .orElse(WINTER);
    }

    @Override
    public String toString() {
        return String.format("%s (%d°C) - %s", name, avgTemperature, description);
    }

    // Detailed information
    public String getDetailedInfo() {
        return String.format(
                "Season: %s%n" +
                        "Average Temperature: %d°C (%s)%n" +
                        "Description: %s%n" +
                        "Popular Activities: %s%n" +
                        "Good for Outdoor Activities: %s%n" +
                        "Next Season: %s%n" +
                        "Previous Season: %s",
                name, avgTemperature, getTemperatureCategory(), description,
                String.join(", ", activities), isGoodForOutdoorActivities() ? "Yes" : "No",
                getNextSeason().getName(), getPreviousSeason().getName());
    }
}