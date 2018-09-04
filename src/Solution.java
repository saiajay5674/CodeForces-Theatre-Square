import java.util.Scanner;

public class Solution 
{
    public static double flagstones(long m, long n, long a)
    {
        double output = ((n + a - 1) / a) * ((m + a - 1) / a);
        
        return output;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        long n = input.nextInt();
        long m = input.nextInt();
        long a = input.nextInt();
        
        input.close();
        
        System.out.print(flagstones(n, m, a));
        

    }

}
