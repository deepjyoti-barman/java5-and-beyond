package features.java14.switchexpression;

public class F03_SwitchExpressionUsingYield {

    public static void main(String[] args) {
        String day = "Mon";

        String alarmTime = switch (day) {
            case "Sat", "Sun" -> {
                System.out.println("Weekend");
                yield "10:00 AM";
            }
            case "Wed" -> "8:00 AM";
            default -> "7:00 AM";
        };

        System.out.println(alarmTime);
    }
}
