import java.util.Scanner;

public class Solution 
{
    public static int flagstones(int m, int n, int a)
    {
        return ((n + a - 1) / a) * ((m + a - 1) / a);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int m = input.nextInt();
        int a = input.nextInt();
        
        input.close();
        
        System.out.print(flagstones(n, m, a));
        

    }

}
