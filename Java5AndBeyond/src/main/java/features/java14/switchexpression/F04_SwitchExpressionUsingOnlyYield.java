package features.java14.switchexpression;

public class F04_SwitchExpressionUsingOnlyYield {

    public static void main(String[] args) {
        String day = "Mon";

        String alarmTime = switch (day) {
            case "Sat", "Sun":
                yield "10:00 AM";
            case "Wed":
                yield "8:00 AM";
            default:
                yield "7:00 AM";
        };

        System.out.println(alarmTime);
    }
}
