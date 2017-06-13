import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {
    public static void main(String args[]) {
        String direction;
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        int posTX = initialTX;
        int posTY = initialTY;

        System.err.println(lightX);
        System.err.println(lightY);
        System.err.println(initialTX);
        System.err.println(initialTY);

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            // Write an action using System.out.println()
            if (posTX > lightX)
            {
                if (posTY > lightY)
                {
                    direction = "NW";
                    posTY -= 1;
                } else if (posTY < lightY)
                {
                    direction = "SW";
                    posTY += 1;
                } else
                {
                    direction = "W";
                }
                posTX -= 1;
            } else if (posTX < lightX)
            {
                if (posTY > lightY)
                {
                    direction = "NE";
                    posTY -= 1;
                } else if (posTY < lightY)
                {
                    direction = "SE";
                    posTY += 1;
                } else
                {
                    direction = "E";
                }
                posTX += 1;
            } else if (posTY > lightY)
            {
                direction = "N";
                posTY -= 1;
            } else
            {
                direction = "S";
                posTY += 1;
            }
            // To debug: System.err.println("Debug messages...");
            System.err.println(posTX);
            System.err.println(posTY);
            System.err.println(remainingTurns);

            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(direction);
        }
    }
}
