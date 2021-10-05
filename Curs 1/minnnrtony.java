package devin;
import java.util.*;
/**
 *
 * @author d22tny
 */

public class Devin {

    public static void main(String[] args) {
        System.out.println("Introduceti n: ") ;
        Scanner theInput = new Scanner(System.in);
        int n = theInput.nextInt();
        System.out.println("Introduceti numarul: [a1]") ;
        int x = theInput.nextInt();
        int i = 1;
        int min = x;

        while (i<n) {
            i += 1;
            System.out.println("Introduceti numarul: [a" + i + "]") ;
            x = theInput.nextInt();
            if (min>x) {
                min = x;
            }
        }
        System.out.println("Numarul minim este " + min);
    }
    
}
