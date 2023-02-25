package companies.mercari;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PreprocessDate {
    public static void main(String[] args) {
        List<String> dates = new ArrayList<>();
        dates.add("1st Mar 1974");
        dates.add("22nd Jan 2013");
        dates.add("7th Apr 1904");
        List<String> strings = preprocessDate(dates);
        System.out.println();
    }

    public static List<String> preprocessDate(List<String> dates) {
        List<String> ret = new ArrayList<>();
        for (String date : dates) {
            StringTokenizer st = new StringTokenizer(date, " ");
            int dayToInt = 0, month = 0, year = 0;
            while (st.hasMoreTokens()) {
                String token = st.nextToken();
                dayToInt = convertDayToInt(token);
                token = st.nextToken();
                month = getMonth(token);
                token = st.nextToken();
                year = Integer.parseInt(token);
            }
            LocalDate localDate = LocalDate.of(year, month, dayToInt);
            ret.add(localDate.toString());
        }
        return ret;
    }

    private static int getMonth(String token) {
        switch (token) {
            case "Jan":
                return 1;
            case "Feb":
                return 2;
            case "Mar":
                return 3;
            case "Apr":
                return 4;
            case "May":
                return 5;
            case "Jun":
                return 6;
            case "Jul":
                return 7;
            case "Aug":
                return 8;
            case "Sep":
                return 9;
            case "Oct":
                return 10;
            case "Nov":
                return 11;
            case "Dec":
                return 12;
        }
        return 0;
    }

    private static int convertDayToInt(String day) {
        String temp = "";
        for (int i = 0; i < day.length(); i++) {
            try {
                int num = Integer.parseInt(day.charAt(i) + "");
                temp += num;
            } catch (NumberFormatException e) {
                break;
            }
        }
        return Integer.parseInt(temp);
    }
}
