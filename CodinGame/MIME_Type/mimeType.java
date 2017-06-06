import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        String mime_type = "UNKNOWN";
        Map<String, String> map = new HashMap<String, String>();

        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.

            System.err.println(EXT);
            // System.err.println(MT);

            map.put(EXT, MT);

            // System.err.println(map.get(EXT));
        }
        in.nextLine();
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            System.err.println(FNAME);

            int last_dot_i = FNAME.lastIndexOf(".");
            int sub_start = last_dot_i + 1;
            String file_ext = FNAME.substring(sub_start);

            System.err.println(file_ext);
            System.err.println(map.get(file_ext) != null);

            if (map.get(file_ext) != null)
            {
                mime_type = map.get(file_ext);
            }

            System.err.println(mime_type);

            // For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
            System.out.println(mime_type);
        }
    }
}
