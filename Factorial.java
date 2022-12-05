import java.util.Random;
import java.util.ArrayList;

public class Factorial {
    
    // the recursive function 
    public static int multiplyNumbers(int num)
    {
        if (num <= 1)
            return num;
        else
            return multiplyNumbers(num-1)*num;
    }
    public static void main(String[] args) {
        // Random rand = new Random();
        // int upperbound = 6;
        // ArrayList<Long> result = new ArrayList<>(1);
        
        // // any number between 1 and five
        // int num = rand.nextInt(upperbound);
        // // int num = num2;
        // long factorial = multiplyNumbers(num);
        // System.out.println("Factorial of " + num + " = " + factorial);
        // // match with list2 in 
        // result.add(factorial);
        // System.out.println(result);
        int a = multiplyNumbers(7);
        System.out.println(a);
        // multiplyNumbers(5);
    }
}