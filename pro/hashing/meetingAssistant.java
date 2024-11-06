package pro.hashing;

import java.util.Scanner;

public class meetingAssistant {
    public static int convertStringHourToIntAndMinutes(String s) {
        int u1 = s.charAt(0) - '0';
        int u5 = s.charAt(1) - '0';

        int v = (u1 * 10 + u5) * 60;

        u1 = s.charAt(3) - '0';
        u5 = s.charAt(4) - '0';

        v = v + (u1 * 10 + u5);

        return v;
    }

    public static void convertMinutesToHours(int ansFound) {
        int u = ansFound / 60;
        int y = ansFound % 60;

        if (u <= 9) {
            System.out.print("0");
            System.out.print(u);
        } else {
            System.out.print(u);
        }
        System.out.print(":");

        if (y <= 9) {
            System.out.print("0");
            System.out.print(y);
        } else {
            System.out.print(y);
        }
    }

/*
["10:30 10:35", "10:45 10:50"]
2
4
10:30
10:35 
10:45
10:50



*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        int k = 4;
        int[] y = new int[1441];
        String[] arr = new String[]{"10:30 10:35", "10:45 10:50"};
        for (int i = 0; i < arr.length; i++) {
            // String a = scanner.next();
            // String b = scanner.next();
            String data = arr[i];
            String[] parts = data.split(" ");
            String v1 = parts[0]; // First part
            String v5 = parts[1]; // Second part

            int startTime = convertStringHourToIntAndMinutes(v1);
            int endTime = convertStringHourToIntAndMinutes(v5);

            y[startTime]++;
            y[endTime + 1]--;
        }

        int i = 1;
        while (i < 1440) {
            y[i] = y[i] + y[i - 1];
            i++;
        }

        int count = 0;
        int ansFound = 0;

        for (int j = 0; j < 1440; j++) {
            if (y[j] == 0) {
                count++;

                if (count == k) {
                    convertMinutesToHours(j - k + 1); // convertStringHourToIntAndMinutes this to (hh:mm)
                    ansFound = 1;
                    break;
                }
            } else {
                count = 0;
            }
        }

        

        if (ansFound == 0) {
            System.out.println("-1");
        }
    }


    
}















