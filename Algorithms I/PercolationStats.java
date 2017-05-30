import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;
import edu.princeton.cs.algs4.StdStats;
import java.util.Scanner;
import java.lang.*;

//java.lang.IllegalArgumentException (n <= 0 or trials <= 0)

public class PercolationStats {
    double[] percStats;
    // perform trials independent experiments on an n-by-n grid
    public PercolationStats(int n, int trials){
        percStats = new double[n];
    }
    
    // sample mean of percolation threshold
    public double mean(){
        return mean(percStats);
    }
    
    // sample standard deviation of percolation threshold
    public double stddev(){
        return stddev(percStats);
    }
    
    // low  endpoint of 95% confidence interval
    public double confidenceLo(){
        return 0.00;
    }
    
    // high endpoint of 95% confidence interval
    public double confidenceHi(){
        return 0.00;
    }
    
    // test client (described below)
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter one value for the square grid size: ");
        int n = reader.nextInt();
        System.out.println("Enter the number of trials for the test: ");
        int trials = reader.nextInt();
    }
}