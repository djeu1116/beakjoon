package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int[] count = new int[10];

        for (int i = 0; i < n.length(); i++) {
            count[n.charAt(i) - '0'] ++;
        }

        int sixNineCount = (count[6] + count[9] + 1) / 2;
        count[6] = sixNineCount;
        count[9] = 0;

        int maxSets = 0;
        for (int numCount : count) {
            if (numCount > maxSets) {
                maxSets = numCount;
            }
        }
        System.out.println(maxSets);
    }
}
