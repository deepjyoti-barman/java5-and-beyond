package features.java5.enums.basic;

/**
 * Represents the different seasons of the year.
 * Each season has a display name.
 */
public enum Seasons {
    SUMMER("Summer"),
    MONSOON("Monsoon"),
    AUTUMN("Autumn"),
    WINTER("Winter"),
    SPRING("Spring");

    private final String name;

    private Seasons(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Season name cannot be null or empty");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
