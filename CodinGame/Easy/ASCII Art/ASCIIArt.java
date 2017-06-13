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
        int L = in.nextInt();
        int H = in.nextInt();

        String[] ROWS = new String[H];
        String printout;

        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine().toUpperCase();
        char[] ch = T.toCharArray();

        for (int i = 0; i < H; i++)
        {
            String NEWROW = in.nextLine();
            ROWS[i] = NEWROW;
            printout = "";

            for (char c : ch)
            {
                String ROW = ROWS[i];
                // Write an action using System.out.println()
                // To debug: System.err.println("Debug messages...");
                int temp = (int)c - 1;
                int temp_integer = 64;
                int position = temp - temp_integer;

                if (position < 0 || position > 25)
                {
                    position = 26;
                }

                int start = ((position) * L);
                printout += ROW.substring(start, (start + L));
            }
             System.out.println(printout);
        }
    }
}
