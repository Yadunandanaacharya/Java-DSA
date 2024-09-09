package Step1HackerRank;

public class timeConversion {
    public static void main(String[] args) throws Exception {

    }

    public static String timeConversion(String s) {
        String hour = "";
        String amOrPm = "";
        StringBuilder updateString = new StringBuilder(s);
        hour = s.substring(0, 2);
        amOrPm = s.substring(8, 10);
        int hourInt = Integer.parseInt(hour);

        if (amOrPm.equals("PM")) {
            if (hourInt < 12) {
                hourInt = hourInt + 12;
                updateString.replace(0, 2, Integer.toString(hourInt));
            }
        } else if (amOrPm.equals("AM")) {
            if (hourInt == 12) {
                hourInt = 00;
                updateString.replace(0, 2, "00");
            }
        }
        updateString.delete(8, 10);
        return updateString.toString();

    }
}
