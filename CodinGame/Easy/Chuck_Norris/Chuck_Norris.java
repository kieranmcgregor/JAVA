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

        String MESSAGE = in.nextLine();
        char[] ch = MESSAGE.toCharArray();

        StringBuilder binary = new StringBuilder();
        StringBuilder cn_binary = new StringBuilder();

        for (char c : ch)
        {
            int temp = (int)c;
            binary.append(Integer.toBinaryString(temp));
            binary.append(' ');
        }

        String temp_bin = binary.toString();
        String[] sa_bin_els = temp_bin.split(" ");

        int bin = -1;

        for (String sa_el : sa_bin_els)
        {

            if (sa_el.length() < 7)
            {
                String temp_sa_el = "0" + sa_el;
                sa_el = temp_sa_el;
            }

            String[] st_nums = sa_el.split("");

            for (String st_num : st_nums)
            {
                int num = Integer.parseInt(st_num);

                if (bin == -1)
                {
                    if (num == 0)
                    {
                        cn_binary.append("00" + " " + "0");
                        bin = num;
                    } else if (num == 1)
                    {
                        cn_binary.append("0" + " " + "0");
                        bin = num;
                    }
                } else if (bin == num)
                {
                    cn_binary.append("0");
                } else if (num == 0)
                {
                    cn_binary.append(" " + "00" + " " + "0");
                    bin = num;
                } else if (num == 1)
                {
                    cn_binary.append(" " + "0" + " " + "0");
                    bin = num;
                }
            }
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(cn_binary);
    }
}
