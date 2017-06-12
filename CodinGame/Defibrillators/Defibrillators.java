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
        String LON = in.next();
        String LAT = in.next();
        int N = in.nextInt();

        float F_LON = Float.parseFloat(LON.replaceAll(",", "."));
        float F_LAT = Float.parseFloat(LAT.replaceAll(",", "."));
        String answer = "";
        double shortest_dist = 0;

        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            String[] deets = DEFIB.split(";");

            int pos = Integer.parseInt(deets[0]);

            float defib_lon = Float.parseFloat(deets[4].replaceAll(",", "."));
            float defib_lat = Float.parseFloat(deets[5].replaceAll(",", "."));

            double x = Math.abs(F_LON - defib_lon);
            double y = Math.abs(F_LAT - defib_lat);

            double dist = Math.sqrt((x*x) + (y*y));

            if (pos == 1 || dist < shortest_dist)
            {
                shortest_dist = dist;
                answer = deets[1];
            }
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(answer);
    }
}
