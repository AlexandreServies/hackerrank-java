package algorithms.warmup;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();

        solve(time);
    }

    private static void solve(String time) {
        int hours = Integer.parseInt(time.substring(0, 2)) % 12; //Handle midnight/noon case
        if (time.substring(8).equals("PM")) {
            hours = hours + 12;
        }
        System.out.println(String.format("%02d", hours) + time.substring(2, 8));
    }
}
