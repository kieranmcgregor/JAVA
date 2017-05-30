//import edu.princeton.cs.algs4.StdRandom;
//import edu.princeton.cs.algs4.StdStats;
//import edu.princeton.cs.algs4.WeightedQuickUnionUF;
import java.util.Arrays;

//corner cases java.lang.IndexOutOfBoundsException (not in grid) &
//java.lang.IllegalArgumentException (when n <= 0)

public class Percolation {
    int[][] openSites;
    int[][] grid;
    
    // create n-by-n grid, with all sites blocked
    public Percolation(int n) {
        openSites = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                grid[i][j] = i + j;
            }
        }
    }
    
    // open site (row, col) if it is not open already
    public void open(int row, int col) {
    }
    
    // is site (row, col) open?
    public boolean isOpen(int row, int col) {
        return false;
    }
    
    // is site (row, col) full?
    public boolean isFull(int row, int col) {
        return false;
    }
    
    // does the system percolate?
    public boolean percolates() {
        return false;
    }
    
    // test client (optional)
    public static void main(String[] args) {
    }
}