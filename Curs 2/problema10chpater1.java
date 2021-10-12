package devin;
import java.util.Scanner;
/**
 *
 * @author d22tny
 */

public class Devin {
     
    public static void main(String args[])
    {
        double km = 14;
        double miles = km * 0.62137;
        double seconds = 30*60 + 30;
        double mph = (miles * 3600) / seconds;
        System.out.println(mph);
    }
    
}

