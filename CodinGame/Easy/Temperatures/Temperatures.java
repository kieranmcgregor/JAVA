import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        int current_closest = 5527;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        if (in.hasNextLine()) {
            in.nextLine();
        }

        String tempS = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526
        String[] temps = tempS.split(" ");

        // Write an action using System.out.println()
        if (n > 0)
        {
            for (int i = 0; i < temps.length; i++)
            {
                int temp = Integer.parseInt(temps[i]);
                System.err.println(temp);
                if (Math.abs(temp) < Math.abs(current_closest))
                {
                    current_closest = temp;
                } else if (Math.abs(temp) == Math.abs(current_closest))
                {
                    if (temp > 0)
                    {
                        current_closest = temp;
                    }
                }
            }
        } else
        {
            current_closest = 0;
        }

        // To debug: System.err.println("Debug messages...");
        System.err.println(n);
        System.err.println(tempS);

        System.out.println(current_closest);
    }
}
