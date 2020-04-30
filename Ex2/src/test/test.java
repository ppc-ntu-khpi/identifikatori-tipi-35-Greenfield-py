package test;

/**
 * library for connecting a scanner
 */
import java.util.Scanner;
/**
 * Class is responsible for outputting the result
 * @author Stanislav
 */
public class test {

    /**
     * Method is responsible for outputting the result
     * @param args 
     */
    public static void main(String[] args) 
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Введите число: ");
     int n = sc.nextInt();
     sc.close();
     System.out.println(calculations.metod(n));
    }
    
}
