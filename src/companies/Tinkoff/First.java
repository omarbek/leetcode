package companies.Tinkoff;

public class First {
    public static void main(String[] args) {
        System.out.println(new First().countTime("??:??"));
        System.out.println(new First().countTime("0?:0?"));
        System.out.println(new First().countTime("?5:00"));
    }

    public int countTime(String time) {
        if ("??:??".equals(time)) {
            return 24 * 60;
        }
        int count = 1;
        if (time.charAt(0) == '?' && time.charAt(1) == '?') {
            count *= 24;
        } else if (time.charAt(0) == '?') {
            int num = Integer.parseInt(time.charAt(1) + "");
            if (num > 3) {
                count *= 2;
            } else {
                count *= 3;
            }
        } else if (time.charAt(1) == '?') {
            int num = Integer.parseInt(time.charAt(0) + "");
            if (num == 2) {
                count *= 4;
            } else {
                count *= 10;
            }
        }
        if (time.charAt(3) == '?') {
            count *= 6;
        }
        if (time.charAt(4) == '?') {
            count *= 10;
        }
        return count;
    }
}
