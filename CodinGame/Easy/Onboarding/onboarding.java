import java.util.*;

class Player {

    public static void main(String []args) {
        System.out.println("Enter enemy1 name & distance and enemy2 name & distance:");
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            String enemy1 = in.next(); // name of enemy 1
            int dist1 = in.nextInt(); // distance to enemy 1
            String enemy2 = in.next(); // name of enemy 2
            int dist2 = in.nextInt(); // distance to enemy 2

            // Write an action using System.out.println()
            if (dist1 < dist2)
            {
                System.out.println(enemy1);
            } else
            {
                System.out.println(enemy2);
            }
        }
    }
}
