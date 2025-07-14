package features.java14.switchexpression;

public class F01_SwitchStatement {

    public static void main(String[] args) {
        String day = "Mon";
        String alarmTime = "";

        switch (day) {
            case "Sat":
            case "Sun":
                alarmTime = "10:00 AM";
                break;
            case "Wed":
                alarmTime = "8:00 AM";
                break;
            default:
                alarmTime = "7:00 AM";
        }

        System.out.println(alarmTime);
    }
}
