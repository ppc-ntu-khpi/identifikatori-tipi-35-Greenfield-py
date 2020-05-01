package test;

/**
 * This class is responsible for the calculations
 * @author Stanislav
 */
public class calculations 
{
    /**
     * This method is responsible for the calculations
     * @param n
     * @return calculation result
     */
   public static String metod(int n)
    {
     String res = "";
     for (int i = 1; i <= n; i++)
     {
     if(0 == (n % i))
     res += i+ ",";
     }
     return res;
    }
}
