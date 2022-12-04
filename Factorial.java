import java.util.Random;
import java.util.ArrayList;

public class Factorial {

    public static void main(String[] args) {
        Random rand = new Random();
        int upperbound = 6;
        ArrayList<Long> result = new ArrayList<>(1);

        // any number between 1 and five
        int num = rand.nextInt(upperbound);
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
        // match with list2 in 
        result.add(factorial);
        System.out.println(result);
        

    }
    // the recursive function 
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }
}