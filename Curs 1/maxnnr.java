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
        int i = 1;
        int[] a = new int[n+1];
        while (i<=n) {
            System.out.println("Introduceti numarul: [a" + i + "]") ;
            a[i] = theInput.nextInt();
            i += 1;
        }     
        
        i = 1;
        int max;
        max = a[1];
        while (i<=n) {
            if (max<a[i]) {
                max = a[i];
            }
            i += 1;
        }
        System.out.println("Numarul maxim este " + max);
    }
    
}
