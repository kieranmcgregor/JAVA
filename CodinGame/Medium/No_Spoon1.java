import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Don't let the machines win. You are humanity's last hope...
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt(); // the number of cells on the X axis
        int height = in.nextInt(); // the number of cells on the Y axis

        System.err.println(width);
        System.err.println(height);

        String[][] grid = new String[width][height];

        if (in.hasNextLine())
        {
            in.nextLine();
        }

        for (int i = 0; i < height; i++)
        {
            String line = in.nextLine(); // width characters, each either 0 or .
            String[] nodes = line.split("");

            for (int j = 0; j < width; j++)
            {
                grid[i][j] = nodes[j];

                System.err.println(i);
                System.err.println(j);
                System.err.println(grid[i][j]);
            }
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");


        // Three coordinates: a node, its right neighbor, its bottom neighbor
        System.out.println("0 0 1 0 0 1");
    }
}
