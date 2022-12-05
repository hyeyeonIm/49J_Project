import java.util.Scanner;
import java.util.Random;

// Java program to find the prime numbers
// between a given interval

public class PrimeNumber {


    public static void main(String[] args) {
        Random rand = new Random(); //instance of random class
        int upperbound = 25;
        //generate random values from 0-24
        int a = rand.nextInt(upperbound);
        int b = rand.nextInt(upperbound);
        int tmp;

//      ensure rand_a always lower bound & rand_b always upper bound
      if(a>b) {
    	  tmp = a;
    	  a = b;
    	  b = tmp;
      }
  
      System.out.println("Upper bound: "+a + "\n");
      System.out.println("Lower bound: "+b + "\n");

    //   Part for calculating the prime numbers

        while (a < b) {
            boolean flag = false;

            for(int i = 2; i <= a/2; ++i) {
                // condition for non-prime number
                if(a % i == 0) {
                    flag = true;
                    break;
                }
            }
              // need to change the print out to appending in an ArrayList
            if (!flag && a != 0 && a != 1)
                System.out.print(a + " ");

            ++a;
        }
    }
}
