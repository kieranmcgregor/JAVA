import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] pis = new int[N];

        for (int i = 0; i < N; i++)
        {
            int pi = in.nextInt();
            pis[i] = pi;
        }

        Arrays.sort(pis);

        int closest_strength = pis[pis.length - 1] - pis[0];

        for (int j = 0; j < (N - 1); j++)
        {
            // System.err.println(pis[j]);
            // System.err.println(pis[j + 1]);

            int d_strength = Math.abs(pis[j] - pis[j + 1]);

            if (d_strength < closest_strength)
            {
                closest_strength = d_strength;
            }
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(closest_strength);
    }
}
